package com.yedam.oper;

public class InfinityExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 2;
		
		double z = x % y; // NAN, INFINITY 일 경우에는 유효한 값이 아닙니다라고 체크?
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("의미없는 값입니다.");
		} else {
			System.out.println(z);
		}
		
	
	}

}
