package com.yc.ums.entity;

public class SysUser {
	private Integer id;
	private String name;
	private String birthday;
	private String gender;
	private String career;
	private String address;
	private String mobile;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "\nSysUser [id=" + id + ", name=" + name + ", birthday=" + birthday + ", gender=" + gender + ", career=" + career + ", address=" + address + ", mobile=" + mobile + "]";
	}
}
