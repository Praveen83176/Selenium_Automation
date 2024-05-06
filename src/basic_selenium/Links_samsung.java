package basic_selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Links_samsung {

	public static void main(String[] args) throws InterruptedException {
   
   // WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.google.com");
	driver.navigate().to("https://www.amazon.in");
	
	driver.findElement(By.linkText("Mobiles")).click();
	
	Actions act = new Actions(driver);
	
	WebElement wbt = driver.findElement(By.linkText("Mobiles & Accessories"));
	Thread.sleep(3000);
	act.moveToElement(wbt).build().perform();
	
	driver.findElement(By.linkText("Samsung")).click();
	
List<WebElement> elet=	driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
	
int links =elet.size();
 System.out.println("The total links of Samsung mobiles in the page is :"+links);

 for(int i=0;i<elet.size();i++) {
	 String str = elet.get(i).getText();
	 System.out.println("The list of all the Samsung mobiles in the page is :"+str);
 }
 
 driver.quit();
 
 
	}

}
