package com.jxufe.dao;

import com.alibaba.fastjson.JSON;
import com.jxufe.entity.SuccessKilled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by liuburu on 2016/10/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:spring-dao.xml"})
public class SuccessSeckilledTest {
    @Autowired
    private SuccessSeckilledDao successSeckilledDao;
    @Test
    public void insertSuccessSeckilled() throws Exception {
        int reuslt = successSeckilledDao.insertSuccessSeckilled(2,15244445555L);
        System.out.println("result="+reuslt);
    }

    @Test
    public void getSuccessKillResult() throws Exception {
        SuccessKilled killed = successSeckilledDao.getSuccessKillResult(2,12345674444L);
        System.out.println("killed="+ JSON.toJSONString(killed));
    }

}