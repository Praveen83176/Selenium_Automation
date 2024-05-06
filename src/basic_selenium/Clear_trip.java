package basic_selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_trip {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver drive = new ChromeDriver();	
		drive.manage().window().maximize();
		drive.get("https://www.google.com");
		Thread.sleep(3000);
		drive.navigate().to("https://www.cleartrip.com/trains");
		Thread.sleep(3000);
		drive.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		//Thread.sleep(2000);
		drive.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(3000);
		
		Set<String> hand = drive.getWindowHandles();
		Iterator<String> it = hand.iterator();
		
		String parentwindow = it.next();
		System.out.println("The ID of a parentwindow is :"+parentwindow);
		System.out.println("The Title of a ParentWindow is :"+drive.getTitle());
		
		
		String childwindow = it.next();
		System.out.println("The ID of a Childwindow is :"+childwindow);
		
		drive.switchTo().window(childwindow);
		System.out.println("The Title of a Childwindow is :"+drive.getTitle());
	
		Thread.sleep(3000);
		drive.close();
		
		
		String subchild = it.next();
		System.out.println("The ID of Subchild is :"+subchild);
		drive.switchTo().window(subchild);
		
		System.out.println("The Title of Subchild is :"+drive.getTitle());
	
		Thread.sleep(2000);
		drive.close();
		
		drive.switchTo().window(parentwindow);
		Thread.sleep(3000);
		
		drive.quit();
		
	}

}
