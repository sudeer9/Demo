package com.scripts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S8_JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");// ucan use "//" also
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//enter value into username field
		String script="document.getElementById('username').value='Sudeer'";
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(script);
		
		Thread.sleep(2000);
		
		//Clear value From username field
		String script1="document.getElementById('username').value=''";
		
		js.executeScript(script1);
		Thread.sleep(3000);
		driver.quit();

	}

}
