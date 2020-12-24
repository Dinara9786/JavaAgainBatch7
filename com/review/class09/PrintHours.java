package com.review.class09;

public class PrintHours {
	public static void main(String[] args) {

		// let us print the clock
		// 00:00......23:59

		int hours;
		int min;

		for (int h = 0; h < 24; h++) {
			for (int m = 0; m < 60; m++) {
				if (h<10 && m < 10 ) {
					System.out.println("0"+h + ":0" + m);
				
				} else {
						System.out.println(h + ":" + m);
					}
				}
			}
		}
	}

