package com.review.class25;

public class WebDriverTest {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.open();
		
		WebDriver driver1 = new InternetExplorer();
		driver1.open();
		
		WebDriver driver2 = new FirefoxDriver (); //
		driver2.open(); // runtime Polymorphism
	}

}
