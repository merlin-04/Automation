package com.obsqura.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtonsAndCheckbox extends Base {

	public void radioButton() {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		maleRadioButton.click();
		boolean isMaleRadioButtonSelected = maleRadioButton.isSelected();
	}

	public void verifyRadioButtonsAreDisabledInitially() {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		boolean isMaleRadioButtonIsDisabled = maleRadioButton.isSelected();
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean isFemaleRadioButtonIsDisabled = femaleRadioButton.isSelected();
		if (isMaleRadioButtonIsDisabled == false && isFemaleRadioButtonIsDisabled == false) {
			System.out.println("Testcase Passed");
		} else {
			System.out.println("Testcase Failed");
		}
	}

	public void verifyFemaleRadioButton() {
		String input = "Female";
		String expectedMessage = "Radio button '" + input + "' is checked";
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		femaleRadioButton.click();
		boolean isFemaleRadioButtonSelected = femaleRadioButton.isSelected();
		if (isFemaleRadioButtonSelected == true) {
			WebElement showSelectedValueButton = driver.findElement(By.xpath("//button[@id='button-one']"));
			showSelectedValueButton.click();
			WebElement radioButtonSelectedValueText = driver.findElement(By.xpath("//div[@id='message-one']"));
			String actualMessage = radioButtonSelectedValueText.getText();
			if (expectedMessage.equals(actualMessage)) {
				System.out.println("Testcase Passed");
			} else {
				System.out.println("Testcase Failed");
			}
		} else {
			System.out.println("Testcase Failed");
		}

	}

	public void checkbox() {
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement singleCheckboxDemo = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		singleCheckboxDemo.click();
		boolean isDisplayedCheckboxButton = singleCheckboxDemo.isDisplayed();
	}

	public void verifySingleCheckboxButton() {
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement singleCheckboxButton = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		singleCheckboxButton.click();
		boolean isSelectedCheckboxButton = singleCheckboxButton.isSelected();
		if (isSelectedCheckboxButton == true) {
			System.out.println("Testcase Passed");
		} else {
			System.out.println("Testcase Failed");
		}
	}

	public void verifySingleCheckboxDemo() {
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		String expectedMessage = "Success - Check box is checked";
		WebElement singleCheckboxButton = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		singleCheckboxButton.click();
		boolean isSelectedCheckboxButton = singleCheckboxButton.isSelected();
		if (isSelectedCheckboxButton == true) {
			WebElement checkboxCheckedTextField = driver.findElement(By.xpath("//div[@id='message-one']"));
			String actualMessage = checkboxCheckedTextField.getText();
			if (expectedMessage.equals(actualMessage)) {
				System.out.println("Testcase Passed");
			} else {
				System.out.println("Testcase Failed");
			}
		} else {
			System.out.println("Testcase Failed");
		}
	}

	public void verifySelectAllButtonIsEnabled() {
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement selectAllButton = driver.findElement(By.xpath("//input[@id='button-two']"));
		boolean isEnabledSelectAllButton = selectAllButton.isEnabled();
		if (isEnabledSelectAllButton == true) {
			System.out.println("Testcase Passed");
		} else {
			System.out.println("Testcase Failed");
		}
	}

	public void verifyMultipleCheckboxDemo() {
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkBoxOne = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		checkBoxOne.click();
		boolean isSelectedCheckBoxOne = checkBoxOne.isSelected();
		WebElement checkBoxTwo = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		checkBoxTwo.click();
		boolean isSelectedCheckBoxTwo = checkBoxTwo.isSelected();
		if (isSelectedCheckBoxOne == true && isSelectedCheckBoxTwo == true) {
			System.out.println("Testcase Passed");
		} else {
			System.out.println("Testcase Failed");
		}
	}

	public static void main(String[] args) {
		RadioButtonsAndCheckbox radiobuttonsandcheckbox = new RadioButtonsAndCheckbox();
		radiobuttonsandcheckbox.intializeBrowser();
		radiobuttonsandcheckbox.verifySingleCheckboxButton();
		radiobuttonsandcheckbox.verifySingleCheckboxDemo();
		radiobuttonsandcheckbox.verifySelectAllButtonIsEnabled();
		radiobuttonsandcheckbox.verifyMultipleCheckboxDemo();
		radiobuttonsandcheckbox.driverCloseOrQuit();

	}

}
