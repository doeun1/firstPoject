package com.yedam.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

class Fruit {
	String name;
	int price;
	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
}





//compare는 비교할 대상이 
class FruitComp implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return o1.price-o2.price;//오름차순(앞에 있는 값이 작으면 뒤에있는 값이 음수-로 나옴), 내림차순(앞에 있는 값이 크면 뒤에 있는 값은 양수+로 나옴)
	}
	
}
public class TreeMapExample2 {
	public static void main(String[] args) {
		//아깐 인티저 스트링 타입 어쩌구저쩌구 아니 언제 쉬어여,,,,,,,,,,뭔말이에여,,,,,,,ㅠ
		TreeMap<Fruit, Integer> map = new TreeMap<>(new FruitComp());
		map.put(new Fruit("Orange",1000),1);
		map.put(new Fruit("Grape",3000),2);
		map.put(new Fruit("Banana",2000),3);
		Set<Fruit> set = map.keySet();	//이거 출력하면 키에 대한 셋만 나옴
		NavigableSet<Fruit> dSet = map.descendingKeySet();//return되는 타입이 뭐? 
		dSet = map.navigableKeySet();//return되는 타입이뭐시기뭐시기//정렬되어져 있는 값
		//메소드 활용해서 가져오면 됨
		Iterator<Fruit> iter = dSet.iterator();
		while (iter.hasNext() ) {
			System.out.println(iter.next());
		}
		Map<Integer, Double> map2 =null;
		int a = 30;
		Integer i = new Integer(30);
		int b = Integer.parseInt("30");//30 
	}
}
