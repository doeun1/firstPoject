package com.yedam.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<>();
		set.add(new Person("Hong1",10));
		set.add(new Person("Hong2",14));
		set.add(new Person("Hong3",12));
		set.add(new Person("Hong4",11));
	
		
		//기준되는 값보다 큰값 가져올땐 tailset?????? 반대로 작은 값가져올땐 headset
		SortedSet<Person> sSet= set.headSet(new Person("Sorted",12));//헤드셋 메소드에 
		sSet= set.tailSet(new Person("So",12));
		sSet = set.subSet(new Person("Temp",10), new Person("Temp2",12));
		//뭐라는 거져?앞에있는 'new Person("Temp",10)'이 기준은 포함, 뒤에있는 'new Person("Temp2",12)'는 제외(temp<=result<temp2)
		//범위를 가져올때는 subset
		for (Person person : sSet) {//쎗에 12기준으로 작은 값을 넣어줌
			System.out.println(person.name+","+person.age);
		}
		System.out.println("-----------------------------");
		NavigableSet<Person> nSet = set.headSet(new Person("Sorted",12), true);
		nSet= set.tailSet(new Person("",12), false);
		set.subSet(new Person("sss",10), true, new Person("ttt",12), true);
		
		
		for (Person person : nSet) {
			System.out.println(person.name+","+person.age);
		}
		
		
		
		Iterator<Person> iter = set.iterator();
		while(iter.hasNext()) {
	//		System.out.println(iter.next().name+","+iter.next().age);//결과값 ㅣ 홍 2는 14인데 뭐가 나옴?
		}
		
		
		
	}
}
