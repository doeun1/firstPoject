package com.yedam.abstracts;

public class AnimalExample {

	public static void main(String[] args) {
//		Animal anm = new Animal();//추상클래스는 인스턴스를 생성불가(뉴 애니멀(); 안됨)
		Animal anm = new Cat();
		anm.breathe();
		anm.sound();//캣클래스에서 오버라이딩해서 구현함//sound기능이 반드시 가지고 있어야하는 기능
		
		anm = new Dog();
		anm.breathe();
		anm.sound();
		
		int a = 10;
		double b = a;//promotion
		a = (int) b;// 큰타입을 작은 타입에 넣을땐 변환해서 넣기//casting(강제로 형변환 시켜주는 것)
		
		Dog dog = (Dog) anm;//dog클래스에 anm을 담으려면 Dog형 변환 시켜주면 됨?//casting
		dog.sound();
	}

}
