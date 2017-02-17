package com.jxufe.exception;

import java.util.Date;

/**
 * 商品秒杀地址暴露对象
 * Created by liuburu on 2017/2/17.
 */
public class SeckillExposer {
    private int seckillId;      //秒杀商品ID
    private boolean isExposed;  //是否暴露标志
    private String md5Url;      //秒杀加密地址
    private Date beginTime;     //秒杀开启时间
    private Date endTime;       //秒杀结束时间
    private Date now;           //秒杀当前时间

    /**
     * 秒杀开始时的构造函数
     * @param seckillId
     * @param isExposed
     * @param md5Url
     */
    public SeckillExposer(int seckillId, boolean isExposed, String md5Url) {
        this.seckillId = seckillId;
        this.isExposed = isExposed;
        this.md5Url = md5Url;
    }

    /**
     * 秒杀时间还没到时的构造函数
     * @param seckillId
     * @param isExposed
     * @param beginTime
     * @param endTime
     * @param now
     */
    public SeckillExposer(int seckillId, boolean isExposed, Date beginTime, Date endTime, Date now) {
        this.seckillId = seckillId;
        this.isExposed = isExposed;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.now = now;
    }



    public int getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(int seckillId) {
        this.seckillId = seckillId;
    }

    public boolean isExposed() {
        return isExposed;
    }

    public void setExposed(boolean exposed) {
        isExposed = exposed;
    }

    public String getMd5Url() {
        return md5Url;
    }

    public void setMd5Url(String md5Url) {
        this.md5Url = md5Url;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }
}
