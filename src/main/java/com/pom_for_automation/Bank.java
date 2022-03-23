package com.pom_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bank {
	public WebDriver driver;
	
	@FindBy(xpath="(//span[text()='(order processing will be longer)'])[1]")
	private WebElement bank;

	public Bank(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBank() {
		return bank;
	}
	
	

}
