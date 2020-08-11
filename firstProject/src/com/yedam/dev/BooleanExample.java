package com.yedam.dev;

public class BooleanExample {
	public static void main(String[] args) {
		long l1 = 10L;
		int i1 = 10;
		
		boolean trueOrFalse = false;//여긴 정수,문자 입력안됨 오직 true/false만 가능
		trueOrFalse = l1 != i1;//==의 의미는 ? 비교했을때 값이 같다ㅡ 반대의 경우 !=
		
		if (!trueOrFalse) {
			System.out.println("이 내용은 참일 경우에 출력됩니다.");
		}
		// >,<,>=,<= 크거나, 작거나, 크거나같다, 작거나 같다
		if (l1 >= i1) {
			System.out.println("왼쪽이 크거나 같습니다.");
		}
		
		System.out.println(trueOrFalse);
	}
}
