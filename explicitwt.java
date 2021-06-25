package com.Launch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
//import java.util.List;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.interactions.Actions;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class explicitwt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\College\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.partialLinkText("Welcome")).click();
	    WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//ExplicitWait until()
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout"))).click();
		
		driver.close();
		
	}

}
