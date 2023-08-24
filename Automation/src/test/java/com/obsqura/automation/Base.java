package com.obsqura.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	WebDriver driver;

	public void intializeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91623\\git\\Automation\\Automation\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
	}

	public void driverCloseOrQuit() {
		// driver.close();
		driver.quit();
	}

	public static void main(String args[]) {
		Base base = new Base();
		base.intializeBrowser();

	}
}
