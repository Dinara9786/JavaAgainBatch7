package com.review.class28;

public class Bank {
	
	private long accountNumber;
	private double balance;
	
	// creating setter 
	public void setAccountNumber(long accountNumber) {
		// here can be any validation 
		this.accountNumber=accountNumber;
	}
	
	public long getAccountNumber() {
		// here can be any validation points too
		return accountNumber;
	}
	
	public void setBalance (double balance) {
		// here can be any validation 
		this.balance = balance;
		
	}
	public double getBalance() {
		// here can be any validation 
		return balance;
	}
	
}
