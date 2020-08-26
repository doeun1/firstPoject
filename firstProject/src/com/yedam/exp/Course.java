package com.yedam.exp;

//과정 
//과정명, 수강인원(배열, 컬렉션)
//수강인원 등록
//전체 학생정보 리스트
public class Course {
	String Coursename;
	Student[] s;

	public Course(String coursename, int sNum) {

		super();
		Coursename = coursename;
		s = new Student[sNum];
	}

	public String getCoursename() {
		return Coursename;
	}

	public void setCoursename(String coursename) {
		Coursename = coursename;
	}

	public Student[] getS() {
		return s;
	}

	public void setS(Student[] s) {
		this.s = s;
	}

	public void registerStudent(Student sd) {//학생 담기
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				s[i] = sd;
				break;
			}
		}
	}
	
	public void showStudent() {
		for(Student i : s) {
			if(i!=null)
			System.out.println(i.getName()+" , "+i.getGrade());
		}
	}

}
