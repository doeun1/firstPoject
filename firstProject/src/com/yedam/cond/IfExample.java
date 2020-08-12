package com.yedam.cond;

public class IfExample {

	public static void main(String[] args) {
		int score = 80;
		String grade = "";
		
/*		if(score >= 90) {
			grade = "A";
		} else {
			grade = "B";
		}
		System.out.println("등급은 " + grade + "입니다.");//if score값이 90이상일땐 A, 아니면 B */
/*		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else {
			grade = "D";
		}*/
		if(score >=90) 
		{
			if(score >= 95)  
				grade="A+";
			else 
				grade= "A";
			
		}
		System.out.println("등급은"+grade+"입니다.");
	}

}
