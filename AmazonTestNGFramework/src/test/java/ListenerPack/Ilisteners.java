package ListenerPack;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Common.Commons;

public class Ilisteners extends Commons implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {	
		
		this.driver= ((Commons)result.getInstance()).driver;
		
		try {
			Screenshots("Success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		this.driver= ((Commons)result.getInstance()).driver;
		
		try {
			Screenshots("Failed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	} 
	
	//@override Screenshot method (non static) 

}
