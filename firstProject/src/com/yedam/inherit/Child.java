package com.yedam.inherit;

public class Child extends Parent{
	private int grade;
	
	public Child(String name, int age) {//기본생성자 생성
		super(name, age);
	}
	
	public Child(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	

	
	
}
