package com.yedam.test;

import java.util.Scanner;

public class GenderExample {
	public static void showGender(String str) {
		String[] sp = {"*","-","/"};
		String newStr = str;
		for(int i=0; i<sp.length; i++) {
			newStr = newStr.replace(sp[i],"");
			
		}
		System.out.println(newStr.charAt(6));
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
/*		boolean run = true;
		while(run) {
			System.out.println("주민번호를 입력하시오");
			String gd = scn.nextLine();
			char sex = gd.charAt(7);
			if(sex == '1' || sex == '3')
				System.out.println("남자입니다.");
			else if(sex == '2'|| sex == '4')
				System.out.println("여자입니다.");
			else
				run = false;
		}*/
		String str1 = "010102-345678";
		System.out.println(str1.replace("-", "").charAt(6));
		if(str1.replace("-", "").charAt(6)=='3') {
			System.out.println("남자");
		}
		
		String str2 = "010102345678";
		System.out.println(str2.replace("-","").charAt(6));
				
			
		
		
	}
}
