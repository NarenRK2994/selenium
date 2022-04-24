package com.location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SanapdealTask {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.snapdeal.com/login");
	
	WebElement txtusername = driver.findElement(By.id("userName"));
	txtusername.sendKeys("naren79@gmail.com");
}
}
