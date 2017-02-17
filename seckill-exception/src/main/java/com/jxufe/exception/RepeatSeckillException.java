package com.jxufe.exception;

/**
 * Created by liuburu on 2017/2/17.
 */
public class RepeatSeckillException extends SeckillException{
    public RepeatSeckillException(String message) {
        super(message);
    }

    public RepeatSeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
