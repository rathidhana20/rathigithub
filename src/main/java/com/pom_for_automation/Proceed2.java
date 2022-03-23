package com.pom_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed2 {
	public WebDriver driver;
	@FindBy(name="message")
	private WebElement mess;
	
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement proceed2;

	public Proceed2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMess() {
		return mess;
	}

	public WebElement getProceed2() {
		return proceed2;
	}
	

}
