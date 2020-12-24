package com.review.class07;

public class IncrementDecrement {
	
	public static void main(String[] args) {
		
		int x=10;
		x = x+1;
		x+=1;
		x++; // another way to add 1 into the VARIABLE
		//++x compiler error
		x++; //is post-increment
		++x ;//is pre-increment
		
		
		System.out.println(x);
		System.out.println(x++);
		
		int y=50;
		y-=1;
		y--; // another short way of subtraction 
		System.out.println(y);
		System.out.println(y--);
		//3-- CE, because we can assign ++ only to VARIABLE and not to number
		//3++ CE, because we can assign ++ only to VARIABLE and not to number
		
		int z = 5;
		System.out.println(z++); // it will print out 5 // first print and then increment
		System.out.println(++z);// it will print out 6 // first increment and then print
		
		System.out.println(y--);// it will print 47// first we print adn then decrement
		System.out.println(--y); // it will print 45 // first we decrement and then print 
		
		int k =10;
		if (++k==11) {// we first increment and then print out. 
			System.out.println("Nail was here");
			
			
		}
		
		
		
		
		
	}

}
