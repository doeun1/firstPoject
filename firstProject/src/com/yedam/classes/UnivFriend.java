package com.yedam.classes;

public class UnivFriend extends Friend {
	private String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "학교친구 이름: " + this.getName() + ", 연락처: " + this.getPhone() + ", 전공명: " + this.major;
	}

}
