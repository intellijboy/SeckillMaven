package com.jxufe.exception;

/**
 * 秒杀相关的枚举常量
 * Created by liuburu on 2017/2/17.
 */
public enum SeckillEnums {

    SUCCESS(1,"Seckill success!"),      //秒杀成功
    END(0,"Seckill ended!"),            //秒杀结束
    REPEAT_KILL(-1,"Seckill repeated!"), //重复秒杀
    INNER_ERROR(-2,"Data tampered!"),   //数据篡改
    DATA_REWRITE(-3,"System error!");   //系统异常

    private int stateNum;
    private String stateInfo;

    SeckillEnums(int stateNum, String stateInfo) {
        this.stateNum = stateNum;
        this.stateInfo = stateInfo;
    }

    public int getStateNum() {
        return stateNum;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public SeckillEnums stateOf(int stateNum){
        for (SeckillEnums skEnum : values()){
            if(skEnum.getStateNum()==stateNum){
                return skEnum;
            }
        }
        return null;
    }

}
