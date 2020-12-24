package com.review.class15;

public class ReplaceFunction {
	public static void main(String[] args) {

		String me = "I am a good tester";

		String str = "Hello";

		str = str.replace('e', 'E');
		System.out.println(str);

		me = me.replaceAll("good", "great");
		System.out.println(me);
		
		me.replace("we", "us"); // it it finds it ==> it will replace it, if it won't find it then it will print out the output
		
		System.out.println(me);
		
		String me2 = "I am a good tester. I am a good person";
		me2 = me2.replace("good", "great"); // it will replace all cases 
		System.out.println(me2);
		
		String fromApplication = "Phone number is 123456789";
		fromApplication = fromApplication.replaceAll("[A-Z]", "");// removed only Capital letters
		System.out.println(fromApplication); //output: hone number is 123456789
		
		fromApplication = fromApplication.replaceAll("[a-z]", "").trim();
		System.out.println("New String Value is => " + fromApplication);
		
		String another = "Hello12345";
		another = another.replaceAll("[A-Z]", "").replaceAll("[a-z]", "");
		
		System.out.println(another);
		
		String anotherWay = "Hello123WER321";
		anotherWay = anotherWay.replaceAll("[A-Za-z]", "");// removed all letters 
		System.out.println(anotherWay);
		
		String mix = "Hello321321321 friends 3213213";
		
		mix = mix.replaceAll("[0-9]", "");// removed all the digits// output = Hello friends
		System.out.println(mix);
		
		String mix1 = "hello ^%$^%$";
		System.out.println(mix1.replaceAll("[^A-Za-z0-9]", "")); //^ means =>  except
		
		String mixSpaces = "Hello    Friends";
		mixSpaces = mixSpaces.replaceAll(" ", ""); // removed spaces
		System.out.println(mixSpaces);
		
		String mix2 = "hello ^%$^%$";
		mix2 = mix2.replaceAll("[^A-Za-z0-9]", " joy");
		System.out.println(mix2);
		
	}

}
