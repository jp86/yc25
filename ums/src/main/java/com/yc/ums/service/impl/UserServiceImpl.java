package com.yc.ums.service.impl;

import java.util.List;

import com.yc.ums.entity.SysUser;
import com.yc.ums.entity.UserBean;
import com.yc.ums.mapper.SysUserMapper;
import com.yc.ums.service.UserService;
import com.yc.ums.util.MyBatisUtil;

public class UserServiceImpl implements UserService {
	private SysUserMapper um;
	
	public UserServiceImpl() {
		um = MyBatisUtil.getAutoTransSession().getMapper(SysUserMapper.class);
	}

	@Override
	public List<SysUser> listUser() {
		return um.getAllUser();
	}

	@Override
	public boolean modifyUser(SysUser su) {
		return um.updateUser(su) > 0;
	}

	@Override
	public UserBean listPaginationUser(String page, String size) {
		int currPage = 1;
		int pageSize = 10;
		if(size != null){
			pageSize = Integer.parseInt(size);
		}
		
		if(page != null){
			currPage = Integer.parseInt(page);
		}
		
		UserBean ub = new UserBean(pageSize, currPage);
		return um.getPartUser(ub);
	}

}
