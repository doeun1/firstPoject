package com.yedam.abstracts;

public abstract class Animal {//추상메소드는 애니멀이라는 클래스를 상속받는,,,,,뭐가 생기면 기능생김
	private String species;
	public Animal() {
		
	}
	public void showInfo() {
		System.out.println("분류는 " + species);
	}
	public void breathe() {
		System.out.println("숨을 쉰다.");//메소드 구현하는 부분
	}
	public abstract void sound();//추상메소드는 기능이 안정해짐?//사운드는 구현하는 구분이 없음(애니멀클래스에서 ,,,
}
