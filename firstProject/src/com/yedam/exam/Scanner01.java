package com.yedam.exam;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if(a>b) {
			if(b<c) 
				System.out.println(a+","+c+","+b);
			else 
				System.out.println(a+","+b+","+c);
			
		} else if(a>c) {
			
			if(c>b)
				System.out.println(a+","+c+","+b);
			else
				System.out.println();
		}
	}

}
