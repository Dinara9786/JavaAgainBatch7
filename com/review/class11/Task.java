package com.review.class11;

public class Task {

	public static void main(String[] args) {

		String[] cars = { "Toyota", "Chevrolet", "Tesla", "Lexus", "Ferrari", "Honda" };

		for (int i = 0; i < cars.length; i++) {
			System.out.println("Printing all the cars in the array = " + cars[i]);

		}

		for (String car : cars) {
			if (car.equals("Tesla")) {
				System.out.println("I will buy this car = " + car);
			} else {

			}
			System.out.println(car);
		}

		int[] numbers = { 2, 6, 10, 1, 12, 56 };

		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		System.out.println(total);

		int total1 = 0;
		for (int l = 0; l < numbers.length; l++) {
			total1 += l;

		}
		System.out.println(total);
		
		int sum = 0; 
		for (int m=0; m< numbers.length; m++) {
			int num = numbers[m] ;
			sum +=num;
		}
		System.out.println("The total using for regular loop is = " + sum);

		String[] countries = { "Russia", "Greec", "Philippines", "Italy", "France", "United States of America",
				"Canada", "Germany" };

		for (String country : countries) {
			if (country.equals("Russia")) {
				System.out.println("Moscow");
			} else if (country.equals("Greec")) {
				System.out.println("Athens");
			} else if (country.equals("Philippines")) {
				System.out.println("Manila");
			} else if (country.equals("Italy")) {
				System.out.println("Rome");
			} else if (country.equals("United States of America")) {
				System.out.println("Washington D.C.");
			} else {
				System.out.println(country + " is not in my list");
			}

		}
		
		System.out.println("===Using for regular loop =====");
		System.out.println();
		
		for (int z = 0; z<countries.length; z++) {
			String country = countries[z];
			if (country.equals("Russia")) {
				System.out.println("Moscow");
			} else if (country.equals("Greec")) {
				System.out.println("Athens");
			} else if (country.equals("Philippines")) {
				System.out.println("Manila");
			} else if (country.equals("Italy")) {
				System.out.println("Rome");
			} else if (country.equals("United States of America")) {
				System.out.println("Washington D.C.");
			} else {
				System.out.println(country + " is not in my list");
			}

		}
		
		System.out.println("===Using for regular loop and switch =====");
		System.out.println();
		for (int c = 0; c<countries.length; c++) {
		
			switch (countries[c]) {
			case "Canada":
				System.out.println("Montreal");
				break;
			case "United States of America":
				System.out.println("washington DC");
				break;
			case "Italy":
				System.out.println("Rome");
				break;
			case "France":
				System.out.println("Paris");
				break;
			case "Philippines":
				System.out.println("Maila");
				break;
			default:
			System.out.println("These countries are not in the list");
				break;
				
			}
		}
		
		}
	}


