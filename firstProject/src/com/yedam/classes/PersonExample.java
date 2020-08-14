package com.yedam.classes;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("김도은");
		p1.setAge(28);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		Person cjy = new Person(); // name:최재영, age:27
		cjy.setName("최재영");
		cjy.setAge(27);
		System.out.println(cjy);
		
		Person ksm = new Person();
		ksm.setName("김상민");
		ksm.setAge(27);
		Person ksm2 = new Person();
		ksm2.setName("김상민");
		ksm2.setAge(27);
		System.out.println(ksm.getName() == ksm2.getName());//값비교할때는 equals사용 or ==(기본타입 비교시)
//		System.out.println(ksm);
		
		System.out.println(cjy.introduce());
		System.out.println(ksm.introduce());
				
		
		Person[] pAry = {cjy,ksm,ksm2};
//		for(int i=0; i<pAry.length; i++) {
//			pAry[i].introduce();
//		}
		Person anoy = new Person("민해주");
		System.out.println(anoy.introduce());
		
		Person hsj = new Person("허성준",20);
		System.out.println(hsj.introduce());
	}

}
