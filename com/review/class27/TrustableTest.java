package com.review.class27;

public class TrustableTest {

	public static void main(String[] args) {
		
		Mortgage m = new PNC ();
		m.giveMortgage();
		
		System.out.println("=================================");
		
		BOA boa = new BOA();
		
		boa.deposit();
		boa.withdraw();
		boa.trust();
		boa.doInvestments();
		boa.givesLoan();
		
		System.out.println("=================================");

		PNC pnc = new PNC();
		
		pnc.deposit();
		pnc.withdraw();
		pnc.trust();
		pnc.giveMortgage();
		pnc.doInvestments();
		
		System.out.println("=================================");
		
		Bank bank = new PNC();
		
		bank.deposit();
		bank.withdraw(); 
		bank.trust();
		
		System.out.println("=================================");
		
		Trustable tr = new BOA();
		
		tr.trust();
		
		System.out.println("=================================");
		
		Investments i = new BOA ();
		i.doInvestments();
		
		
		
	}
}


		
		
		
	
