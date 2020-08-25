package com.yedam.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(new Integer(87));
		tSet.add(new Integer(98));
		tSet.add(new Integer(75));
		tSet.add(new Integer(95));
		tSet.add(new Integer(80));
		
		Integer t = tSet.first();
		t=tSet.last();
		t=tSet.floor(new Integer(85));//<=
		t=tSet.lower(new Integer(87));//뭔말이고//<
		t=tSet.ceiling(new Integer(85));//>=
		t=tSet.higher(new Integer(85));//>
		
		Iterator<Integer> dIter = tSet.descendingIterator();
		while(dIter.hasNext()); {
			System.out.println(dIter.next());
		}
		System.out.println("----------------------------");
		
		
		
		NavigableSet<Integer> nSet = tSet.descendingSet();//return되는 값이 set
		for(Integer icnt : nSet) {
			System.out.println(icnt);
		}
		
		//요소를 가지고 와서 삭제.
		int size = tSet.size();
		for(int i=0; i< size; i++) {
		t=tSet.pollLast();
		System.out.println(t+","+tSet.size());
		}
//		t=tSet.pollFirst();
		System.out.println("last:"+t);
		Iterator<Integer> iter = tSet.iterator();//해당되는 뭐를 하는게 반복자
		while(iter.hasNext()) {//가지고올 메소드가 있으면 next
			Integer icnt = iter.next();
			System.out.println(icnt);//다시 가지고 오려면 해당하는 값을 반복적으로 가져와야함?
			
		}
		
		
		
		
	}
}
