package com.yc.ums.service;

import java.util.List;

import com.yc.ums.entity.SysUser;
import com.yc.ums.entity.UserBean;

public interface UserService {

	List<SysUser> listUser();

	boolean modifyUser(SysUser su);

	UserBean listPaginationUser(String page, String size);

}
