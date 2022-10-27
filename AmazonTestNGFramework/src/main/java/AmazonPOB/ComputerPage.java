package AmazonPOB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage {
	
	public WebDriver driver;
	
	@FindBy(name = "submit.add-to-cart") WebElement AddtoCart;
	
	@FindBy(xpath = "//input[@aria-labelledby='attachSiNoCoverage-announce']") WebElement NoThanks;
	
	@FindBy(xpath = "//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']") WebElement ProceedtoCheckout;
	
	
	public void clickonAddToCart() {
		AddtoCart.click();
	}
	
	
	public void NoThanksClick() {
		NoThanks.click();
	}
	
	public void Proceed_To_Checkout() {
		ProceedtoCheckout.click();
		int i = 0;
		
	}
		
	public ComputerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//Hi this is evan
	
	

}
