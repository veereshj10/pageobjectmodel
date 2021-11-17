package com.cucumber_testcases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	
	
	public String baseURL="http://admin-demo.nopcommerce.com/login";
	public String username="admin@yourstore.com";
	public String password="admin";
	public static WebDriver driver;
	public static Logger logger;
	

	
	
	@BeforeClass
	public void setup()
	{			
		//Logging
				logger=Logger.getLogger("CucumberAutomation");
				PropertyConfigurator.configure("Log4j.properties");
				logger.setLevel(Level.DEBUG);
		
		
			System.setProperty("webdriver.chrome.driver","C://Windows//chromedriver.exe");
			driver=new ChromeDriver();

		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	
	
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
}

