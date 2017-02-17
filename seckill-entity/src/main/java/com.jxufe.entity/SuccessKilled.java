package com.jxufe.entity;
import java.util.Date;

/**
 * Created by liuburu on 2016/10/20.
 */
public class SuccessKilled {
    private int seckillId;//秒杀产品id
    private Long userPhone;//用户手机
    private int status;//支付转态
    private Date createTime;//订单创建时间

    public SuccessKilled() {
    }

    public int getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(int seckillId) {
        this.seckillId = seckillId;
    }

    public Long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Long userPhone) {
        this.userPhone = userPhone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
