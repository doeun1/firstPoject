package com.yedam.dev;

public class IntExample {
	public static void main(String[] args) {
		int var1 = 10; // 10진수 10으로 표현;
		int var2 = 012; // 앞자리가 0으로 시작하면 8진수 12 => 10
		int var3 = 0xA; // x가 들어가면 16진수 A => 10
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		byte b1 = 10;
		int result = (byte) (b1 + 10);
	}
}
