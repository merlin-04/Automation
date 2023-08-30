package com.obsqura.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void locateById() {
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		driver.navigate().to("https://www.amazon.in/");
		WebElement showLocationButton = driver.findElement(By.id("glow-ingress-line1"));
		WebElement globalLocation = driver.findElement(By.id("nav-global-location-toaster-script-container"));
		WebElement isAttach = driver.findElement(By.id("nav-iss-attach"));
		WebElement isAnchor = driver.findElement(By.id("nav-flyout-iss-anchor"));
		WebElement search = driver.findElement(By.id("nav-flyout-searchAjax"));
	}

	public void locateByClass() {
		WebElement section = driver.findElement(By.className("header-top"));
		driver.navigate().to("https://www.amazon.in/");
		WebElement logoLink = driver.findElement(By.className("nav-logo-link"));
		WebElement navigationAttribute = driver.findElement(By.className("nav-progressive-attrubute"));
		WebElement searchDropdown = driver.findElement(By.className("nav-progressive-search-dropdown"));
		WebElement searchField = driver.findElement(By.className("nav-search-field"));
		WebElement cartIcon = driver.findElement(By.className("nav-cart-icon"));
	}

	public void locateByCssSelector() {
		//locate by Class
		WebElement menubarDiv = driver.findElement(By.cssSelector("div.mb-sec"));
		WebElement navbarBrand = driver.findElement(By.cssSelector("a.navbar-brand"));
		WebElement navbarToggler = driver.findElement(By.cssSelector("button.navbar-toggler"));
		WebElement copyRight = driver.findElement(By.cssSelector("div.copyright"));
		WebElement navbarNav = driver.findElement(By.cssSelector("ul.navbar-nav"));
		
		//locate by Id
		WebElement yourMessage = driver.findElement(By.cssSelector("div#message-one"));
		WebElement collapseNavbar = driver.findElement(By.cssSelector("div#collapsibleNavbar"));
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement toDrag = driver.findElement(By.cssSelector("div#todrag"));
		WebElement myDropzone = driver.findElement(By.cssSelector("div#mydropzone"));
		WebElement myList = driver.findElement(By.cssSelector("div#mylist"));
		
		//locate tag and attribute
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement enterMessageTextField = driver.findElement(By.cssSelector("input[id=single-input-field]"));
		WebElement yourMessageText = driver.findElement(By.cssSelector("div[id=message-one]"));
		WebElement enterValueATextField = driver.findElement(By.cssSelector("input[id =value-a]"));
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement myDropZone= driver.findElement(By.cssSelector("div[id=mydropzone]"));
		WebElement  myListDiv= driver.findElement(By.cssSelector("div[id=mylist]"));
		
		//locate by tag,class and attribute
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement maleRadioButton = driver.findElement(By.cssSelector("input.form-check-input[id=inlineRadio1]"));
		WebElement femaleRadioButton = driver.findElement(By.cssSelector("input.form-check-input[id=inlineRadio2]"));
		WebElement femaleRadioButtonForPatients = driver.findElement(By.cssSelector("input.form-check-input[id=inlineRadio21]"));
		WebElement maleRadioButtonForPatients = driver.findElement(By.cssSelector("input.form-check-input[id=inlineRadio11]"));
		WebElement patientsAgeGroup = driver.findElement(By.cssSelector("input.form-check-input[id=inlineRadio22]"));
	}
	public void locateByName() 
	{
		WebElement description = driver.findElement(By.name("description"));
		WebElement keywords = driver.findElement(By.name("keywords"));
		WebElement author = driver.findElement(By.name("author"));
		driver.navigate().to("https://web.classplusapp.com/messages");
		WebElement googlebot= driver.findElement(By.name("googlebot"));
		WebElement robots = driver.findElement(By.name("robots"));
	}
	public void locateByLinkText() 
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement checkDemo = driver.findElement(By.linkText("Checkbox Demo"));
		WebElement radioButtonDemo = driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement selectInput = driver.findElement(By.linkText("Select Input"));
		WebElement ajaxFormSubmit = driver.findElement(By.linkText("Ajax Form Submit"));
		WebElement jquerySelect2 = driver.findElement(By.linkText("Jquery Select2"));
	}
	public void locateByUsingPartialLinkText()
	{
		WebElement jquery = driver.findElement(By.partialLinkText("Jquery"));
		WebElement ajax = driver.findElement(By.partialLinkText("Ajax"));
		WebElement radio = driver.findElement(By.partialLinkText("Radio"));
		WebElement checkbox = driver.findElement(By.partialLinkText("Checkbox"));
		WebElement select = driver.findElement(By.partialLinkText("Select"));
	}
	public void locateByXpath()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		WebElement firstNameTextField = driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		WebElement lastNameTextField = driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		WebElement cityTextField = driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		WebElement stateTextField = driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		WebElement zipTextField = driver.findElement(By.xpath("//input[@id='validationCustom05']"));
		
	}

	public static void main(String[] args) {
		Locators locators = new Locators();
		locators.intializeBrowser();
		locators.locateByCssSelector();
		locators.locateByName();
		locators.locateByLinkText();
		locators.locateByUsingPartialLinkText();
		locators.locateByXpath();
		locators.driverCloseOrQuit();

	}

}
