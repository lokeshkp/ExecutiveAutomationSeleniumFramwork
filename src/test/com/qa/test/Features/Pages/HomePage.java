package com.qa.test.Features.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.qa.framework.base.BasePage;

public class HomePage extends BasePage{

	public HomePage() {
	}
	
	@FindBy(how = How.CLASS_NAME, using ="login") public WebElement signInLink;
	@FindBy(how = How.XPATH, using ="//a[text()='Women']") public WebElement linkWomen;
	
	public LoginPage clickSignIn(){
		signInLink.click();
		return new LoginPage();
	}
	
	public WomenDressPage clickWomenTab(){
		linkWomen.click();
		return new WomenDressPage();
	}

}
