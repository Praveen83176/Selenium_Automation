package testngpack;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Task_FB_login {
	  public static WebDriver driver;
 
	  @Test(priority  = 1)
	  public void pageTitle() {
		  
		  String ExpTitle = "Facebook – log in or sign up";
		  String actualtitle = driver.getTitle();
         Assert.assertEquals(ExpTitle, actualtitle, "the title not expected");
	  
	  
	 // @Test(priority = 2)
	 // public void Loginpage(){
		  
		WebElement email =  driver.findElement(By.id("email"));
		email.sendKeys("genamplify.sol");
		
	    WebElement Password = driver.findElement(By.id("pass"));
	    Password.sendKeys("Nani@1");
	    
	     WebElement log = driver.findElement(By.name("login"));
	     log.click();
		  
	     System.out.println("current URl "+ driver.getCurrentUrl());
	     
	  }
  @BeforeMethod
  public void launchbrowser() {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  System.out.println("The Page Title is "+driver.getTitle());
  }

  @AfterMethod
  
	  public void afterMethod() {
		  
		  driver.quit();
	  
  }

}
