package com.obsqura.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	public void webElementCommands() {
		String input = "MERLIN";
		String expectedMessage = "Your Message : " + input;
		WebElement singleInputTextField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputTextField.sendKeys(input);
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		WebElement yourMessageText = driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualMessage = yourMessageText.getText();
		if (expectedMessage.equals(actualMessage)) {
			System.out.println("Testcase Passed");
		} else {
			System.out.println("Testcase Failed");
		}
	}

	public void verifyTwoInputFields() {
		int input1 = 10;
		int input2 = 20;
		int total = input1 + input2;
		String inputA = String.valueOf(input1);
		String inputB = String.valueOf(input2);
		String sum = String.valueOf(total);
		String expectedMessage = "Total A + B : " + sum;
		WebElement enterValueATextField = driver.findElement(By.xpath("//input[@id='value-a']"));
		enterValueATextField.sendKeys(inputA);
		WebElement enterValueBTextField = driver.findElement(By.xpath("//input[@id='value-b']"));
		enterValueBTextField.sendKeys(inputB);
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotalButton.click();
		WebElement totalAPlusBText = driver.findElement(By.xpath("//div[@id='message-two']"));
		String actualMessage = totalAPlusBText.getText();
		if (expectedMessage.equals(actualMessage)) {
			System.out.println("Testcase Passed");
		} else {
			System.out.println("Testcase Failed");
		}
	}

	public void verifyTheTextOfShowMessageButton() {
		String expectedMessage = "Show Message";
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualMessage = showMessageButton.getText();
		if (expectedMessage.equals(actualMessage)) {
			System.out.println("Testcase Passed");
		} else {
			System.out.println("Testcase Failed");
		}
	}

	public void verifyTheTextOfGetTotalButton() {
		String expectedMessage = "Get Total";
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		String actualMessage = getTotalButton.getText();
		if (expectedMessage.equals(actualMessage)) {
			System.out.println("Testcase Passed");
		} else {
			System.out.println("Testcase Failed");
		}
	}

	public void webElementCommandsTo() {
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String showMessageButtonClassName = showMessageButton.getAttribute("class");
		String showMessageButtonIdName = showMessageButton.getAttribute("id");
		String showMessageButtonTag = showMessageButton.getTagName();
		String showMessageButtonBackgroundColor = showMessageButton.getCssValue("background-color");
		// css value
		String showMessageButtonFontWeight = showMessageButton.getCssValue("font-weight");
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		String getTotalButtonBackgroundColor = getTotalButton.getCssValue("background-color");
		String getTotalButtonFontColor = getTotalButton.getCssValue("color");
		// height,width,location
		int xAxis = getTotalButton.getLocation().getX();
		int yAxis = getTotalButton.getLocation().getY();
		int heightOfGetTotalButton = getTotalButton.getSize().getHeight();
		int widthOfGetTotalButton = getTotalButton.getSize().getWidth();
	}

	public void verifyAlignmentOfShowMessageButton() {
		WebElement singleInputTextField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		int yAxisOfSingleInput = singleInputTextField.getLocation().getY();
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		int yAxisOfShowMessageButton = showMessageButton.getLocation().getY();
		if (yAxisOfSingleInput < yAxisOfShowMessageButton) {
			System.out.println("Testcase Passed");
		} else {
			System.out.println("Testcase Failed");
		}
	}

	public static void main(String[] args) {
		WebElementCommands webelementcommands = new WebElementCommands();
		webelementcommands.intializeBrowser();
		webelementcommands.verifyAlignmentOfShowMessageButton();
		webelementcommands.driverCloseOrQuit();
	}

}
