package com.yedam.cond;

public class whileExample {
	public static void main(String[] args) {
		//1~10까지의 값의 합:
		// 구구단 while을 이용해서 출력
		int i = 0;
		int sum = 0;
		
		while(i<10) {
			i++;
			sum = sum+i;
			System.out.println(i);
			
		}
		System.out.println("1~" + i + "까지의 합 : " + sum);
		
		int a=0;
		while(a<9) {
			a++;         
			
			int n=0;
			while(n<9) {
				n++;
				
				System.out.println(a+"*"+n+"="+(a*n));
			}
		}
		
		int x = 2;
		
		while(x<10) {
			int y=1;
			while(y<9)	{
				y++;
			
				System.out.println(x+"*"+y+"="+(x*y));
			}
			x++;
		}
				
	}
}
