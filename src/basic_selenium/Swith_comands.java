package basic_selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swith_comands {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dummysoftware.com/popupdummy_testpage.html");
       driver.findElement(By.xpath("(//a[contains(@href,'javascript:winopen')])[1]")).click();
       
       String MainWindow = driver.getWindowHandle();
       Set<String>s1 = driver.getWindowHandles();
       Iterator<String>i1 = s1.iterator();
       
       while(i1.hasNext()) {
			String Childwindow = i1.next();
			if(!MainWindow.equalsIgnoreCase(Childwindow)) {
				driver.switchTo().window(Childwindow);
				driver.close();
			}
		}
		
		driver.switchTo().window(MainWindow);
       
       
	}

}
