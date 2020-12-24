package com.review.class11;

public class HomeTask {
	public static void main(String[] args) {

		String [][] array= {
				
				{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"}
				
		};
		
		System.out.println(array[0][1]+" "+array[1][0]);
		System.out.println(array[0][0]+" "+array[1][3]);
		System.out.println(array[0][2]+" "+array[1][2]);
		System.out.println(array[0][3]+" "+array[1][1]);
		
		System.out.println(" ---------------------------------------------");
		
		String[][] cars= {
				
				{"Jeep", "Ford", "Dodge"},
				{"Audi", "Porsche", "BMW"},
				{"Kia", "Hyundai", "Hyundai sonata"},
				{"Ferrari", "Maserati", "Lamborghini"},
				
		};
	
		for(String[] carArray:cars) {
			
			for(String car:carArray) {
				
				System.out.println(car+"    ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------------------------------");
		
		for(int i=0; i<cars.length; i++) {
			
			for (int j=0; j<cars[i].length; j++) {
				
				String car=cars[i][j];
				System.out.print(car+"     ");
			}
		}
			System.out.println();
			
			double[][] arrays = { 
					{ 39.0, 78.0, 3.5 }, 
					{ 10.0, 57.5, 80.0 }, 
					{ 61.5, 33.5, 90 } 
					};
			// create a variable sum and assign it 0, we'll use that to assign the sums.

			double sum = 0;
			
			for (int m = 0; m < arrays.length; m++) {
				
				for (int j = 0; j < arrays[m].length; j++) {
					
					sum += arrays[m][j]; // summing the arrays with a loop
				}
			}
			
			System.out.println(sum);
		}
		
	}



