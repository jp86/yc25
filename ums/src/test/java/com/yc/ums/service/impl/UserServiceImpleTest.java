package com.yc.ums.service.impl;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import com.yc.ums.entity.SysUser;
import com.yc.ums.entity.UserBean;
import com.yc.ums.service.UserService;

public class UserServiceImpleTest {

	@Test
	public void testListUser() {
		UserService us = new UserServiceImpl();
		List<SysUser> users = us.listUser();
		System.out.println(users);
		assertNotNull(users);
	}
	
	@Test
	public void testListPaginationUser(){
		UserService us = new UserServiceImpl();
		UserBean ub = us.listPaginationUser(null, null);
		System.out.println(ub);
		assertNotNull(ub);
	}

}
