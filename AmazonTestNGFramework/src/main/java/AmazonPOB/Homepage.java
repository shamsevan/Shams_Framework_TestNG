package AmazonPOB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy(name= "field-keywords") WebElement searchfield;
	@FindBy(id ="nav-search-submit-button" ) WebElement searchbutton;
	
	public WebDriver driver;

	
	public void searchsendkeys(String wordstosearch) {
		
		searchfield.sendKeys(wordstosearch);
		
	}
	
	public void searchbuttonclick() {
		searchbutton.click();
	}
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

}
