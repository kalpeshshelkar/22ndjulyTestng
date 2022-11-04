package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpageobject {

	public WebDriver driver;//this driver dont have scope
//driver.findelement(by.xpath("//xyz")).sendkeys("test");
	
By username=By.xpath("//input[@id='username']");
By password=By.xpath("//input[@id='password']");
By login=By.xpath("//input[@id='Login']");
	
By tryForFree=By.xpath("//a[@id='signup_link']");

By actualErrorMessage=By.xpath("//div[@id='error']");

	public loginpageobject(WebDriver driver2) {
		this.driver=driver2;
	// TODO Auto-generated constructor stub
}
	public WebElement enterUsername() {
		return driver.findElement(username);
	}
	public WebElement enterPassword() {
		return driver.findElement(password);
}
	public WebElement ClickOnLogin() {
		return driver.findElement(login);
	}
	public WebElement clickOnTryForFree() {
		return driver.findElement(tryForFree);
	}
	public WebElement errorMessage() {
		return driver.findElement(actualErrorMessage);
}
}