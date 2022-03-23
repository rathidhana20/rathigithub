package com.pom_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Back {
 public WebDriver driver;
	@FindBy(xpath="//a[@title='Back to orders']")
	private WebElement back;


	public Back(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}


	public WebElement getBack() {
		return back;
	}
	
	

}
