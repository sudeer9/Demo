package com.scripts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S18_FileUpload2 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		File f=new File("./Photos/cv.docx"); 
		String path = f.getAbsolutePath();
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/JavaAndSelenium/BesantTechnology%20docs/Selenium%20Concepts/HTMLcode/mypage.html");
	    driver.findElement(By.id("fileupload")).sendKeys(path);
		System.out.println("This statement is executed after the file is uploaded");
	    Thread.sleep(2000);
		driver.quit();

	}

}
