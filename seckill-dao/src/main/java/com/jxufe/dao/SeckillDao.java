package com.jxufe.dao;

import com.jxufe.entity.Seckill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by liuburu on 2016/10/20.
 */
public interface SeckillDao {

    /**
     * 减少库存
     * @param seckillId
     * @return
     */
    public int updateSeckillStore(@Param("seckillId") int seckillId);

    /**
     * 查询单个秒杀产品
     * @param seckillId
     * @return
     */
    public Seckill getSeckill(@Param("seckillId") int seckillId);

    /**
     * 分页获取的秒杀产品
     * @return
     */
    public List<Seckill> getAllSeckillsByPage(
            @Param("begin") int begin,
            @Param("offset") int offset);

    /**
     * 插入库存倒产品列表
     * @param seckill
     * @return
     */
    public int insertSeckill(Seckill seckill);

}
