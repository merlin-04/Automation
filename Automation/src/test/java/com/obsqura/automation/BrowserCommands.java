package com.obsqura.automation;

public class BrowserCommands extends Base {
	public void browserCommands() {
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		String pagesource = driver.getPageSource();
	}

	public void verifyTitle() {
		String expectedresult = "Obsqura Testing";
		String actualresult = driver.getTitle();
		if (expectedresult.equals(actualresult)) {
			System.out.println("Testcase Passed");
		} else {
			System.out.println("Testcase Failed");
		}
	}
	public void navigationCommands() {
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String args[]) {
		BrowserCommands browsercommands = new BrowserCommands();
		browsercommands.intializeBrowser();
		browsercommands.browserCommands();
		browsercommands.verifyTitle();
		browsercommands.navigationCommands();
		browsercommands.driverCloseOrQuit();
	}
}