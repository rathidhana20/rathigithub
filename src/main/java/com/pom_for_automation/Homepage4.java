package com.pom_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage4 {
	public WebDriver driver;
	
	
	@FindBy(xpath="//i[@class='icon-home']")
	private WebElement home2;
	
	

	public Homepage4(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}



	public WebElement getHome3() {
		return home2;
	}
	
	
	
	

}
