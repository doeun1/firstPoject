package com.yedam.ref;

public class ArrayExample {

	public static void main(String[] args) {
		int score1 = 10, score2 = 20, score3 = 30, score4 = 40;
		int sum = score1 + score2+ score3 + score4;
		
		int[] intAry = {10, 20, 30, 40, 50, 60, 70, 90, 10 ,20};//[]는 배열
//		sum = intAry[0]+ intAry[1]+ intAry[2]+intAry[3];//<-이방식 잘안씀/sum = intAry의 첫번째 값+intAry의 두번째 값+intAry의 세번째 값+intAry의 네번째 값
		intAry[1] = 50 ; //intAry[1]의 값을 할당하고 싶으면 이렇게 지정하면 됨.
		System.out.println(intAry.length);
		
//		for(int i = 0; i<4; i++) 
		for(int i = 0; i<intAry.length; i++) {
			System.out.println(intAry[i]);		
			sum = sum + intAry[i];//sum = intAry[0]+ intAry[1]+ intAry[2]+intAry[3];와 같은 식
		}
		System.out.println("sum : " + sum);		
		
		double[] dAry = {2.3,4.3};
		String[] sAry = {"hello", "world", "nice", "good"};
		for (int i =0; i< sAry.length; i++) {
			System.out.println(sAry[i]);
		}

		String[] scoreAry = new String[5]; //다섯개짜리 인트형/double/String 어레이를 출력하겠다????
		for (int i = 0; i < scoreAry.length; i++) {
			System.out.println(scoreAry[i]);
		}
		scoreAry[0] = "one";
		scoreAry[1] = "two";
		scoreAry[2] = "three";
		for (int i = 0; i < scoreAry.length; i++) {
			System.out.println(scoreAry[i]);
		}
		
		int[] mathAry;
		mathAry = new int[] {1,2,3,4};//선언 후 라인을 바꿔줄때는 new int를 
	}

}
