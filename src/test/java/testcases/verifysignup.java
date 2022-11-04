package testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjectmodel.SignUpObject;
import pageobjectmodel.loginpageobject;
import resources.CommonUtilities;
import resources.baseclass;

public class verifysignup extends baseclass {
@Test
public void signup() throws IOException, InterruptedException {
	 initilizerDriver() ;
	 driver.get("https://login.salesforce.com");
	
	 loginpageobject LPO=new loginpageobject(driver);
	LPO.clickOnTryForFree().click();
	
	SignUpObject SPO=new SignUpObject(driver);
	Thread.sleep(3000);
	SPO.enterFirstname().sendKeys("Constant.Firstname");
	SPO.enterLastname().sendKeys("Constant.Lastname");
	SPO.jobTitle().sendKeys("Constant.JobTitle");
	
	SPO.Email().sendKeys("Constant.Email");
	SPO.phone().sendKeys("Constant.phone");

	//employees dropdown
	CommonUtilities.handleStaticDropdown(SPO.selectEmployees(), 1);
	Thread.sleep(3000);
	//region
	CommonUtilities.handleStaticDropdown(SPO.region(), 5);
	
	SPO.checkbox().click();
	
}	
}
