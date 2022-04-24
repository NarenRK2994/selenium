package com.location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	WebElement txtuser = driver.findElement(By.id("email"));
	txtuser.sendKeys("naren9500@gmail.com");
	
	WebElement txtpass = driver.findElement(By.id("pass"));
	txtpass.sendKeys("9500880115");
	
	Thread.sleep(4000);
	
	WebElement btnclick = driver.findElement(By.name("login"));
	btnclick.click();
}
}
