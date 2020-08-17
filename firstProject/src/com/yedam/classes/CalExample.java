package com.yedam.classes;

public class CalExample {
	public static void main(String[] args) {
		
		Cal cal= new Cal();
//		cal.r = -5;//반지름이 -가 되면 의미 없는값?
		cal.setRadius(0);
//		System.out.println("반지름 : "+cal.getRadius()+"의 넓이는"+cal.getArea());
		
/*		System.out.println(10);//int 타입
		System.out.println(10.5);//double타입
		System.out.println("10");//문자 타입?*/

		print(200);
		print(200.0);
		print("200");
	}
	//메소드 오버로딩(동일한 메소드명을 사용 : 매개값의 타입이 다르거나 갯수가 다를때 사용)
	public static void print(int a) {
		System.out.println("입력값은 : "+ a);
	}
	public static void print(double a) {
		System.out.println("입력값은 : "+ a);
	}
	public static void print(String a) {
		System.out.println("입력값은 : "+ a);
	}
}
