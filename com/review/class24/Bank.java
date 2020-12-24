package com.review.class24;

public class Bank {
	double money, fee;

	public Bank(double money) {
		this.money = money;

	}

	double chargeFee() {//overridden
		if (money < 1000) {
			return fee = money * 0.01;
		} else {
			return fee = 0;
		}
	}

}

class BOA extends Bank {
	public BOA (double money) {
		super(money);
	}
}
class PNC extends Bank {
	PNC (double money) {
		super(money);
	}		
	
	@Override
	double chargeFee() {//overriding
		if (money<1000) {
			return fee = money*0.2;
		} else {
			return fee = 0;
		}
	}
}
class Citi extends Bank {
	Citi (double money) {
		super(money);
	}
}

//return type is matter. We cannot change return type
// return type in Overriding should be the same
// method signature must be the same and we cannot change parameters
