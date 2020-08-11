package com.yedam.dev;

import java.math.BigDecimal;

public class LongFloatExample {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		long l1=2147483648L;//정수형 범위를 벗어나는 값에는 L(LONG형 함수라는 뜻)을 붙여줌
		
		float f1 = 0.1234567890123456789F;//실수형 기본타입은 double, float을 사용할땐 F를 적어준다
		double d1 = 0.1234567890123456789;//double은 8byte/float은 4byte
		double d2 = 0.1234567890123456789;
		double d3 = d1 + d2;
		System.out.println("d3 = " + d3); //0.24691357802469135
		
		BigDecimal bd1 = new BigDecimal("0.1234567890123456789");
		BigDecimal bd2 = new BigDecimal("0.1234567890123456789");
		BigDecimal bd3 = bd1.add(bd2);//0.2469135780246913578
		System.out.println("bd3 =" + bd3); 
	}
}
