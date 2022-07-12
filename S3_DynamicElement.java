package com.scripts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class S3_DynamicElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");// u can use "//" also
		//Open the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/BackupFromOldLaptop/JavaAndSelenium/BesantTechnology%20docs/Selenium%20Concepts/HTMLcode/IdentifyDynamicElement.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//tr[td[text()='A1']]/td[2]")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
