package com.qa.test.Features.SeleniumTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.framework.base.Base;
import com.qa.framework.base.DriverContext;
import com.qa.test.Features.Pages.HomePage;
import com.qa.test.Features.Pages.LoginPage;

public class LoginTest extends Base {


	public static String appUrl = "http://automationpractice.com/index.php";
	public static String filePath;
	@BeforeClass
	public void initialize(){
		filePath = System.getProperty("user.dir");
		System.err.println(filePath=filePath+"\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",filePath);
		DriverContext.Driver = new ChromeDriver();
		DriverContext.Driver.navigate().to(appUrl);
	}
	
	@Test
	public void loginTest(){
		HomePage homePage = new HomePage();
		CurrentPage  = homePage.clickSignIn();
		((LoginPage)CurrentPage).clickLogin("kplokesh@gmail.com", "test123");
	}
	
	
	@AfterClass
	public void clearAll(){
		DriverContext.Driver.quit();
	}
}
