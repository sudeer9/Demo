package com.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S4_PressingEnterKey {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[.='Login ']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.quit();
		/*
		 * WebElement xpathOfLoginButton =
		 * driver.findElement(By.xpath("//div[.='Login ']")); WebDriverWait loginButton
		 * = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * loginButton.until(ExpectedConditions.elementToBeClickable(xpathOfLoginButton)
		 * ); xpathOfLoginButton.sendKeys(Keys.ENTER);//(Keys.RETURN)
		 */
        
       
       
        
        

	}

}
