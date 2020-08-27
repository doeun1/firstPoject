package com.yedam.test;

class Math { // 기존에있던 매쓰클래스가 아니고 낵 ㅏ정의한 클래스, 기존 매쓰클래스 java.lang.Math
//	내가 정의한 매쓰클래스 com.yedam.test.Math
	public static int max(int a, int b) {
		int result = (a >= b) ? a : b;
		return result;
	}

	public static int min(int i, int j) {
		int result = (i <= j) ? i : j;
		return result;
	}

	public static double min(double i, double j) {
		return (i <= j) ? i : j;
	}

}

class Calculator {
	public static int sum(int[] ary) {
		int sum = 0;
		for (int i : ary) {// 배열에 든 갯수만큼 i를 반복하겠다
			sum += i;
		}
		return sum;
	}
}

public class NewExample {
	Member mem;// 필드 선언

	class Member {// 클래스 안에 클래스 만들기
		String id;// 필드

		Member(String id) {//
			this.id = id;
		}

		@Override
		public boolean equals(Object obj) {// equals메소드 호출, 매개값 : object obj
			if (obj instanceof Member) {
				Member mem= (Member) obj;//member타입의 
//				String str = (String) obj;// 매개값이 오브젝트라서 스트링타입으로
				return id.equals(mem.id);
				// TODO Auto-generated method stub
				// return super.equals(obj);
			} else {
				return false;
			}
		}
	}
//hash
	public void printMember() {
		Member m1 = new Member("hong");//

	}

	public static void main(String[] args) {
//		int numA = 10;//타입 변수이름 = 숫자 선언
//		String str = 10;//타입(문자열) 변수이름 = 숫자 선언 -> 에러 
//		String str = "10";
//		float f1 = 10.8f;//()
		int result = Math.min(39, 25);
		System.out.println(result);

		System.out.println(Math.min(24.6, 3.8));

		int[] ary = { 1, 2, 3, 4, 5 };
		System.out.println();
		NewExample ne = new NewExample();//
		Member m1 = ne.new Member("hong");// 클래스 안의 클래스는 new키워드를 서서 밖에 있는 클래스의 생성자를 만들어 주고 호출
		Member m2 = ne.new Member("park");
		System.out.println(m1.equals(m2));// 값 비교는 equals메소드
		

	}
}
