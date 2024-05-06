package selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_navigation {

	public static void main(String[] args) throws InterruptedException {
     
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.naukri.com/nlogin/login?URL=//www.naukri.com/mnjuser/profile");
		//driver.navigate().back();
		Thread.sleep(30);
		//driver.navigate().forward();
		driver.navigate().refresh();
		

	}

}
