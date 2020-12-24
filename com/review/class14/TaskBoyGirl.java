package com.review.class14;

import java.util.Scanner;

public class TaskBoyGirl {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter mom's first name");

		String momName = scan.nextLine();

		System.out.println("Please enter dad's first name");

		String dadName = scan.nextLine();

		System.out.println("Is it boy or girl");

		String child = scan.nextLine();
		String babyName;
		if (child.equalsIgnoreCase("boy")) {
			babyName = dadName.substring(0, dadName.length() / 2) + momName.substring(momName.length() / 2);
			System.out.println("Congratulations! The boy's name is => " + babyName.toUpperCase());
		} else if (child.equals("girl")) {
			babyName = momName.substring(0, momName.length() / 2) + dadName.substring(dadName.length() / 2);
			System.out.println("Congratulations! The girl's name is => " + babyName.toUpperCase());
		} else {

			System.out.println("The baby's name is unknown");
			scan.close();
		}
	}
}
