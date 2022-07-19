package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S17_FileUpload1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");// u can use "//" also
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/BackupFromOldLaptop/JavaAndSelenium/BesantTechnology%20docs/Selenium%20Concepts/HTMLcode/mypage.html");
	    driver.findElement(By.id("fileupload")).sendKeys("C:\\BackupFromOldLaptop\\JavaAndSelenium\\BesantTechnology docs\\Selenium Concepts\\HTMLcode\\mypage.txt");
	   Thread.sleep(3000);
	    System.out.println("This statement is executed after the file is uploaded");
	    Thread.sleep(2000);
	    driver.quit();


	}

}
