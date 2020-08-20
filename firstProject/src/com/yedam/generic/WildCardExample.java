package com.yedam.generic;

public class WildCardExample {

	public static void registerCourse(Course<?> course) {
		// 타입 상관없이 다 받음
	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		// Course<Student>, Course<HighStudent>//코스의 학생, 고딩타입을 받겠다
	}

	public static void registerCourseWorker(Course<? super Worker> course) { // ???????
		// Course<Worker>,Course<person>
	}

	public static void main(String[] args) {
		
		Course<Person> crsPerson = new Course<>("일반인과정", 5);//제너릭어저구저저구를 다 받겠다
		crsPerson.add(new Person("일반인1"));
		crsPerson.add(new Person("직장인1"));
		crsPerson.add(new Person("학생1"));
		crsPerson.add(new Person("고딩1"));
		
		
		Course<Worker> crsWorker = new Course<>("직장인 과정", 5);
//		crsWorker.add(new Person("일반인 2"));
		crsWorker.add(new Worker("직장인 2"));
		
		
		Course<Student> crsStudent = new Course<>("학생 과정", 5);
		crsStudent.add(new Student("학생 2"));
		crsStudent.add(new Student("고딩2"));
		
		Course<HighStudent> crsHighStudent = new Course<>("고등학생 과정", 5);
		crsHighStudent.add(new HighStudent("고딩 3"));
		
		// 일반인등록가능/ 모든 클래스타입 소화가능
		registerCourse(crsPerson);
		registerCourse(crsWorker);
		registerCourse(crsStudent);
		registerCourse(crsHighStudent);

		// 직장인 등록가능 Course<? super Worker>/
		registerCourseWorker(crsPerson);
		registerCourseWorker(crsWorker);
		
		// 학생 등록가능 Course<? extends Student.
		registerCourseStudent(crsStudent);
		registerCourseStudent(crsHighStudent);
		// 고등학생가능.

	}
}
