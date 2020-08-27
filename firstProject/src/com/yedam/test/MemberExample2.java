package com.yedam.test;

import java.util.Arrays;

public class MemberExample2  {
	class Member implements Cloneable{//복제할수 있게 해주는 명령문
		public String name;
		public int age;
		public int[] scores;
		public Car car;

		public Member(String name, int age, int[] scores, Car car) {
			super();
			this.name = name;
			this.age = age;
			this.scores = scores;
			this.car = car;
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			Member cloned = (Member) super.clone();
			cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
			cloned.car = new Car(this.car.model);
			return cloned;

			// return super.clone();
		}

		public Member getMember() {
			Member cloned = null;
			try {
				cloned = (Member) clone();

			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			return cloned;
		}

	}

	public class Car {
		public String model;

		public Car(String model) {
			this.model = model;
		}
	}

	public static void main(String[] args) {
		MemberExample2 me = new MemberExample2();
		Member original = me.new Member("홍길동", 25, new int[] { 90, 90 }, me.new Car("소나타"));
		Member cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "그랜져";

		System.out.println("[복제 객체의 필드값]");
		System.out.println("name: " + cloned.name);
		System.out.println("name: " + cloned.age);
		System.out.print("scores: {");

		for (int i = 0; i < cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i == (cloned.scores.length - 1)) ? "" : ",");
		}
		System.out.println("}");
		System.out.println("car: " + cloned.car.model);
		System.out.println();

		System.out.println("[원본 객체의 필드값]");
		System.out.println("name: " + original.name);
		System.out.println("age: " + original.age);
		System.out.print("scores: {");
		for (int i = 0; i < original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i == (original.scores.length - 1)) ? "" : ",");
		}
		System.out.println("}");
		System.out.println("car: " + original.car.model);
	}
}
