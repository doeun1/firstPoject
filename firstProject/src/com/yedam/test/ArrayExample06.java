package com.yedam.test;

public class ArrayExample06 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		int b ;
		for(int i=0; i<array.length; i++) {
			for(int j = i+1; j<array.length; j++) {
				if(array[i]>array[j]) {
					b=array[j];
					array[j]=array[i];
					array[i]=b;
				}
			}
		}
		
		System.out.println("max : "+ array[4]);//
	}

}
