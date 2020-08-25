package com.yedam.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

import com.yedam.collection.Person;

class User {
	String name;
	int grade;

	public User(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	


}
public class ArrayExample {
	public static void main(String[] args) {
		int[] scores = { 95, 80, 36, 88 };

		String[] names = { "Hong", "Choi", "Park" };
		// names = > "choi","Hong","park"
		System.out.println("-----정렬 전-----");
		for (String s : names) {
			System.out.println(s);

		}
		System.out.println("-----정렬 후-----");
		Arrays.sort(names);// sort라는 메소드를 사용해서 정렬(sort는 오름차순인가여)
		for (String s : names) {
			System.out.println(s);

		}
		User[] users = { new User("user1", 1), new User("user2", 2), new User("user3", 4) };
		Arrays.sort(users);
		TreeSet<> set = new TreeSet<>();
		//user3,user2,user1 => 순으로 나오도록
	}
	//names => "choi","hong","park"
}