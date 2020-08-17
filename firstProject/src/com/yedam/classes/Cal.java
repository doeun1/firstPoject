package com.yedam.classes;

public class Cal {
	private int r;//r=반지름
	private double pi = 3.14;
	
	public void setRadius(int r) {//r이 음수가 되면 0
		if (r<0)
			r=0;
		else //else구문이 없으면 0으로 나옴
			this.r = r;
	}
	
	public int getRadius() {
		return r;
	}
	public double getArea() {
		double result = pi * r * r;
		return result;
	}
}
