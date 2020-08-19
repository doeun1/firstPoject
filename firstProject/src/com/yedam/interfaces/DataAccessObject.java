package com.yedam.interfaces;

public interface DataAccessObject {
/*	public void delete( ) { //구현 메소드는 안되고 추상 ㅁ소드만 와야함
		
	}*/
	public void select();
	public void insert();
	public void update();


}
