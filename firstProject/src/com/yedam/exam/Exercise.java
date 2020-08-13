package com.yedam.exam;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance =0;
		int input = 0;
		int output = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("--------------------------");
			System.out.println("선택> ");
			int menu = scanner.nextInt();//nextint-엔터칠대까지 기다리는 명령어
			
			if(menu == 1) {// 예금하겠다는 1번 명령
				System.out.println("예금 금액을 입력하세요");
				input = scanner.nextInt();
				balance = balance + input;

			} else if (menu == 2) { //출금
				System.out.println("출금금액을 입력하세요");
				output = scanner.nextInt();
				balance = balance - output;
			} else if (menu == 3) { // 잔고확인
				System.out.println("잔액은 " + (balance=input-output) + "입니다");//잔액은 입금-출금입니다
				
			} else if (menu == 4)
				run = false;
			
		}//while구문 중괄호
		System.out.println("프로그램 종료.");
	}//메인 메소드 중괄호

}//클래스 중괄호
