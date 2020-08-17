package com.yedam.test;

import java.util.Scanner;

public class ScannerAddress {
	public static void main(String[] args) {
		/* 1. 정보입력(이름, 나이, 전화번호)
		 * 2. 리스트
		 * (3). 이름조회
		 * (4). 이름조회 후 수정
		   9. 종료 */
		Friend[] friends = null;
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		//-여기까진 변수선언
		//메뉴출력
		while(run) {
			System.out.println("**************************************");
			System.out.println("1.정보입력(이름,나이,전화번호) 2.리스트 9.종료");
			System.out.println("**************************************");
			System.out.println("선택> ");
			int selectNo = scn.nextInt();scn.nextLine();
			if(selectNo == 1) {
				System.out.println("이름입력> ");
				String name = scn.nextLine();
				System.out.println("나이입력> ");
				int age = scn.nextInt();scn.nextLine();
				System.out.println("전화번호 입력> ");
				String phone = scn.nextLine();
				Friend f = new Friend(name, age, phone);
				//한건만 입력해야함
				for(int i=0; i < friends.length; i++) {
					if(friends[i] == null) {
						friends[i]=f;
						break;//for 반복문 탈출
					}
				}
			}else if(selectNo == 2) {
				for(Friend frnd:friends) {
					if(frnd != null) {
						System.out.println("이름 : "+frnd.getName()
						+", 나이: "+frnd.getAge()
						+", 전화번호 : "+frnd.getPhone());
						
					}
				}
			}else if(selectNo == 9) {
				
			}
		}
		System.out.println("프로그램 종료");//와일구문이 끝났을때 프로그램 종료를 알림
		
/*		Friend[] aray= new Friend[1];
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
		}*/
	}
}
