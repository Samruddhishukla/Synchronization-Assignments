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
import java.util.List;
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class handlingtltp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\College\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/test/social-icon.html");
		
		//Thread.sleep(50000);
		List<WebElement> toolTip = driver.findElements(By.xpath(".//*[@id='top-bar']/div/div/div/div/a"));
		
		for(WebElement we : toolTip)
		{
			System.out.println("Actual tool tip  " +we.getAttribute("title"));
		}
	}

}
