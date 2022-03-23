package com.pom_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	public WebDriver driver;
	
	@FindBy(xpath="(//a[@class='color-myaccount'])[18]")
	private WebElement move;
	
	@FindBy(xpath="//a[@title='Log me out']")
	private WebElement logout;

	public Logout(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMove() {
		return move;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	

}
