package com.yedam.classes.exam;

public class Account {
	private String ano;
	private String owner;
	private int balance;
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	public String getAno() { return ano;}
	public void setAno(String ano) {this.ano = ano;}
	public String getOwner( ) {return owner;}
	public void setOwner( ) { this.owner = owner;}
	public int getBalance() { return balance;}
	public void setBalnace(int balance) { this.balance = balance;}
}