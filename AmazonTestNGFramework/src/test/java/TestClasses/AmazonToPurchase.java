package TestClasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import AmazonPOB.ComputerPage;
import AmazonPOB.Homepage;
import AmazonPOB.SearchResult;
import Common.Commons;

public class AmazonToPurchase extends Commons  {
  @Test
  public void functions() throws InterruptedException {
	  
	//Tasks in Homepage
	Homepage hpob = new Homepage(driver);
	hpob.searchsendkeys("Computer");
	hpob.searchbuttonclick();
	
	Thread.sleep(6000);
	
	//Tasks for verify 	
	SearchResult srob = new SearchResult(driver);	
	int foundtext = srob.verifytext();
	System.out.println(foundtext);
	
	//verification with if else
	if( foundtext==1) {
		System.out.println("20000 is available in the result ");
	}
	
	else {
		System.out.println("result is not available");
	}
	
	//verification with soft Assert:
	SoftAssert asrtob= new SoftAssert();
	
	asrtob.assertEquals(foundtext, 1);
	
	asrtob.assertAll();
	
	//click on Computer
	srob.computerclick();
	
	Thread.sleep(3000);
	
	//click on add to cart button
	ComputerPage adcOB = new ComputerPage(driver);	
	adcOB.clickonAddToCart();
	
	Thread.sleep(3000);
	
	//click on no thanks:
	adcOB.NoThanksClick();
	
	Thread.sleep(3000);
	
	//click on proceed to checkout 
	adcOB.Proceed_To_Checkout();
	
	
	
	
	
	
	
	
	
	  
  }
}
