package pom_for_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_page {
	public WebDriver driver;
	@FindBy(xpath="//input[@value='My Itinerary']")
	private WebElement itinerary;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;

	public Confirm_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getItinerary() {
		return itinerary;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	

}
