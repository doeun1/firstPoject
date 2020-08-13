package com.yedam.exam;

public class Exercise03 {
	public static void main(String[] args) {
	
		int sum =0;
	
		for(int i=0;i<100; i++) {
			if(i%3==0) //if문이 한줄일경우엔 중괄호 없애도 됨
				sum = sum + i ;
						
			System.out.println("3의 배수의 합 :" + sum);
		}
	}
}
