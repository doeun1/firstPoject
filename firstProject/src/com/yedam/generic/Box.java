package com.yedam.generic;

public class Box<T> {// 박스라는 클래스에 필드가 오브젝트선언//<>안에 타입에 따라 선언 타입이 따라감?
	// <> : 사용할 시점의 타입을 정하는 파라메타?
//	private Object obj;//최상위 클래스는 오브젝트
	private T obj;

//	public void set(Object obj) {//셋이라는 메소드에 오브젝트를 담음
	public void set(T obj) {
		this.obj = obj;

	}

//	public Object get() {//겟이라는 메소드에 오브젝트를 반환
	public T get() {//
		return this.obj;

	}
}
