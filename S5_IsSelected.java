package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S5_IsSelected {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");// ucan use "//" also
		//Open the browser
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/JavaAndSelenium/BesantTechnology%20docs/Selenium%20Concepts/HTMLcode/IdentifyDynamicElement.html");
		
		boolean status = driver.findElement(By.xpath("//tr[1]//td/input")).isSelected();
		System.out.println(status);
		
		if(status==true)//if(status)--both are same
		{
			System.out.println("Checkbox is selected");
		}
		else
		{
			System.out.println("Checkbox is not selected");
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//tr[1]//td/input")).click();
		
		boolean status1 = driver.findElement(By.xpath("//tr[1]//td/input")).isSelected();
		System.out.println(status1);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
