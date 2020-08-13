package com.yedam.exam;

public class Exercise04 {

	public static void main(String[] args) {
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			if (num + num2 != 5) {
				System.out.println("("+ num + "," + num2+ ")");
			} else if (num + num2 == 5) {
				break;
			}
		}
	}

}
