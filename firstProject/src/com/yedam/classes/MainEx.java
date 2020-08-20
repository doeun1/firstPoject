package com.yedam.classes;

class FinalClass {	
}
//class ExtendClass extends FinalCalss {
	
class ExString extends FinalClass {
	
}
public class MainEx {
	final int age = 10;
	

	public static void main(String[] args) {
/*		Friend friend = new Friend();
		friend.setAge(10);// friend.age = 10
		runInt(friend.getAge());
		runFriend(new Friend());
		
//		int var1 = "Hello"//인트타입 변수에 문자열을 넣으면 타입이 안맞아서 에러
	}
	public static void runFriend(Friend fr) {
		System.out.println(fr.toString());
	
	}
	public static void runInt(int a) {
		System.out.println(a);
	}*/
		Friend fr = new Friend(); // new라는 키워드의 인스턴스
		fr.getAge();//인스턴스 메소드
		
/*//		Calculator cal = new Calculator();
		Calculator.add(10,10); //정적메소드로 클래스 이름을 안만들어도 호출가능...?
*/
	
		final int val = 10;//final이 변수에 붙으면 값을 변환시킬수 X
//		val = 20;
		
		MainEx ex = new MainEx();
//		ex.age = 20;
	}
}
