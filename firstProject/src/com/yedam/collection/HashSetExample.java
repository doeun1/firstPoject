package com.yedam.collection;

import java.util.HashSet;//자바유틸에 있는 해쉬셋을 임포트하겠다
import java.util.Set;//자바 유틸에 있는 셋을 임포트하겠다

public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		set.add(new Member("희다",20));
		set.add(new Member("나",21));
		set.add(new Member("나",21));// 값이 같더라도 저장위치가 달라서 출력가능?,,,
		
		for(Member mem : set) { // :면 저장위치주소보여주는거니?
			System.out.println(mem.getName()+","+mem.getAge());//나이가 다르면 다른 값 출력해줌(age가 달라서)
		}
		
	}
}
