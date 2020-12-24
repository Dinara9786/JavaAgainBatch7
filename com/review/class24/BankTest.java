package com.review.class24;

public class BankTest {
	
	public static void main(String[] args) {
		
		BOA boa = new BOA(900);
		boa.chargeFee();
		double boaFee = boa.chargeFee();// we store in variable boaFee
		System.out.println(boaFee);
		
		PNC pnc = new PNC (900);
		double pncFee = pnc.chargeFee();
		System.out.println(pncFee);
		
	}

}
