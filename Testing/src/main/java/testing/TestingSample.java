package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingSample {
	public static void main(String[] arg)
	
	//public void sample()
	{
	//	System.setProperty("WebDriver.gecko.driver", "C:\\Users\\dell\\Downloads\\geckodriver.exe")
		//ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("apple"+Keys.ENTER);
			
	}

}
