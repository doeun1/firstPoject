package com.yedam.inherit;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child("홍길동", 15, 10);
		child.getName();//부모 parent 클래스 getName()
		child.getAge();//부모parent클래스 getAge()
		child.getGrade();// 자식child클래스 getGrade()
		
		Parent parent = new Child("김유신", 20,20);
		parent.getName();
		parent.getAge();
//		parent.getGrade();//자식 클래스가 가지고 있는 getgrade는 부모클래스에서 호출안됨
	
		Vehicle v1 = new Taxi();
//		v1.run();
		v1 = new Bus();
//		v1.run();
		
		Driver driver = new Driver();
		driver.drive(new Taxi());
		driver.drive(new Bus());
		
		Parent parent1 = new Parent();
		System.out.println(parent1.toString());
	}//매개값이 어떤 인스턴스로 들어오냐에 따라 run/drive인수로 결과값이 달라진다??
}
