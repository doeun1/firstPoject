package com.yedam.collection;

//import java.lang.reflect.Member;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	
	public static void getInfo(Map<String, String> m) {
		
		
		System.out.println("이름 : " + m.get("이름"));
		System.out.println("전공 : " + m.get("전공"));
	}

	
	public static void getAge(Map<String, Integer> m) {
//		System.out.println("이름 : " + m.);
		System.out.println(m.get("이름")+"는 "+ m.get("") +"살 입니다");
	      
	      
	   
	}
		
		
	public static void main(String[] args) {
		Map<String, Integer> m2 = new HashMap<>();
		m2.put("김도은", 1);
		getAge(m2);
		
		
		
		
		Map<String, String> m1 = new HashMap<>();
		m1.put("이름", "홍길동");
		m1.put("전공" , "역사학");
//		getInfo(m1);
		
		Map<Integer, Member> map = new HashMap<>();
		map.put(11, new Member("가가가", 10));
		map.put(12, new Member("나나나", 11));
		map.put(13, new Member("다다다", 12));

		System.out.println(map.get(11).getName() + "," + map.get(11).getAge());//

		Set<Integer> set = map.keySet();// key에 해당되는 set에 저장
		for (Integer i : set) {// set은 순서 없이 무작위로 받아옴
			Member m = map.get(i);
			System.out.println(m.getName() + "," + m.getAge());
		}
		Set<Map.Entry<Integer, Member>> entSet = map.entrySet();
		for (Map.Entry<Integer, Member> m : entSet)
			System.out.println(m.getKey() + "," + m.getValue().getName());
	}

}
