package com.yedam.ref;

public class MorningCode {
	public static void main(String[] args) {
		double[] dAry = new double[5];
		dAry[0]=1.2;
		for(int k =0; k<6; k++) {
		}
		int[][] iAry = new int[5][5];
		int num1 =1;
		//배열값을 담는 작업
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				iAry[j][i] = num1++;
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%3d",iAry[i][j]); //%3d: 간격을 세칸을 띄우겠다
			}
			System.out.println();
		}
	}
}
