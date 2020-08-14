package com.yedam.classes;

public class Calculator {
	double pi = 3.14;
//더블 타입으로 pi라는 변수에 3.14라는 값을 지정
	
	
	public int add(int x, int y) {//add라는 메소드를 호출하면 int x,y를 반환
		int sum = 0;
		sum = x+y;
		return sum;
	}
	
	public double add(double x, double y) {
		return x+y;//바로 return을 해도 상관 x
	}
	public void getArea(double a) {//void는 리턴타입이 없음
		double result = pi*a*a;
		System.out.println("반지름"+a+"의 넓이는"+result);
	}
	//가로 , 세로 > 넓이를 반환해주는 메소드 (getRectagle)
	public int getRectangle(int i, int j) {
		int result = 0;
		result = i*j;
		return result;
	}
	public String getRectangle(double b, double c) {
		return "가로" + b +"세로"+ c +"의 넓이는" +getRectangle(b,c)+"입니다.";
	}
}
