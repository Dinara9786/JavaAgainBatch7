package com.review.class04;

public class NestingElseIf {
	
	
	// if student completed the quiz we'll check the score. 
	// if score >90 -- > great job!
	// if score > 80 -- > Well done!
	// if score >70 -- > Just passed.
	// otherwise --> You failed!
	// if student did nto compelte the quiz, please fininsh your quiz
	
	public static void main(String[] args) {
		
	boolean quiz = true;
	int score = 86;
	
	if (quiz) {
		if (score>90) {
			System.out.println("great job");
		} else if (score >80 ) {
				System.out.println("Well Done!");
			} else if (score >70) {
					System.out.println("Just passed");
				}else {
					System.out.println("you failed");
				}
			} else {
				System.out.println("Please fininsh your quiz");
			}
		}
	
}

	
	
	


