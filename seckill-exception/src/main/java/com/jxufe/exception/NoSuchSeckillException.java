package com.jxufe.exception;

/**
 * 暴露秒杀接口时，未发现目标暴露商品异常
 * Created by liuburu on 2017/2/17.
 */
public class NoSuchSeckillException extends SeckillException {
    public NoSuchSeckillException(String message) {
        super(message);
    }

    public NoSuchSeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
