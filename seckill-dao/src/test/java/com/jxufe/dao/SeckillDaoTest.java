package com.jxufe.dao;

import com.alibaba.fastjson.JSON;
import com.jxufe.entity.Seckill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by liuburu on 2016/10/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-dao.xml"})
public class SeckillDaoTest {
    @Autowired
    private SeckillDao seckillDao;

    @Test
    public void updateSeckillStore() throws Exception {
        int result = seckillDao.updateSeckillStore(2);
        System.out.println("result="+result);
    }

    @Test
    public void getSeckill() throws Exception {
        int seckillId = 7;
        Seckill seckill = seckillDao.getSeckill(seckillId);
        System.out.println("seckill=" + JSON.toJSON(seckill));
    }

    @Test
    public void getAllSeckillsByPage() throws Exception {
        List<Seckill> seckills = seckillDao.getAllSeckillsByPage(1-1,8);
        for (Seckill seckill:seckills){
            System.out.println(JSON.toJSONString(seckill));
        }
    }

    @Test
    public void insertSeckill() {
        Seckill seckill = new Seckill();
        seckill.setName("测试数据");
        seckill.setStartTime(new Date());
        seckill.setEndTime(new Date());
        int result = seckillDao.insertSeckill(seckill);
        System.out.println("影响结果集:"+result);
        System.out.println("返回ID="+seckill.getSeckillId());
    }


}