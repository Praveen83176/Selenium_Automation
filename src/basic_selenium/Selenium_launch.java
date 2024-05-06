package basic_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_launch {

	public static void main(String[] args) throws InterruptedException {
 
	  WebDriver driver = new ChromeDriver();
	  
	  //driver.get("http://www.facebook.com");
	 // Thread.sleep(2000);
	  
	  driver.get("http://www.instagram.com");
	  
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  driver.navigate().back();
	  Thread.sleep(2000);
	  
	  driver.navigate().forward();
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  
	 // driver.navigate().refresh();
	//Thread.sleep(2000);
	 WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
	 username.sendKeys("9603011378");
	 // Thread.sleep(2000);
	  WebElement psw = driver.findElement(By.name("password"));
	  psw.sendKeys("Nani@1234");
	 // Thread.sleep(2000);
	WebElement button =  driver.findElement(By.xpath("//button[@type='submit']"));
	button.click();
	
	// driver.close();
	}

}
