package selenium_practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class chromelaunch {

	public static void main(String[] args) throws IOException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.facebook.com/");
		 File a = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 File f = new File("C:\\Users\\DELL\\Pictures\\Screens//"+"1.fblog"+".png");
		 
		 FileHandler.copy(a, f);
		 
		 driver.findElement(By.name("email")).sendKeys("praveen@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("praveen@123");
		 
		 File b =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		/*File x = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File e = new File("LINK"+"1.filename"+".png");
		FileHandler.copy(f, e);*/
		 File g = new File("C:\\Users\\DELL\\Pictures\\Screens//"+"2.fbcreate"+".png");
		 FileHandler.copy(b, g);
		 driver.findElement(By.name("login"));
	
	}
}
