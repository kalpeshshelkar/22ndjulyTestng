package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageobjectmodel.loginpageobject;
import resources.CommonUtilities;
import resources.baseclass;
import resources.Constant;

public class verifylogin extends baseclass{
@Test
	public void login() throws IOException {
	 
	 loginpageobject obj=new  loginpageobject(driver);
	 
	 obj.enterUsername().sendKeys(Constant.username);
	 //CommonUtilities.handlExceplictwait1(10,obj.enterpassword());
	 obj.enterPassword().sendKeys(Constant.password);
	 obj.ClickOnLogin().click();
	 
	CommonUtilities.handleAssertions(Constant.expectedString,obj.errorMessage().getText());
}
}