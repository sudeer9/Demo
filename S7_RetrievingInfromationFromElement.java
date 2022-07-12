package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S7_RetrievingInfromationFromElement {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");// ucan use "//" also
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/BackupFromOldLaptop/JavaAndSelenium/BesantTechnology%20docs/Selenium%20Concepts/HTMLcode/getAttribute.html");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("a1"));
		
		String toolTiptext = element.getAttribute("title");
		System.out.println(toolTiptext);
		
		String URL = element.getAttribute("href");
		System.out.println(URL);
		
		String linkText = element.getText();
		System.out.println(linkText);
		
		String tagName = element.getTagName();
		System.out.println(tagName);
		 Thread.sleep(2000);
		 
		 driver.quit();
		 
		

	}

}
