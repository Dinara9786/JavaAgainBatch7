package com.review.class29;

public class WebDriverTest {
	public static void main(String[] args) {

		RemoteWebDriver chrome = new ChromeDriver();
		chrome.close();
		chrome.open();
		chrome.getTitle();
		chrome.navigate();
		chrome.getScreenShot();

		WebDriver fire = new FirefoxDriver();
		fire.close();
		fire.open();
		fire.getTitle();

		RemoteWebDriver safari = new SafariDriver();
		safari.close();
		safari.open();
		safari.navigate();
		safari.getTitle();
		safari.getScreenShot();

		RemoteWebDriver[] drivers = { new ChromeDriver(), new FirefoxDriver(), new SafariDriver() };

		// Array of Objects of RemoteWebDriver type
		for (RemoteWebDriver driver : drivers) {
			System.out.println("========================================");
			driver.close();
			driver.open();
			driver.getScreenShot();
			driver.getTitle();
			driver.navigate();
		}

		// Array of Objects of WebDriver type
		WebDriver[] drivers2 = { new ChromeDriver(), new FirefoxDriver(), new SafariDriver() };
		System.out.println("================================");

		for (WebDriver driver : drivers2) {
			driver.open();
			driver.close();
			driver.getTitle();

			// driver.nagivate is not accessible to WebDriver type of objects
			// driver.getScreenshot is not accessible to WebDrvier type of objects
		}
		
		// Array of Objects of TakeScreenshot type
		TakesScreenshot[] drivers3 = { new ChromeDriver(), new FirefoxDriver(), new SafariDriver() };
		System.out.println("================================");

		for (TakesScreenshot driver : drivers3) {
			driver.getScreenShot();

		}
	}
}
