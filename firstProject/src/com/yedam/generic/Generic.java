package com.yedam.generic;

import java.util.HashMap;
import java.util.HashSet;

import com.yedam.classes.Person;

public class Generic {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("");
		set.add("");
		
		HashSet<Person> set2 = new HashSet<>();
		set2.add(new Person());
		set2.add(new Person());
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("", 50);
		map.put("",15);
		
		
	}
}
