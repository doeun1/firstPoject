package com.yedam.oper;

public class StringEqualExample {

	public static void main(String[] args) {
		int v1 = 20;
		int v2 = 30;
		if(v1 == v2) {
			System.out.println("기본타입 일 경우 비교..");
		}

		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		
		if(str1 == str2) {
			System.out.println("str1, str2는 같은 문자입니다.");//같은 문자열 창조일 경우 비교연산자 '=='사용
		}
		
		if(str1.equals(str3)) {
			System.out.println("str1, str3는 같은 문자입니다.");
		}//str1 과 str3는 다른 문자 창조 클래스일 경우는 비교연산자가 아닌 '.equals'라는 메소드를 사용????

		System.out.println((1 == 1) && (2==3));
	}


}

