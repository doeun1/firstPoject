package com.yedam.collection;

import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample3 {
	public static void main(String[] args) {
		TreeMap<Student, String> tMap = new TreeMap<>();
		tMap.put(new Student("Hong",69,79), "체육특기생");
		tMap.put(new Student("Park",78,88), "일반학생");
		tMap.put(new Student("Choi",85,79), "체육특기생");
		tMap.put(new Student("Kim",90,86), "일반학생");
//		tMap.put(new Student("Lee",66,90), "일반학생");
		//기준 : 수학점수
		//기준이 되는 메소드 : new Student("Base", 80,80) 
		//반환 되는 값 : SortedMap
		//결과값 : Map
		//key값 : new Student(name,math,eng)
		SortedMap sMap = tMap.headMap(new Student("Base", 80,80)); 
		//tMap.headMap(toKey)//80점 이하,,
		Set<Student> set = sMap.keySet();
		//entryset: 전체(key, value)를 가져와서 비교, keyset : 키값만 가져와서 비교
		for (Student s : set) {
			System.out.println(s.getName()+","+ s.getMath());
		}
		 sMap = tMap.tailMap(new Student("Base", 80,80));
		 Set<Student> up = sMap.keySet();
		 for (Student s : up) {
				System.out.println("80이상 : "+s.getName()+","+ s.getMath());
			}
//		tMap.tailMap(fromKey)//80점 이상..
		 
		 
//		tMap.subMap(fromKey, toKey)//70~80점 사이 (기준이 되는 값 사이의 값들)
		sMap = tMap.subMap(new Student("Base", 70,80), new Student("Base", 80,80));
		Set<Student> bet = sMap.keySet();
		for (Student s : bet) {
			System.out.println("70~80사이 값 : "+s.getName()+","+ s.getMath());
		}
		
	}
}
