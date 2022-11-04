package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class baseclass {
public WebDriver driver;
public Properties prop;
public void initilizerDriver() throws IOException {
	
	//To read the data
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");

	//access the data.properties file.
	 prop=new Properties();
// loading the readed file
	prop.load(fis);

String browserName=prop.getProperty("browser");
 
if(browserName.equalsIgnoreCase("chrome")) {
	
	//  WebDriverManager.chromedriver()browserVersion(79.0.9).setup();  //to run specific version.
	  WebDriverManager.chromedriver().setup();  //To run with latest browser
		 driver = new ChromeDriver();
}

else {
	System.out.println("please enter proper  browser value");
}
}
	@BeforeMethod
	public void launchURL() throws IOException {
		 initilizerDriver() ;
		 //this driver have scope
		 String url=prop.getProperty("url");
		 driver.get(url);

}
}