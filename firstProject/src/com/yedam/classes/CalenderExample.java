package com.yedam.classes;

import java.util.Calendar;

public class CalenderExample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();// 2020-08-19
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));// 월 : 0~11
		System.out.println(cal.get(Calendar.DATE));

		cal.set(2020, 7, 1);//
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));// 월 : 0~11
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DATE));

		createCalendar(2020, 8);// 2020년 8월 달력을 보여주세여 굳이 봐야하나여,,,,ㅠㅠ
	}

//	public static void createCalendar(int year, int month) {

//		System.out.println("월 화 수 목 금 토 일");
	/*
	 * for(int i=0; i<5; i++) { for() }
	 */
	/*
	 * int count = 1;
	 * System.out.println("일     월      화      수      목      금      토  "); for (int
	 * i = 0; i <= 5; i++) { for (int j = 0; j < 7; j++) {
	 * System.out.printf("%3d",count++); if (count == 32) { break; }
	 * 
	 * } if (count == 32) { break; } System.out.println(" "); }
	 */

	public static void createCalendar(int year, int month) { // 메인 메소드와 타입 맞춰줌 static
		// 2020년 8월 달력

		System.out.println("  일   월   화   수    목   금   토");
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		for (int i = 1; i < firstDay; i++) {
			System.out.printf("%3s", "");
		}
		int day = 1;
		for (int i = 0; i < lastDay; i++) {
			System.out.printf("%3d", day);
			if ((day + firstDay - 1) % 7 == 0) {
				System.out.println();
			}
			day++;
		}

	}
}
