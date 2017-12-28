package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootdemoApplicationTests {
	  @Autowired
	    private StringRedisTemplate stringRedisTemplate;

	    @Test
	    public void save(){

	        stringRedisTemplate.opsForValue().set("zzp","big z");
	        Assert.assertEquals("big z",stringRedisTemplate.opsForValue().get("zzp"));
	    }

}
