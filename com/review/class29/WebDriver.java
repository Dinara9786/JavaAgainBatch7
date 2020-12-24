package com.review.class29;

public interface WebDriver {

	String TITLE = "Driver";

	void open();

	void close();

	String getTitle();

}

interface RemoteWebDriver extends WebDriver, TakesScreenshot {
	void navigate();
}

interface TakesScreenshot {
	void getScreenShot();
	
	default void getFullScreen() {
		System.out.println("Takes full screen pictures");
	}
	
	static void takesPartialScreen () {
		System.out.println("Takes partial screen pictures");
	}

}

class ChromeDriver implements RemoteWebDriver {

	public void navigate() {
		System.out.println("ChromeDriver navigates");
	}

	public void open() {
		System.out.println("ChromeDriver opens");
	}

	public void close() {
		System.out.println("ChromeDriver closes");
	}

	public void getScreenShot() {
		System.out.println("ChromeDriver takes screenshot");
	}
	public String getTitle() {
		return TITLE;
	}

}

class FirefoxDriver implements RemoteWebDriver {
	public void navigate() {
		System.out.println(" Firefox navigates");
	}

	public void open() {
		System.out.println("Forefox opens");
	}

	public void close() {
		System.out.println("Firefox closes");
	}

	public String getTitle() {
		return TITLE;
	}
	public void getScreenShot() {
		System.out.println("Firefox takes screenshot");
	}
}

class SafariDriver implements RemoteWebDriver {

	public void navigate() {
		System.out.println(" Safari navigates");
	}

	public void open() {
		System.out.println("Safari opens");
	}

	public void close() {
		System.out.println("Safari closes");
	}

	public String getTitle() {
		return TITLE;

	}
	public void getScreenShot() {
		System.out.println("Safari takes screenshot");
	}
}
