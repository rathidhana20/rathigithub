package pom_for_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Continue_page {
	public WebDriver driver;
	@FindBy(id="radiobutton_4")
	private WebElement radio;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement conti;

	public Continue_page(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getConti() {
		return conti;
	}
	

}
