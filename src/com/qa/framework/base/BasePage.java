package com.qa.framework.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

public abstract class BasePage extends Base{

	public BasePage(){
		PageFactory.initElements(DriverContext.Driver, this);
		DriverContext.Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				
	}
}
