package com.yedam.test;

public class Friend {
	String name;
	int age;
	String num;

	public Friend() {
		
	}
	public Friend(String name) {
		this.name = name;
	}
	public Friend(String name, int age) {
		this.name = name;
		this.age = age;
	
	}
	public Friend(String name, int age, String num) {
		this.name = name;
		this.age = age;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getNum() {
		return num;
	}
	@Override
	public String toString() {
		return "리스트 [이름=" + name + ", 나이=" + age + ", 전화번호=" + num + "]";
	}//저장위치만 출력된 값의 리스트를 부를때?
	
}
