package com.jxufe.exception;

/**
 * Created by liuburu on 2017/2/17.
 */
public class URLRewriteException extends SeckillException {
    public URLRewriteException(String message) {
        super(message);
    }

    public URLRewriteException(String message, Throwable cause) {
        super(message, cause);
    }
}
