package com.yedam.classes;

public class Student {
	/*
	 * String name; int num; String major; public Student() {
	 * 
	 * } public Student(int num) { this.num = num; } public Student(int num, String
	 * name) { this.num = num; this.name = name; } public Student(int num, String
	 * name, String major) { this.num = num; this.name = name; this.major = major; }
	 * public int getnum() { return num;
	 * 
	 * } public String getname() { return name; } public String getmajor() { return
	 * major; }
	 */

	/*
	 * int studNo;//필드(속성) 값 String studName;// " String major;// "
	 * 
	 * public Student() {//생성자 초기값 } }
	 * 
	 * public void setStudNo(int studNo) {//메소드 (기능, 동작) this.studNo = studNo;
	 * 
	 * }
	 * 
	 * public int getStudNo() { return studNo; } public String getStudName() {
	 * return studName; }
	 * 
	 * public String getMajor() { return major; } }
	 */

	int num;
	String name;
	String major;

	public Student() {

	}

	public Student(int num) {
		this.num = num;
	}

	public Student(int num, String name) {
		this.num = num;
		this.name = name;
	}
	public Student(int num, String name, String major) {
		this.num = num;
		this.name = name;
		this.major = major;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}



	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", major=" + major + "]";
	}

/*	@Override
	public String toString() {
//	      return "Student [num=" + num + ", name=" + name + ", major=" + major + "]";
		return "학번은 " + num + ", 이름은 " + name + ", 전공은 " + major;
	}*/

	// 1. 필드 - 학번, 이름, 전공
	// 2. 기본생성자, 생성자(학번), 생성자(학번,이름), 생성자(학번,이름,전공)
	// 3. get 학번, 이름, 전공

}