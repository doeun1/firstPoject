package com.yedam.test;

public class Person extends Object {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public int hashCode() {
		return this.age;// TODO Auto-generated method stub
//		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {//해쉬코드란 이퀄즈? 
		Person p = (Person) obj;
		return this.name.equals(p.name);//문자 비교시 equals사용 , 숫자는 ==
//		return super.equals(obj);
	}

}
