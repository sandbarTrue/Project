package com.im.project.manager;


import static org.junit.Assert.fail;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.im.project.model.User;
@SuppressWarnings("restriction")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-mybatis.xml" })
public class UserDaoTest {
	
	@Resource
    UserMapper userDao;
	@Test
	public void testInsertUser() {
		User u=new User();
		u.setPassword("123");
		u.setUserName("werrwe");
		int i=userDao.insert(u);
		if(i!=1){
		fail("Not yet implemented");
		}
	}
	}
	
	
