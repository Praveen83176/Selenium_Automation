package basic_selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Links_Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		drive.get("https://www.amazon.in/");
		drive.findElement(By.linkText("Mobiles")).click();
		
		Actions act = new Actions(drive);
		
		WebElement wbt = drive.findElement(By.linkText("Mobiles & Accessories"));
		Thread.sleep(3000);
		act.moveToElement(wbt).build().perform();
		
		drive.findElement(By.linkText("Samsung")).click();
		
		List<WebElement> ele = drive.findElements(By.tagName("a"));
		int links =ele.size();
		System.out.println("The count of the links are :"+links);
		//System.out.println("The count of the all the links are :"+ele.size());
		
		for(WebElement totallinks:ele) {
			
			String tlinks = totallinks.getText();
			System.out.println(tlinks);
		}
		
		drive.quit();
		
	} 

}
