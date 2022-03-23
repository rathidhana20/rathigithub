package pom_for_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personal_details {
	public WebDriver driver;
	
	@FindBy(name="first_name")
	private WebElement first;
	
	@FindBy(name="last_name")
	private WebElement last;
	
	@FindBy(xpath="//textarea[@class='txtarea']")
	private WebElement address;
	
	@FindBy(xpath="(//input[@class='reg_input'])[3]")
	private WebElement cardno;
	
	@FindBy(id="cc_type")
	private WebElement type;
	
	@FindBy(id="cc_exp_month")
	private WebElement expdate;
	
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	
	@FindBy(xpath="(//input[@class='reg_input'])[4]")
	private WebElement cvv;
	
	@FindBy(xpath="//input[@value='Book Now']")
	private WebElement book;

	public Personal_details(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getExpdate() {
		return expdate;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}
	
	

}
