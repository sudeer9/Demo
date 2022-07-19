package com.scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S19_FileDownloadPopupFirefox 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");// u can use "//" also
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=79.0.3945.36/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='chromedriver_win32.zip']")).click();
		Thread.sleep(2000);
		
		//Press Alt+S to select ‘Save’ radio button & Press ‘Enter’ 
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT); 
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT); 
		r.keyRelease(KeyEvent.VK_S); 
		r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER); 
		//r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.quit();


	}

}
