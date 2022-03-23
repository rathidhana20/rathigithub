package com.pom_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed1 {
	public WebDriver driver;
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement proceed1;

	public Proceed1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceed1() {
		return proceed1;
	}
	
	

}
