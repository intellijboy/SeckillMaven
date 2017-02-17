package com.jxufe.entity;

import java.util.Date;

/**
 * Created by liuburu on 2016/10/20.
 */
public class Seckill {
    private int seckillId;//秒杀产品ID
    private String name;//商品名称
    private int number;//数量
    private Date startTime;//秒杀开启时间
    private Date endTime;//秒杀结束时间
    private Date createTime;//秒杀创建时间
    public Seckill() {
    }

    public int getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(int seckillId) {
        this.seckillId = seckillId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
