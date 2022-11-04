package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpObject {
public WebDriver driver;
By firstname=By.xpath("//input[@name='UserFirstName']");	
By lastname=By.xpath("//input[@name='UserLastName']");	
By jobTitle=By.xpath("//input[@name='UserTitle']");
By Email=By.xpath("//input[@type='email']");
By phone=By.xpath("//input[@type='tel']");
By employees=By.xpath("//select[@name='CompanyEmployees']");
By company=By.xpath("//input[@name='CompanyName']");	
By Region=By.xpath("//select[@name='CompanyCountry']");
By checkbox=By.xpath("//div[@class='checkbox-ui']");	



	public SignUpObject(WebDriver driver4) {
		this.driver=driver4;
		// TODO Auto-generated constructor stub
	}
	public WebElement enterFirstname() {
		return driver.findElement(firstname);																		
	}
	public WebElement enterLastname() {
		return driver.findElement(lastname);		
}
	public WebElement jobTitle() {
		return driver.findElement(jobTitle);
	}
	public WebElement Email() {
		return driver.findElement(Email);
	}
	public WebElement phone() {
		return driver.findElement(phone);
	}
	public WebElement selectEmployees() {
		return driver.findElement(employees);
	}
	public WebElement company() {
		return driver.findElement(company);
		}
	public WebElement region() {
		return driver.findElement(Region);
		}
	public WebElement checkbox() {
		return driver.findElement(checkbox);
	}
	
	
}
