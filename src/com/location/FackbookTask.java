package com.location;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FackbookTask {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
		
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	Actions action = new Actions(driver);
	action.keyDown(Keys.ENTER).keyUp(Keys.ENTER);

	String title = driver.getTitle();
	System.out.println(title);
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	
	WebElement txtusername = driver.findElement(By.id("email"));
	txtusername.sendKeys("naren7921@gmail.com");
	
	WebElement txtpassword = driver.findElement(By.id("pass"));
	txtpassword.sendKeys("naren95@");
	
}
}
