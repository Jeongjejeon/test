package com.kg.myapp.vo;

import java.util.Arrays;

public class MemberVO {
	
	private String userid;
	private String password;
	private String name;
	private String tel;
	private byte[] picture;
	private long picturesize;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public byte[] getPicture() {
		return picture;
	}
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	public long getPicturesize() {
		return picturesize;
	}
	public void setPicturesize(long picturesize) {
		this.picturesize = picturesize;
	}
	@Override
	public String toString() {
		return "MemberVO [userid=" + userid + ", password=" + password + ", name=" + name + ", tel=" + tel
				+ ", picture=" + Arrays.toString(picture) + ", picture_size=" + picturesize + "]";
	}
	
	

}
