package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HYR_selenium {

	public static void main(String[] args) throws Exception {
  // WebDrivermanager.chromedriver().setup();
   
   WebDriver driver = new ChromeDriver();
   driver.get("https://github.com/login");
   Thread.sleep(3000);

   //driver.findElement(By.name("email")).sendKeys("praveen@132");
   driver.findElement(By.id("login_field")).click();
   highlight(driver,driver.findElement(By.name("password")));
   Thread.sleep(3000);
   highlight(driver,driver.findElement(By.linkText("Forget password")));
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
public static void highlight(WebDriver driver,WebElement element) {
	JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
	jsExecutor.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:yellow'");
}
}
