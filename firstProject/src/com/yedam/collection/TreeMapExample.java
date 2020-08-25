package com.yedam.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {// key값 기준으로 크다 작다 판단
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(new Integer(87), "최재영");
		scores.put(new Integer(98), "민해주");
		scores.put(new Integer(75), "김상민");
		scores.put(new Integer(95), "최형준");
		scores.put(new Integer(80), "허성준");

		Map.Entry<Integer, String> entry = scores.firstEntry();// 엔트리 클래스에 어저구저저구
		entry= scores.lastEntry();
		
		System.out.println("점수 : " + entry.getKey() 
		+ ", 이름 : " + entry.getValue());// 엔트리 값을 가져왔으니 출력한다
		Integer icnt = scores.firstKey();
		System.out.println("점수 : " + icnt 
		+ ", 이름 : " + scores.get(icnt));
//		scores.get(icnt);
//		scores.pollFirstEntry();//반환되는 요소를 뭐쩌구저쩌구
		Map.Entry<Integer, String> pEntry = scores.pollFirstEntry();
	}

}
