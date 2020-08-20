package com.yedam.collection;

import java.util.ArrayList;//자바 유틸에 있는 어레이리스트 임포트
import java.util.List;//자바 유틸에 있는 리스트 임포트

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList();// 리스트는 인터페이스
		list.add("01");
		list.add("02");
		list.add(1, "03");

//		list.get(0);

		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

	}
}
