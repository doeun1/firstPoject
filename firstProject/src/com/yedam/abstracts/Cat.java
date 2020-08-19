package com.yedam.abstracts;

public class Cat extends Animal {//캣 클래스는 애니멀이라는 클래스를 상속받음(에러뜸)

	@Override
	public void sound() {//캣은 애니멀에 있는 사운드를 오버라이딩함
		System.out.println("야옹양옹");
	}

}
