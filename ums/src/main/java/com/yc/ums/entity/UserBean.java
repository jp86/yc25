package com.yc.ums.entity;

import java.util.List;

public class UserBean {
	//分页接收参数
	private Integer pageSize;
	private Integer currPage;
	
	//响应给页面的
	private Integer total;
	private List<SysUser> rows;
	
	public UserBean() {
	}

	public UserBean(Integer pageSize, Integer currPage) {
		this.pageSize = pageSize;
		this.currPage = currPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrPage() {
		return currPage;
	}

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<SysUser> getRows() {
		return rows;
	}

	public void setRows(List<SysUser> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "UserBean [pageSize=" + pageSize + ", currPage=" + currPage + ", total=" + total + ", rows=" + rows + "]";
	}
	
}
