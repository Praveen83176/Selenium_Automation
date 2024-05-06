package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.name("email")).sendKeys("praveen@123");
		driver.findElement(By.name("pass")).sendKeys("Gen1234");
		driver.findElement(By.name("login")).click();
		
		
		driver.findElement(By.cssSelector(null));
	}

}
