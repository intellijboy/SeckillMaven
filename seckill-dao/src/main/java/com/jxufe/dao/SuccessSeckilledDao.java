package com.jxufe.dao;

import com.jxufe.entity.SuccessKilled;
import org.apache.ibatis.annotations.Param;
/**
 * Created by liuburu on 2016/10/20.
 */
public interface SuccessSeckilledDao {
    /**
     * 插入购买明细
     * @param seckillId
     * @param userPhone
     * @return
     */
    public int insertSuccessSeckilled(
            @Param("seckillId") int seckillId,
            @Param("userPhone") long userPhone
                                       );

    /**
     * 获取单个秒杀详情记录
     * @param seckillId
     * @return
     */
    public SuccessKilled getSuccessKillResult(
            @Param("seckillId") int seckillId,
            @Param("userPhone") long userPhone
    );

}
