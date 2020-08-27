package com.yedam.test;

public class NewExample2 {
	public static void main(String[] args) {
		nvl(null, "초기값"); // => " 초기값"
		nvl("입력값", "초기값"); // => "입력값"

	}

	public static void nvl(String str2, String defaultValue) {
		if (str2 == null)
			System.out.println("초기값");
		else
			System.out.println("입력값");
	}
}
