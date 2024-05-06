package basic_selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpath_facebook {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("praveen");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='pass']"))).sendKeys("1234");
	
	//WebDriverWait stop = new WebDriverWait(driver,Duration.ofSeconds(5));
	//stop.until(ExpectedConditions.elementToBeClickable
		//driver.findElement((By.xpath("//button[@name='login']"))).click();
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.name("firstname")).sendKeys("praveen");
		driver.findElement(By.name("lastname")).sendKeys("N");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("9603011378");
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345");
		
	WebElement dd =	driver.findElement(By.xpath("(//select[@name='birthday_day'])"));
	Select date = new Select(dd);
	date.selectByValue("29");
	
	WebElement dd1 = driver.findElement(By.xpath("(//select[@name='birthday_month'])"));
	Select month = new Select(dd1);
	WebElement dd2 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	Select year = new Select(dd2);
	year.selectByValue("2022");
	
	//driver.findElement(By.id("//input[@id='u_3_5_et']")).click();
	
	Thread.sleep(2000);
	
	//WebElement ele= driver.findElement(By.cssSelector("(//input[@class='_8esa'])[2]"));
	 driver.findElement(By.name("sex")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.name("websubmit")).click();
	
	//ele.click();
	
	
	driver.quit();
	
	
	
	}
}
