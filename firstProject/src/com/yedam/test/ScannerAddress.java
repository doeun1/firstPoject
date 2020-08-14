package com.yedam.test;

import java.util.Scanner;

public class ScannerAddress {
	public static void main(String[] args) {
		Friend[] aray= new Friend[1];
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		String name=null;
		int age = 0;
		String num=null;

		while (run) {
			System.out.println("1.정보입력 2.리스트 3.이름조회  4.조회 후 수정 9.종료");
			System.out.println(" ");
			
			int selectNo = scn.nextInt();
			scn.nextLine();
			
			if (selectNo == 1) {
				for(int i =0; i<aray.length; i++) {
				System.out.println("정보입력");
				System.out.println("이름");
				name = scn.nextLine();
				System.out.println(" 나이 " );
				age = scn.nextInt();
				scn.nextLine();
				System.out.println("전화번호");
				num = scn.nextLine();
				
				Friend f1 = new Friend(name,age,num);
				aray[i] = f1;
				
				}
			} 
			else if (selectNo == 2) {
				for(Friend s : aray) {
					System.out.println(s.toString());
				}
			} 
			else if (selectNo == 9) {
				run = false;
			}
		}
	}
}
