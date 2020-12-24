package com.review.class11;

public class HomeWorkNames {
	
	public static void main(String[] args) {
		
		String [][] names = {
				{"Mr.", "Mrs.","Ms.","Miss"}, 
				{"Smith", "Jordan","Jackson","Obama"}
		};
		
		System.out.println(names[0][0] + names[1][0]);
		System.out.println(names[0][1] + names[1][1]);
		System.out.println(names[0][2] + names[1][2]);
		System.out.println(names[0][3] + names[1][3]);
		
		String [][] grades = {
				{"Lola", "Alla", "Ira", "Gena"}, 
				{"A", "B", "C", "D"}
		};
		
//		for (int row =0; row <grades.length; row++) {
//			for (int col = 0; col < grades[row].length; col++) {
//			)
//			}
//		}
		
		String [][] cars = {
				{"Chevrolet", "Dodge","Ford", "Tesla"}, 
				{"Toyota", "Lexus", "Honda", "Oko"},
				{"Huyndai", "Mitsubishi", "Porche", "Skoda"}, 
				{"Ferrari", "Lamborgini", "Mersedes", "BMW"}
		};
		
			
		for (int i = 0; i<cars.length; i++) {
			for (int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j] + ", ");
			}
		}
		System.out.println();
		
		for (String [] car : cars) {
			for (String carss : car)
			System.out.print(carss + ", ");
		}
		
		System.out.println();
		
		String [][] countries = {
				{"Germany", "Italy","France", "Austria"}, 
				{"Kyrgyzstan", "Kazakhstan", "Uzbekistan", "Tajikistan"},
				{"Angola", "Eritrea", "Yemen", "Argentina"}, 
				{"Turkey", "The Ukrain", "USA", "Canada"}
		};
		
		for (int l = 0; l<countries.length; l++) {
			for (int z=0; z<countries[l].length; z++) {
				System.out.print(countries[l][z] + ", ");
			}
			System.out.println();
		}
		
		
		
		for ( String [] country : countries) {
			for (String count : country) {
				System.out.print(count+ ", ");
				
			}
		}
		System.out.println();
		
		int sum = 0;
		
		for (int i = 0; i < countries.length; i++) {
			
			for (int j = 0; j < countries[i].length; j++) {
				
			//	sum += countries[i][j]; // summing the arrays with a loop
			}
		}
		
		System.out.println(sum);
		
		
		System.out.println(countries[0].length + countries[1].length + countries[2].length + countries[3].length);
	}

		}
		
	


