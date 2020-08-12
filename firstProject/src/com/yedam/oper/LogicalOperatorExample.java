package com.yedam.oper;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A'; // A = 65
		if(charCode >= 65 && charCode <= 90) {//왼쪽에 있는 값이 정수타입이 아닌경우 ...?
			System.out.println("대문자입니다.");//& 하나인경우 둘중 하나가 false인 경우라도 나머지 하나도 체크함
											//&&두개인경우 양쪽중 하나가 false인경우 나머지 체크안함
		}
		int num1 = 10;
		int num2 = 20;
		if(num1++ < 10 && num2++ > 20) {//num1++가 10보다 작을때, num2++값이 20보다 클때(&& : and개념/ || : or 개념)  
			System.out.println("참입니다.");//둘중 하나라도 false뜨면 값x
		}
		System.out.println(num1 + ", " + num2);
		
		int a = 10, b = 11;
		int result = a|b;//|:곱하기
		System.out.println("논리곱결과 : " + result);
		
		result = a >> 2;
		System.out.println("비트이동 결과 : " + result);
		
		result = 30 << 3;
		System.out.println("비트이동 결과 : " + result);//30을 이진수로 변경후 왼쪽으로 3칸이동
													//00011110->11110000
		result +=30;//복합대입연산자 : result = result +30;
		
		result = 80;
		boolean pass = false;
		if(result >= 80) {
			pass = true;
		}else {
			pass = false;
		}
		pass = (result >= 80) ? true : false;
	}
}
