package com.jxufe.service;

import org.junit.Test;
import org.springframework.util.DigestUtils;

/**
 * Created by liuburu on 2017/2/16.
 */
public class TestGetMD5 {
    private static String slat = "%^&(&^&*&*&&";
    //生成并返回一个md5
    private static String getMD5(int seckillId){
        String base = seckillId+"/"+slat;
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
        return md5;
    }

    @Test
    public void getGetMD5(){
        System.out.println(getMD5(8825));
        System.out.println(getMD5(8825));
    }

    @Test
    public void getLongType(){
    Long userPhone = 18702604850l;
        System.out.println(userPhone+2);
    }

    @Test
    public void testException(){

    }

    public static String getName(int p) throws Exception{
        if(p>0){
            return "yes";
        }else{
            throw new Exception("自定义异常");
          //  return "no no no !";
        }
    }


}
