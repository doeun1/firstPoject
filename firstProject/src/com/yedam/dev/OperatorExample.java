package com.yedam.dev;

public class OperatorExample {
	public static void main(String[] args) {
		int val1 = 10;
		int result = -3 + (8 - 5) * 4 + val1++;
		System.out.println(result);
		//나머지 계산
		result = 10 % 7;
		System.out.println("나머지 : " + result);
		//나누기 계산
		result = 10 / 7;
		System.out.println("나누기 : " + result);
		
		double r1 = 10 / 7;
		System.out.println("나누기2 : " + result);
//더하기 빼기 결과는 정수기준으로 나옴
		double r2 = 10 / 7.0;
		System.out.println("나누기3 : " + r2);
		//연산자양쪽으로 연산되어지는걸 피연산자라고 한다? 실수 = 정수 or 실수가 되어야 실수타입으로 나온다
		
		for(int i=1; i <=10; i++) {
			System.out.println(i);
			if(i % 2 == 1) {
				System.out.println(i +"는 홀수입니다.");// i/2 의 나머지가 1일때, i는 홀수 아닐시, i는 짝수
			}else {
				System.out.println(i +"는 짝수입니다.");//for문(반복문) + 조건문 같이 사용해보기 
			}
		}
	}
}
