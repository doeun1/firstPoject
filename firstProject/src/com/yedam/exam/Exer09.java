package com.yedam.exam;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.리스트 4.분석 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");


			int selectNo = scn.nextInt();

			if (selectNo == 1) {// 배열의 크기 지정
				System.out.println("학생수: ");
				studentNum = scn.nextInt();
				scores = new int[studentNum];

			} else if (selectNo == 2) { //배열의 크기만큼 입력
				System.out.println("점수 입력");
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] >");
					scores[i] = scn.nextInt();
				}
				
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] >" + scores[i]);
				}
			} else if (selectNo == 4) {// 분석: 평균, 최고점수
				int max = 0;
				double avg = 0;
				int sum = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if (scores[i] > max) {
						max = scores[i];
					}
				}
				avg = (double) sum / scores.length;
				System.out.println("최고점수: " + max);
				System.out.printf("평균점수%.2f", avg);//응용
				System.out.println();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램종료");
	}

}