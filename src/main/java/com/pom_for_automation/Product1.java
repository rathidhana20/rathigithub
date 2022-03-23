package com.pom_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product1 {
	public WebDriver driver;
	@FindBy(xpath="(//a[@class='product-name'])[2]")
  private WebElement dress1;
	
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement quan1;
	
	@FindBy(id="group_1")
	private WebElement size1;
	
	@FindBy(xpath="//a[@title='White']")
	private WebElement color1;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement cart1;
	
	@FindBy(xpath="//span[@class='cross']")
	private WebElement close;

	public Product1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public WebElement getDress1() {
		return dress1;
	}

	public WebElement getQuan1() {
		return quan1;
	}

	public WebElement getSize1() {
		return size1;
	}

	public WebElement getColor1() {
		return color1;
	}

	public WebElement getCart1() {
		return cart1;
	}

	public WebElement getClose() {
		return close;
	}
	
	
	
	
	
}
