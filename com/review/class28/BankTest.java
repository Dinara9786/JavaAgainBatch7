package com.review.class28;

public class BankTest {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.setAccountNumber(97869786);
		System.out.println(bank.getAccountNumber());
		
		bank.setBalance(321321.5);
		System.out.println(bank.getBalance());
	}

}
