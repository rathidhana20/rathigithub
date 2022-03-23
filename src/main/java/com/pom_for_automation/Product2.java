package com.pom_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product2 {
	public WebDriver driver;
	@FindBy(xpath="(//a[@title='Printed Dress'])[4]")
	private WebElement dress2;
	
	@FindBy(id="group_1")
	private WebElement size2;
	
	@FindBy(name="Pink")
	private WebElement color;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement cart2;
	
	@FindBy(xpath="//span[contains(text(),'Proceed')]")
	private WebElement proceed1;

	public Product2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDress2() {
		return dress2;
	}

	public WebElement getSize2() {
		return size2;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getCart2() {
		return cart2;
	}

	public WebElement getProceed1() {
		return proceed1;
	}
	
	
	

}
