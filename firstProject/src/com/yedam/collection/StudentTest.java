package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.classes.Friend;

public class StudentTest {
	static Scanner sn = new Scanner(System.in);
	static Student[] sd = new Student[3];

	public static void main(String[] args) {
		/*
		 * 1. 학생이름, 수학점수, 영어점수 입력 2. 수학평균, 영어평균 계산 3.수학 최고점, 학생 조회\ 9. 종료 arraylist사용
		 */
		List<Student> list = new ArrayList();

		while (true) {
		System.out.println("1. 학생이름, 수학점수, 영어점수를 입력하세요");
		System.out.println("2. 수학평균, 영어평균을 계산하는 분석");
		System.out.println("3. 수학 최고점과 학생 조회");
		System.out.println("9. 종료");
		double tm = 0;
		double te = 0;
		int mm = 0;// 수학최고점수
		int maxvalue = 0;
		int maxindex = 0;

			int k = sn.nextInt();
			if (k == 1) {
				for (int j = 0; j < 3; j++) {
					int i = sn.nextInt();
					sn.nextLine();
					String s = sn.nextLine();
					int e = sn.nextInt();
					list.add(new Student(s, i, e));
				}
			}
			if (k == 2) {
				for (int a = 0; a < list.size(); a++) {
					tm += list.get(a).getMath();
					te += list.get(a).getEng();
					if (mm < list.get(a).getMath()) {
						mm = list.get(a).getMath();
					}
				}
				System.out.println("수학평균 : " + tm / 3);
				System.out.println("영어평균 : " + te / 3);
			}
			if (k == 3) {
				for (int i = 0; i < list.size(); i++) {
					if (maxvalue < list.get(i).getMath()) {
						maxvalue = list.get(i).getMath();
						maxindex = i;
					}
				}

				System.out.println("최고수학점수" + list.get(maxindex).getMath() + "이름" + list.get(maxindex).getName());
				System.out.println(mm);

			}
			if (k ==4)
				break;
			/*
			 * 
			 * if (i == 1) { System.out.println("학생이름 : "); sn.nextLine();
			 * System.out.println("수학점수 :"); sn.nextInt(); sn.nextLine();
			 * System.out.println("영어점수 :"); sn.nextLine(); } else if (i == 2) {
			 * 
			 * } else if (i == 3) {
			 * 
			 * } else if (i == 9) break;
			 */
		}
	}

}