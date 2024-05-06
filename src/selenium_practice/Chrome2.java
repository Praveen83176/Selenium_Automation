package selenium_practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Chrome2 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
	   File a =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  File c = new File("C:\\Users\\DELL\\Pictures\\Screens//"+"1.fblog"+".png");
  FileHandler.copy(a, c);
	}

}
