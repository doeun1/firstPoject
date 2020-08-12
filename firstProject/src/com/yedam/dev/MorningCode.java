package com.yedam.dev;

public class MorningCode {
	public static void main(String[] args) {// 메인 메소드는 해당된 클래스를 호출하면 제일먼저 나오는 메소드로 메인을 실행
		String str1 = "Hello";
		String str2 = "World";
		String name = "김도은";
		System.out.println(str1 + "," + name);//문자열일 경우 +연산자가 왼쪽을 연결해줌?
		
		int v1 = 150, v2 = 270;
		int result = add(v1, v2);
		System.out.println("결과값 : " + result);
		
		introduce("김도은");//넘겨줄 값이 없기 때문에 int type을 추가 하면 에러뜸
		
		result = minus(v1, v2);
		System.out.println("결과는" + result);
	}
	
	public static int minus(int v1, int v2) {//void는 반환형이 없는것, int는 반환값이 있는 것
		return v1-v2;
	}
	
	public static void introduce(String name) {
		System.out.println("안녕하세요, 저는" + name + "입니다.");
	}
	
	public static int add(int x, int y) {//'add'란 method / 정수형 타입 2개를 add란 메소드로 int타입으로 리턴해주겠다????
		int sum = x + y;
		return sum;
	}
}
