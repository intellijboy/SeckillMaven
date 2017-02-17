package com.jxufe.service;

import com.jxufe.exception.NoSuchSeckillException;
import com.jxufe.exception.SeckillExecuteResult;
import com.jxufe.exception.SeckillExposer;
import com.jxufe.entity.Seckill;

import java.util.List;

/**
 * 业务接口:站在使用者的角度设计接口
 * Created by liuburu on 2017/2/16.
 */
public interface ISeckillService {

    /**
     * 分页查询秒杀产品
     * @param pageNo
     * @param pageSize
     * @return
     */
    public List<Seckill>  getSeckillsByPage(int pageNo,int pageSize);

    /**
     * 单个查询秒杀产品
     * @param seckillId
     * @return
     */
    public Seckill getSeckill(int seckillId);


    /**
     * 暴露秒杀地址
     * @param seckillId
     * @return
     */
    public SeckillExposer exposeSeckill(int seckillId) throws NoSuchSeckillException;


    /**
     * 执行秒杀
     * 成功：返回秒杀产品记录  失败：返回失败原因
     * @param md5
     * @param userPhone
     * @return
     */
    public SeckillExecuteResult executeSeckill(int seckillId, String md5, Long userPhone);






}
