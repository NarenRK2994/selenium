package com.location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTask {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	
	WebElement txtsearch = driver.findElement(By.name("q"));
	txtsearch.sendKeys("Greens Technology");
	
	
}
}
