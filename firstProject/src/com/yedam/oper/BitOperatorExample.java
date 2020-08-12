package com.yedam.oper;

public class BitOperatorExample {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;//v2는 비트를 반영시키는 결과값?
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + v2);//결과값으로 -11이 나옴
		System.out.println("v2+1 : " + (v2+1));
		
		byte b1 = 10;
		byte b2 = 5;
		int b3 = b1 + b2;//int형 연산자를 기준으로 계산하기 때문에 byte = b1+b2하면 오류뜸->고로 int = b1+b2로 해야됨
		
//		int result = 10/4;// 2.5라고 생각할수 있지만 연산결과값이 int(정수)이기 때문에 에러뜸-> 소수점도 허용되는 실수연산자로 결과값내야함
		double result = 10/4.0; 
		System.out.println(result);
	}

}
