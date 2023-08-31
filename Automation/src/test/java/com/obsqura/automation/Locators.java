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
		// locate by Class
		WebElement menubarDiv = driver.findElement(By.cssSelector("div.mb-sec"));
		WebElement navbarBrand = driver.findElement(By.cssSelector("a.navbar-brand"));
		WebElement navbarToggler = driver.findElement(By.cssSelector("button.navbar-toggler"));
		WebElement copyRight = driver.findElement(By.cssSelector("div.copyright"));
		WebElement navbarNav = driver.findElement(By.cssSelector("ul.navbar-nav"));

		// locate by Id
		WebElement yourMessage = driver.findElement(By.cssSelector("div#message-one"));
		WebElement collapseNavbar = driver.findElement(By.cssSelector("div#collapsibleNavbar"));
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement toDrag = driver.findElement(By.cssSelector("div#todrag"));
		WebElement myDropzone = driver.findElement(By.cssSelector("div#mydropzone"));
		WebElement myList = driver.findElement(By.cssSelector("div#mylist"));

		// locate tag and attribute
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement enterMessageTextField = driver.findElement(By.cssSelector("input[id=single-input-field]"));
		WebElement yourMessageText = driver.findElement(By.cssSelector("div[id=message-one]"));
		WebElement enterValueATextField = driver.findElement(By.cssSelector("input[id =value-a]"));
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement myDropZone = driver.findElement(By.cssSelector("div[id=mydropzone]"));
		WebElement myListDiv = driver.findElement(By.cssSelector("div[id=mylist]"));

		// locate by tag,class and attribute
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement maleRadioButton = driver.findElement(By.cssSelector("input.form-check-input[id=inlineRadio1]"));
		WebElement femaleRadioButton = driver.findElement(By.cssSelector("input.form-check-input[id=inlineRadio2]"));
		WebElement femaleRadioButtonForPatients = driver
				.findElement(By.cssSelector("input.form-check-input[id=inlineRadio21]"));
		WebElement maleRadioButtonForPatients = driver
				.findElement(By.cssSelector("input.form-check-input[id=inlineRadio11]"));
		WebElement patientsAgeGroup = driver.findElement(By.cssSelector("input.form-check-input[id=inlineRadio22]"));
	}

	public void locateByName() {
		WebElement description = driver.findElement(By.name("description"));
		WebElement keywords = driver.findElement(By.name("keywords"));
		WebElement author = driver.findElement(By.name("author"));
		driver.navigate().to("https://web.classplusapp.com/messages");
		WebElement googlebot = driver.findElement(By.name("googlebot"));
		WebElement robots = driver.findElement(By.name("robots"));
	}

	public void locateByLinkText() {
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement checkDemo = driver.findElement(By.linkText("Checkbox Demo"));
		WebElement radioButtonDemo = driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement selectInput = driver.findElement(By.linkText("Select Input"));
		WebElement ajaxFormSubmit = driver.findElement(By.linkText("Ajax Form Submit"));
		WebElement jquerySelect2 = driver.findElement(By.linkText("Jquery Select2"));
	}

	public void locateByUsingPartialLinkText() {
		WebElement jquery = driver.findElement(By.partialLinkText("Jquery"));
		WebElement ajax = driver.findElement(By.partialLinkText("Ajax"));
		WebElement radio = driver.findElement(By.partialLinkText("Radio"));
		WebElement checkbox = driver.findElement(By.partialLinkText("Checkbox"));
		WebElement select = driver.findElement(By.partialLinkText("Select"));
	}

	public void locateByXpath() {
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		WebElement firstNameTextField = driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		WebElement lastNameTextField = driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		WebElement cityTextField = driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		WebElement stateTextField = driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		WebElement zipTextField = driver.findElement(By.xpath("//input[@id='validationCustom05']"));

		// XPath using Contains
		driver.navigate().to("https://www.amazon.in/");
		WebElement allMenuIcon = driver.findElement(By.xpath("//span[contains(@class,'hm-icon-label')]"));
		WebElement navFooterRow = driver.findElement(By.xpath("//div[contains(@class,'FooterVerticalRow')]"));
		WebElement cartCount = driver.findElement(By.xpath("//span[contains(@class,'cart-count')]"));
		WebElement footerLine = driver.findElement(By.xpath("//div[contains(@class,'footer-line')]"));
		WebElement navLogo = driver.findElement(By.xpath("//div[contains(@class,'logo-base')]"));

		// XPath using AND
		WebElement navFooter = driver
				.findElement(By.xpath("//div[contains(@class,'nav-sprite-v1') and @id='navFooter']"));
		WebElement logoext = driver
				.findElement(By.xpath("//span[contains(@class,'nav-progressive-content') and @id='logo-ext']"));
		WebElement searchDropdown = driver.findElement(
				By.xpath("//select[contains(@class,'nav-progressive-search-dropdown') and @id='searchDropdownBox']"));
		WebElement searchLabel = driver.findElement(
				By.xpath("//span[contains(@class,'nav-progressive-content') and @id='nav-search-label-id']"));
		WebElement navTools = driver
				.findElement(By.xpath("//div[contains(@class,'ToolbarPadding') and @id='nav-tools']"));

		// XPath using OR
		WebElement toolbarPadding = driver
				.findElement(By.xpath("//div[contains(@class,'ToolbarPadding') or @id='nav-tools']"));
		WebElement isFlyout = driver
				.findElement(By.xpath("//div[contains(@class,'issFlyout') or @id='-nav-flyout-searchAjax']"));
		WebElement desktopherotator = driver.findElement(
				By.xpath("//div[contains(@class,'gw-desktop-herotator-ready') or @id='gw-desktop-herotator']"));
		WebElement navLeftFooter = driver
				.findElement(By.xpath("//div[contains(@class,'LeftFooter') or @id='navFooter']"));
		WebElement icpButton = driver
				.findElement(By.xpath("//div[contains(@class,'icp-button') or @id='icp-touch-link-language']"));

		// XPath using Starts-with
		WebElement navFlyout = driver.findElement(By.xpath("//div[starts-with(@id,'nav-flyout-h')]"));
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		WebElement validationCustom = driver.findElement(By.xpath("//input[starts-with(@id,'validationCustom01')]"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement messageTwo = driver.findElement(By.xpath("//div[starts-with(@id,'message-t')]"));
		WebElement inlineRadioButton = driver.findElement(By.xpath("//input[starts-with(@id,'inlineRadio22')]"));
		driver.navigate().to("https://selenium.obsqurazone.com/bootstrap-alert.php");
		WebElement autoclosableButton = driver.findElement(By.xpath("//button[starts-with(@id,'autoclosable-btn-i')]"));
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
