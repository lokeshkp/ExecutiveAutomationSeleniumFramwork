package com.qa.test.Features.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.qa.framework.base.BasePage;

public class WomenDressPage extends BasePage{

	public WomenDressPage() {

	}

	
	@FindBy(how = How.CLASS_NAME, using ="icon-th-list") public WebElement listView;
	@FindBy(how = How.CLASS_NAME, using ="product-count") public WebElement prodCount;

	
	public void productView(){
		listView.click();
	}
	
	public String getProdCount(){
		return prodCount.getText();
	}
}
