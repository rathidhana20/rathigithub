package com.pom_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage2 {
	
	public WebDriver driver;
	
	@FindBy(id="email")
    private WebElement mail;
	
	@FindBy(id="passwd")
	private WebElement pass;
	
	@FindBy(xpath="//i[@class='icon-lock left']")
	private WebElement signin;

	public Homepage2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSignin() {
		return signin;
	}
	
	
	
}
