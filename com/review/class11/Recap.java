package com.review.class11;

public class Recap {
	
	public static void main(String[] args) {
		
		int [] grades = new int [5];
		
		grades [4] = 99;
		int size = grades.length;
		System.out.println(size);
				
		grades [3] = 85;
		grades [2] = 92;
		grades [1] = 100;
		grades [0] = 12;
		
		// what is the averagte fo the class
		
		int average = (grades[0] +grades[1]+grades[2]+grades[3]+grades[4])/size;
			System.out.println(average);
			
			System.out.println();
			System.out.println("==average using regular for loop =======");
			int result = 0;
			int average1 = 0;
			for (int i=0; i<grades.length; i++) {
				result +=grades[i];
				average1=result/size;
			}
			
			System.out.println(average1);
			
			System.out.println();
			System.out.println("==retrieving all values using regular for loop =======");
			for (int j=0; j<grades.length; j++) {
				System.out.println(grades[j]);
				
			}
			
			System.out.println();
			System.out.println("==average using for each loop =======");
			int total = 0;
			int average2 = 0;
			for (int grade : grades) {
				
			total +=grade;
			average2 = total/grades.length;				
			}
			System.out.println(average2);
	}

}
