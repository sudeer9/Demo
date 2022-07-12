package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S6_ReplaceExistingText_VerifyCheckboxIsEmptyOrNot 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");// ucan use "//" also
		//Open the browser
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/JavaAndSelenium/BesantTechnology%20docs/Selenium%20Concepts/HTMLcode/mypage.html");
		driver.manage().window().maximize();
		
		WebElement textBox = driver.findElement(By.id("textbox"));		
		//to verify whether the given text box is empty or not
		String textBoxValue = textBox.getAttribute("value");
		if(textBoxValue.length()==0)
		{
			System.out.println("text box is empty");
		}
		else
		{
			System.out.println("text box is not empty");
		}	
		
		Thread.sleep(2000);
		//to set the value to the properties during runtime.
		//below code is to set value to the "value" attribute 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('textbox').setAttribute('value', '')");
		Thread.sleep(2000);
		//we have cleared/set empty value to the "value" attribute in above code
		//to verify text box is empty or not
		String textBoxValue1 = textBox.getAttribute("value");
															
		if(textBoxValue1.length()==0)
		{
			System.out.println("text box is empty");
		}
		else
		{
			System.out.println("text box is not empty");
		}
		driver.quit();
		
		
		

	}

}
