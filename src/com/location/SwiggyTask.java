package com.location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyTask {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
		
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.swiggy.com/");
	
	WebElement txtusername = driver.findElement(By.id("location"));
	txtusername.sendKeys("solinganallur");
	
}
}
