package com.pom_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed3 {
	public WebDriver driver;
	
	@FindBy(id="cgv")
	private WebElement check;
	
	@FindBy(xpath="(//span[contains(text(),'Proceed ')])[2]")
	private WebElement proceed3;

	public Proceed3(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getCheck() {
		return check;
	}

	public WebElement getProceed3() {
		return proceed3;
	}
	
	

}
