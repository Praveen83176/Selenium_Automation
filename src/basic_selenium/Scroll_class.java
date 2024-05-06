package basic_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_class {

	public static void main(String[] args) {
       WebDriver driver = new ChromeDriver();
       
       driver.get("https://www.irctc.co.in/nget/train-search");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
       JavascriptExecutor js = (JavascriptExecutor)driver;
      // scroll pixel
      // js.executeScript("window.scrollBy(0,600)");
      // js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
       
       //WebElement ele = driver.findElement(By.cssSelector("div.iconsection>ul>li:nth-child(2)>a"));
      // js.executeScript("arguments[0].scrollIntoView();",ele);
       WebElement ele = driver.findElement(By.cssSelector("div.iconsection>ul>li:nth-child(3)>a"));
		js.executeScript("arguments[0].scrollIntoView();",ele);
		
       }

}
