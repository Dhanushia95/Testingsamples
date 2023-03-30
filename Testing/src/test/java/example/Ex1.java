package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex1 {
	
	public static void main(String[] arg) throws InterruptedException
	{
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\dell\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement searchbox =driver.findElement(By.xpath("//input[@name='q']"));
		searchbox.sendKeys("selenium");
		//WebDriverWait wait = new WebDriverWait(driver , 20);
		//driver.wait(1000);
		Thread.sleep(1000);
		  List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		  System.out.println("searched list is:"); 
		  for(WebElement ele : list)
		  {
		  System.out.println(ele.getText());
		  }
		 
		
	}
}

