package AmazonPOB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SearchResult {
	
	@FindBy(xpath = "//span[contains(text(),'2020 Apple MacBook Air Laptop: ')]") WebElement computer;
	
	
	WebDriver driver;
	
		public int verifytext(){			
		int numberofelements = driver.findElements(By.xpath("//span[text()='1-16 of over 20,000 results for']")).size();		
		return numberofelements;
	}
		
		public void computerclick() {
			computer.click();
		}
		
		
		public SearchResult(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		

}
