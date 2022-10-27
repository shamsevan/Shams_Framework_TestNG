package Common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Commons {
	
	 public WebDriver driver;

  @Parameters({"browser","website"}) 
  @BeforeClass
  public void beforeClass(String Ibrowser,String url) {	  
	  String projectpath =System.getProperty("user.dir");
	  
      if (Ibrowser.equalsIgnoreCase("chrome")) {
    	  System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromedriver.exe");
    	  
    	  driver = new ChromeDriver();   	  
    	  
    	  driver.navigate().to(url);
    	  
    	  driver.manage().window().maximize();
      }
      
          else if ( Ibrowser.equalsIgnoreCase("Edge")) {
    	  
          System.setProperty("webdriver.edge.driver", projectpath+"\\Drivers\\msedgedriver.exe");
    	  
    	  driver = new EdgeDriver();   	  
    	  
    	  driver.navigate().to(url);
    	  
    	  driver.manage().window().maximize();
    	  
      }      	  
  }
  
  @AfterClass
  public void afterClass() throws IOException {
	  	  
	 
  }
  
  
  public void Screenshots(String Folder) throws IOException {
		
		String projectpath = System.getProperty("user.dir");
		
		Date objects = new Date();	
		System.out.println(objects);
		String Dfile = objects.toString().replace(" ", "_").replace(":", "_");
		System.out.println(Dfile);		
		File HomepageSS =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileHandler.copy(HomepageSS, new File(projectpath+"\\Pictures\\"+Folder+"\\"+Dfile+"Home.jpg"));	
		}
  
  

}
