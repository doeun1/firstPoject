package com.yedam.dev;

public class MorningCode13 {

	public static void main(String[] args) {
		
		int num = 0;
		for(int i = 0; i<10; i++) {
			if(i%2 !=0)
				continue;
			
			System.out.println(i);
		}
		
		
		int n=5;
		while(true) {
			if (n++==5)
				break;
			else if (n==3)
				continue;
			
			System.out.println("프로그램 진행중,,,");
		}
		
		int i = 0;
		int j = 0;
		while(j<10) {//
			while(i<10) {
				i++;
			}//이 시점에 i=10
		}
		int sum = 0;
		for(int k=0; k<10; k++) {//for
			sum = sum + k; // sum += i;
			System.out.println(i);
		}
		
		int score = 90; //정수 score는 90이다.
		if (score >= 90) {//if문 조건은 (안에) 출력은 {안에}//스코어가 90이상일때
			if(score > 95)//if문안에 if 사용가능
			System.out.println("90이상입니다.");//90이상입니다. 출력
		} /*else {
			System.out.println("90미만입니다.");//아니면 90미만입니다.
		}*/ else if (score >= 80) {
			System.out.println("80이상입니다.");
		} else {
			System.out.println("80미만입니다.");
		}
	}

}
