package com.location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramTask {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/");
	
	WebElement txtusername = driver.findElement(By.name("username"));
	txtusername.sendKeys("naren7921");
	WebElement txtpassword = driver.findElement(By.name("password"));
	txtpassword.sendKeys("79797434");
	
	
	}
}