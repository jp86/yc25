package com.yc.ums.web.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yc.ums.entity.SysUser;
import com.yc.ums.entity.UserBean;
import com.yc.ums.service.UserService;
import com.yc.ums.service.impl.UserServiceImpl;
import com.yc.ums.util.ServletUtil;

@WebServlet("/user/*")
public class UserServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	private UserService us;  //用户业务处理
	
	public UserServlet() {
		us = new UserServiceImpl();  //用户业务处理
	}
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String reqName = ServletUtil.getUriName(request.getRequestURI());
		System.out.println("进入UserServlet中， 进行" + reqName + "请求处理 ...");
		switch(reqName){
		case "list":
			doList(request, response);
			break;
		case "modify":
			doModify(request, response);
			break;
		default:
			respOutStr(response, "<h1><span style='color:red; font-size:50px'>404!!!</span>未找到请求资源</h1>");	
		}
		
	}

	private void doModify(HttpServletRequest request, HttpServletResponse response) throws IOException {
		SysUser su = getReqParam2Obj(request, SysUser.class);
		System.out.println("取到的参数对象 ==>" + su);
		boolean result = us.modifyUser(su);
		respOutStr(response, toJsonStr(result));
	}

	private void doList(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String page = request.getParameter("page");
		String size = request.getParameter("rows");
		//List<SysUser> users = us.listUser();
		UserBean userBean = us.listPaginationUser(page, size);
		respOutStr(response, toJsonStr(userBean));
	}
}
