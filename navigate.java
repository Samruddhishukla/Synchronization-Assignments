package com.Launch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import java.util.List;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.interactions.Actions;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\College\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/");
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
	
		Thread.sleep(5000);
		driver.navigate().back();
		
		
		Thread.sleep(5000);
		driver.navigate().forward();
		driver.close();
		

	}

}
