package com.yedam.generic;

import com.yedam.classes.Person;

public class BoxExample {
	public static void main(String[] args) {
		/*
		 * Box box = new Box(); String str1 = new String ("Hello"); box.set(str1);
		 * String result = (String)box.get();//겟메소드 //String 타입변수로 강제 변환//Object타입
		 * 
		 * Person p1 = new Person();//패키지가 달라서 임포트 함 box.set(p1); Person p2 = (Person)
		 * box.get();
		 * 
		 * result = (String) box.get();//runtime error.실행시점에 에러남
		 * 
		 */
		Box<String> box = new Box<String>();

		box.set(new String("Hello"));
		String result = box.get();

		Box<Person> box2 = new Box<>();
		box2.set(new Person());
		Person p1 = box2.get();

		Box<Person> box3 = Utils.boxing(new Person());

		Box<String> box4 = Utils.boxing(new String("hhh"));

	}
}