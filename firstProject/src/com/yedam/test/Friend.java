package com.yedam.test;

/*public class Friend {
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
	
}*/
//필드
public class Friend {
	private String name;
	private int age;
	private String phone;
//생성자
	public Friend(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
//메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}	