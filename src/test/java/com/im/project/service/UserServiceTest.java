package com.im.project.service;

import static org.junit.Assert.fail;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.im.project.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-mybatis.xml" })
public class UserServiceTest{
	@Resource
	
	private UserService userService;
	@Test
	public void  testSave(){
		User u=new User();
		u.setPassword("123");
		u.setUserName("werrwe");
		int i=userService.save(u);
		if(i!=1){
		fail("Not yet implemented");
		}
	}

	
	
}