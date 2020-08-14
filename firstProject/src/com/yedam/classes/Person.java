package com.yedam.classes;

public class Person {
//필드:객체의 데이터가 저장되는 곳
	String name;
	int age;
	//생성자 : 객체 생성시 초기화 역할
	public Person() {//매개값이 생성자를 기본생성자(default Constructor)
//		name="anonymous";
	//	age=10;
	}
	public Person(String name) {
		this.name = name;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String introduce() {
		return "이름은"+name+"나이는"+age;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name; //
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//메소드 : 객체의 동작에 해당하는 실행블록
}
