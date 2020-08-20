package com.yedam.generic;

public class Product<T, M> {//타입이 2개?
	private T type;
	private M model;
	public T getType() {
		return type;
	}
	public void setType(T type) {
		this.type = type;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
	
}
