package com.qa.test.Features.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.qa.framework.base.BasePage;

public class LoginPage extends BasePage {
	
	public LoginPage() {

	}
	
	@FindBy(how = How.NAME, using ="email") public WebElement txtUserName;
	@FindBy(how = How.NAME, using ="passwd") public WebElement txtPassword;
	@FindBy(how = How.NAME, using ="SubmitLogin") public WebElement btnLogin;


	public HomePage clickLogin(String userName, String passWord){
		txtUserName.sendKeys(userName);
		txtPassword.sendKeys(passWord);
		btnLogin.click();
		return new HomePage();
	}
}
