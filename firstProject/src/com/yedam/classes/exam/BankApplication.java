package com.yedam.classes.exam;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("************************************");
			System.out.println("1. 계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.println("************************************");
			System.out.println("선택 > ");

			int cho = scn.nextInt();scn.nextLine();

			if (cho == 1) {
				createAccount();

			} else if (cho == 2)
				accountList();

			/*
			 * else if (cho == 3) { deposit(); } else if(cho == 4) { withdraw(); }
			 */ else if (cho == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}

	private static void createAccount() {
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");

		System.out.println("계좌번호 :");
		String ano = scn.nextLine();
		System.out.println("계좌주 : ");
		String owner = scn.nextLine();
		System.out.println("초기 입금액 : ");
		int balance = scn.nextInt();
		scn.nextLine();
		System.out.print("결과 : 계좌가 생성되었습니다.");
		Account a = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = a;
				break;
			}

		}
	}

	private static void accountList() {
		System.out.println("계좌목록");
		for (Account acary : accountArray) {
			if (acary != null) {
				System.out.println(acary.getAno() + acary.getOwner() + acary.getBalance());
			}
		}

	}
	private static void deposit() {
		
	} 
	private static Account findAccount(String ano) {//배열의 여러건들이 들어가 있음
		   
	      Account md = null;
	      
	      for(int i=0;i<accountArray.length;i++) {
	         if(accountArray[i].getAno().equals(ano) && accountArray[i] !=null) {
	            md = accountArray[i];
	         }
	                  
	      }
	      
	      return md; 
	      
	      
	   }
}