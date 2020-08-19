package com.yedam.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
//		String str = null;
		String str = "Hello";

		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("Null 값을 참조하고 있습니다.");
		} catch (Exception e1) {
			System.out.println("알 수 없는 예외 발생했습니다");// try, catch가 뭔데?
		}

		int[] intAry = new int[5];
		for (int i = 0; i <= 5; i++) {
			try {
				System.out.println("i의 값 : " + intAry[i]);// 예외발생?
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 범위를 초과했습니다");
				System.out.println();
			}
		}
		
		
		Scanner scn= new Scanner(System.in);
		System.out.println("숫자입력");
		int menu =0;
		try {
			 menu= scn.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("숫자로 입력하기");
			scn.nextLine();
			
		}
		
		System.out.println("정상종료.");
	}

}
