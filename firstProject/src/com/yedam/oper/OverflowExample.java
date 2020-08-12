package com.yedam.oper;

public class OverflowExample {
	public static void main(String[] args) {
//		System.out.println(Integer.MAX_VALUE);//결과값 : 2147483647
//		System.out.println(Integer.MIN_VALUE);//결과값 : -2147483648
		int result=safeAdd(-2147483648,-10);
		System.out.println(result);
	}
	
	public static int safeAdd(int a, int b) {
		int sum= a+b;
		if((Integer.MAX_VALUE - b) < a) {//안의 괄호는 없어도 됨. 있는게 더 안전
			System.out.println("유효값이 아닙니다.");
			sum = 0;
		} else if ((Integer.MIN_VALUE - b) > a ) {
			System.out.println("유효값이 아닙니다.");
			sum = 0;
		}
		else {
			sum = a + b;
		}
		return sum;
		
	}

}
