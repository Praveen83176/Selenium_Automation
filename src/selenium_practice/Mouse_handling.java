package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Mouse_handling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login?URL=//www.naukri.com/mnjuser/profile");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@title='Explore top companies hiring on Naukri']"))).perform();
		String actual = driver.getTitle();
		String expect = "Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com";
//		System.out.println(driver.getTitle());
//		if(actual.equals(expect)) {
		
//			System.out.println("True");
//		}
//			else {
//				System.out.println("False");
//
//		}
		
		Assert.assertEquals(actual, expect,"");
		
	}

}
