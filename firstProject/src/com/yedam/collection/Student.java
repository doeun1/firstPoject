package com.yedam.collection;
//
public class Student implements Comparable<Student>{//comparable을 구현해야 기준을 정해서 대소비교를 할 수 있음
	private String name;
	private int math;
	private int eng;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public Student(String name, int math, int eng) {
		super();
		this.name = name;
		this.math = math;
		this.eng = eng;
	}
	@Override
	public int compareTo(Student o) {//매개값으로 오는 클래스 : student
		return this.math-o.math;//기준 : this.math, 비교대상 : o.math
	}
/*	@Override  //두개의 기준을 비교하고싶을때 사용
	public int compareTo(Student o) {
		
		if((this.math+this.eng) <(o.math+o.eng)) {
			return -1;
		else
			return 1; //기준 : this.math,this.eng 비교대상 : o.math,o.eng
	}*/
	
	
}
