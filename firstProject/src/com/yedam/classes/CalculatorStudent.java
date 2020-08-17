package com.yedam.classes;

public class CalculatorStudent {
	/*
	 * public static void main(String[] args) { Student a = new
	 * Student(111,"홍길동","역사학과"); Student b = new Student(222,"김유신","말타기학과");
	 * 
	 * System.out.println("학번:"+a.num+" 이름:"+a.name+" 학번:"+a.major);
	 * System.out.println("학번:"+b.num+" 이름:"+b.name+" 학번:"+b.major); }
	 */
	public static void main(String[] args) {
		Student s1=new Student();
		s1.num =111;
		s1.name="홍길동";
		s1.major="역사";
		System.out.println("학번은"+s1.num);
		System.out.println("이름은"+s1.name);
		System.out.println("전공은"+s1.major);
				
/*		s1.studNo=(111);
		s1.studName=("홍길동");
		s1.major=("역사");
		System.out.println("학번은"+s1.getStudNo());
		System.out.println("이름은"+s1.getStudName());
		System.out.println("전공은"+s1.getMajor());	*/			
	}
}
