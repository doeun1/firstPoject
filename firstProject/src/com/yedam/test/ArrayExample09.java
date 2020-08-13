package com.yedam.test;

import java.util.Scanner;

public class ArrayExample09 {
	   public static void main(String[] args) {
		      boolean run = true;
		      int studentNum = 0;
		      int[] scores = null;
		      Scanner scanner = new Scanner(System.in);

		      while (run) {
		         System.out.println("--------------------------------------");
		         System.out.println("1학생수 | 2점수입력 | 3점수리스트 | 4분석 | 5종료");
		         System.out.println("--------------------------------------");
		         System.out.println("선택> ");

		         int selectNo = scanner.nextInt();

		         if (selectNo == 1) {
		            System.out.println("학생수: ");
		            studentNum=scanner.nextInt();
		         }
		         else if (selectNo == 2) {
		            scores = new int[studentNum];
		            for(int i=0;i<scores.length;i++) {
		               System.out.println("scores["+i+"] >");
		               scores[i]=scanner.nextInt();
		            }
		         }
		         else if (selectNo == 3) {
		            for(int i=0;i<scores.length;i++) {
		               System.out.println("scores["+i+"] >"+scores[i]);
		            }
		         }
		         else if (selectNo == 4) {
		            int max=0;
		            double avg=0;
		            int sum=0;
		            for(int i=0;i<scores.length;i++) {
		               sum+=scores[i];
		               if(scores[i]>=max) {
		                  max=scores[i];
		               }
		            }
		            avg=(double)sum/scores.length;
		            System.out.println("최고점수: "+max);
		            System.out.println("평균점수 :"+avg);
		         }
		         else if (selectNo == 5) {
		            run=false;
		         }
		      }
		      System.out.println("프로그램종료");
		   }

		}
