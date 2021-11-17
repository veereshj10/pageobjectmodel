package com.cucumber_testcases;


import java.io.IOException;


import org.testng.annotations.Test;
import com.cucumber_pom.loginpom;



public class loginPage extends BaseClass
{
    
	@Test
	public void loginTest() throws IOException, InterruptedException 
	{
			
		
        logger.info("*********Login Stared*****");
		
		loginpom lp=new loginpom(driver);
		
		
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		Thread.sleep(5000);
		
		lp.Logout();
		logger.info("*********Login ended*****");
	}
	

}
