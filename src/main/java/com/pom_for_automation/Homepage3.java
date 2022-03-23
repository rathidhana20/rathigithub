package com.pom_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage3 {
	public WebDriver driver;
	
	@FindBy(xpath="//i[@class='icon-home']")
	private WebElement home2;

	public Homepage3(WebDriver driver) {
		this.driver=driver;

   PageFactory.initElements(driver, this);
	}

	public WebElement getHome2() {
		return home2;
	}
	

}
