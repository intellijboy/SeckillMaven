package com.jxufe.demo;

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtostuffIOUtil;
import com.dyuproject.protostuff.runtime.RuntimeSchema;

public class AppleGoogleSerializeUtil {
    private static RuntimeSchema<Apple> schema = RuntimeSchema.createFrom(Apple.class);
    /**
     * 序列化对象
     * @param apple
     * @return
     */
    public static byte[] serialize(Apple apple) {
        byte[] bytes = ProtostuffIOUtil.toByteArray(apple, schema, LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));
        return bytes;
    }

    /**
     * 反序列化对象
     * @param bytes
     * @return
     */
    public static Apple unserialize(byte[] bytes) {
        Apple apple = schema.newMessage();   //空对象
        ProtostuffIOUtil.mergeFrom(bytes,apple,schema);   //seckill被反序列
        return apple;
    }


}