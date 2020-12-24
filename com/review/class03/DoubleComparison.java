package com.review.class03;

public class DoubleComparison {
	public static void main(String[] args) {
		
		double d1 =76.89;
		double d2 = 32.76;
		
		if (d1>d2) {
			System.out.println("Double value " + d1 + " is larger than " + d2);
		} else {
			System.out.println("Double value " + d1 + " is not larger than " + d2);
		}
		
		int temperature = 38;
		
		if (temperature <32) {
			System.out.println("Water will freese with temperature " + temperature);
		}else {
			System.out.println("Water will not freese with temperature " + temperature);
		}
		
	}

}
