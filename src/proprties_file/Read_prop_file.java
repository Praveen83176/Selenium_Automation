package proprties_file;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class Read_prop_file {
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
    
		//properties pro = new properties();
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("\\Users\\DELL\\Desktop\\Selenium\\src\\proprties_file\\file_call");
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		String URL = prop.getProperty("url");
		System.out.println(URL);
		String BrowserName = prop.getProperty("browser");
		System.out.println(BrowserName);
		
		//How to use the URL & Browser
		if(BrowserName.equals("chrome")) {
			driver = new ChromeDriver();
		}/*/else if (BrowserName.equals("safari")) {
			driver = new SafariDriver();
			
			driver.get(URL);
			
			//How to Enter values
			driver.findElement(By.xpath(prop.getProperty("FirstName_Xpath"))).sendKeys(prop.getProperty("FirstName"));
			driver.findElement(By.xpath(prop.getProperty("LastName_Xpath"))).sendKeys(prop.getProperty("LastName"));
			
			driver.findElement(By.xpath(prop.getProperty("Create_Xpath"))).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			new Select(driver.findElement(By.cssSelector(prop.getProperty("Month_Css")))).selectByVisibleText("May");
		}*/
		
		
		
	}

}
