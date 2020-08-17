package com.yedam.classes.statics;

public class Singleton {//여러개의 인스턴스가 필요없고 하나만 필요할때 static사용 
	private static Singleton singleton = new Singleton();
	//클래스에 제한시키겠다는 의미?
	private Singleton() {
		//외부 클래스에서,,,,?
	}
	public Singleton getInstance() {//getinstance라는 메소드를 통해서만 생성?
		return singleton;
	}
}
