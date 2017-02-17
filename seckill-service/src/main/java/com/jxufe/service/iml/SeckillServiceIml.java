package com.jxufe.service.iml;

import com.jxufe.dao.SeckillDao;
import com.jxufe.dao.SuccessSeckilledDao;
import com.jxufe.entity.Seckill;
import com.jxufe.exception.*;
import com.jxufe.service.ISeckillService;
import com.jxufe.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by liuburu on 2017/2/17.
 */
@Service
public class SeckillServiceIml implements ISeckillService {

    @Autowired
    private SeckillDao seckillDao;

    @Autowired
    private SuccessSeckilledDao successSeckilledDao;

    /**
     * 分页秒杀产品查询
     *
     * @param pageNo
     * @param pageSize
     * @return
     */
    public List<Seckill> getSeckillsByPage(int pageNo, int pageSize) {
        int begin = pageNo - 1;
        return seckillDao.getAllSeckillsByPage(begin, pageSize);
    }

    /**
     * 获取单个秒杀产品
     *
     * @param seckillId
     * @return
     */
    public Seckill getSeckill(int seckillId) {
        return seckillDao.getSeckill(seckillId);
    }

    /**
     * 暴露产品秒杀地址
     *
     * @param seckillId
     * @return
     */
    public SeckillExposer exposeSeckill(int seckillId) throws NoSuchSeckillException {
        Seckill seckill = seckillDao.getSeckill(seckillId);
        if (seckill == null) {
            throw new NoSuchSeckillException("No Such Seckill Object");
        }
        Date now = new Date();
        if (now.after(seckill.getEndTime())) {//秒杀结束，给出时间提示
            return new SeckillExposer(seckillId, false, seckill.getStartTime(), seckill.getEndTime(), now);
        } else if (now.before(seckill.getStartTime())) {//秒杀还未开始，给出时间提示
            return new SeckillExposer(seckillId, false, seckill.getStartTime(), seckill.getEndTime(), now);
        } else {//秒杀开始，暴露秒杀地址
            String md5URL = MD5Utils.toMD5Code(seckillId);
            return new SeckillExposer(seckillId, true, md5URL);
        }
    }

    /**
     * 执行秒杀
     * 0.检查请求地址是否合法
     * 1.登记秒杀记录详情
     * 2.减少库存
     *
     * @param seckillId
     * @param md5
     * @param userPhone
     * @return
     */
    public SeckillExecuteResult executeSeckill(int seckillId, String md5, Long userPhone) {
        if (!MD5Utils.toMD5Code(seckillId).equals(md5)) {
            throw new URLRewriteException("秒杀地址被串改!");
        }

        try {
            int rowCount = successSeckilledDao.insertSuccessSeckilled(seckillId, userPhone);
            if (rowCount == 0) {//重复秒杀，抛出重复秒杀异常
                throw  new RepeatSeckillException("重复秒杀");
            } else (rowCount == 1){//秒杀成功，返回秒杀产品记录
                return new SeckillExecuteResult();
            }
        } catch (Exception e) {

        }
        return null;
    }


}
