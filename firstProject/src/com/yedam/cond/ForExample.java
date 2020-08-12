package com.yedam.cond;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum += 1; // sum = sum+1;과 같은 뜻(= sum++)
		System.out.println("최종 결과는" + sum);
		
		sum =0;
		for (int a = 0; a<3; a++) {
			sum= sum+1;
		}
		sum+=1;
		System.out.println("최종 결과는 " + sum);
		
		sum =0;
		for(int a = 3; a>0; a--) {
			sum = sum+1;
		}
		System.out.println("최종결과는 " + sum);
		//1~10까지 범위의 수 합계.
		sum =0;
		for(int i =1; i<11; i++)
			sum = sum+i;
		System.out.println("저건 뭔 말일까여?"+sum);
		
		int num =2;
		
		for(int i=2; i<10; i++)
		{ 	
			if (i==7) {
					
				for(int a=1; a<10; a++) {
			
					System.out.println(i+"*"+a+"="+(i*a));
					System.out.println("");//""한줄씩 추가
				}
			}
		}
	}
}