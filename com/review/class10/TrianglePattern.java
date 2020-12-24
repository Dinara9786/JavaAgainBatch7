package com.review.class10;

public class TrianglePattern {
	public static void main(String[] args) {
		// Let us print the following triangle
		//*
		//**
		//***
		//****
		//*****
		
		
		
		for (int r=1; r<=5; r++) {
			for (int c=1; c<=r; c++) {
				
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		// let us add the second triangle
		//*****
		//****
		//***
		//**
		//*
		
		System.out.println("===================================");
		
		for (int r=4; r>=1; r--) {
			for (int c=1; c<=r; c++) {
				
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for (int r=5; r>=1; r--) {
			for (int c=1; c<=r; c++) {
				
				System.out.print(r + " ");
			}
			System.out.println();
	}
		
		for (int i = 5; i>=0; i--) {
			for (int j=i; j>=1; j--) {
				System.out.print(j);
		}
		System.out.println();
		}
		
		for (int k=1; k<5; k++) {
			for (int b=k; b>=1; b--) {
		 System.out.print(b);
			}
		System.out.println();
	}
	
		for (int i = 5; i>=0; i--) {
			for (int j=i; j>=1; j--) {
				System.out.print(j);
		}
		System.out.println();
		}
	}
}

