package com.yedam.exp;
//실행 클래스(메인메소드포함)
//과정등록, 학생등록 작업
//과정의 정보확인(showCourseinfo)
public class CourseMain {
	public static void main(String[] args) {
		Course c= new Course("자바코스",5);
		Student s1 = new Student("홍길동",10,50);
		Student s2 = new Student("김도은",28,20);
		Student s3 = new Student("희다",20,30);
		c.registerStudent(s1);
		c.registerStudent(s2);
		c.registerStudent(s3);
		c.registerStudent(new Student("이광호",27,80));//여기까진 등록
		c.showStudent();
		showCourseInfo(c);
	}
	public static void showCourseInfo(Course c1) {//코스정보 보여주기
//과정명, 수강인원, 최고점, 평균점수, 학생이름		
		System.out.println("과정명 : "+ c1.Coursename);
		System.out.println("수강인원 : " + c1.s.length);//c1.s.length는 배열의 크기
		for(Student std : c1.s) {
			if(std != null)
			System.out.println(std.getName());
		}
		
	
	
	
	}
}
