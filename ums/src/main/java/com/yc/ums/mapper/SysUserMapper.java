package com.yc.ums.mapper;

import java.util.List;

import com.yc.ums.entity.SysUser;
import com.yc.ums.entity.UserBean;

public interface SysUserMapper {

	List<SysUser> getAllUser();

	int updateUser(SysUser su);

	UserBean getPartUser(UserBean ub);

}
