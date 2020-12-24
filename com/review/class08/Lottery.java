package com.review.class08;

import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int lucky = 17;
		int num;
		
		System.out.println("Please enter any number from 1 to 20");
		num = scan.nextInt();
		
		while (num!=lucky) {
		System.out.println("Please enter any number from 1 to 20");
		num = scan.nextInt();
		}
				System.out.println("Congratulations! I won!");
			}
		}
		
		
		



