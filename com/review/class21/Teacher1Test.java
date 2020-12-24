package com.review.class21;

public class Teacher1Test {
	public static void main(String[] args) {
		
	
	
	Teacher1 t = new Teacher1();
	t.school = "Standford";
	t.name = "Angelo";
	t.performance = true;
	t.experience = 20;
	
	t.access();
	t.assess();
	
	MathTeacher math = new MathTeacher();
	math.school = "Harvard";
	math.name = "John";
	math.performance=true;
	math.experience = 5;
	math.subject = "Algebra";
	
	math.access();
	math.assess();
	math.attend();
	
	PianoTeacher piano = new PianoTeacher();
	piano.school = "Abdraev";
	piano.name = "Victoria";
	piano.address = "Brooklyn";
	piano.experience = 23;
	piano.performance = true;
	piano.instrument = "fortepiano";
	
	piano.access();
	piano.assess();
	piano.play();
	
	
	
	
	}
}
