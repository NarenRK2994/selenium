package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusTask {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	WebElement btnsign = driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
	btnsign.click();
	WebElement btnclick = driver.findElement(By.id("signInLink"));
	btnclick.click();
	WebElement txtmobile = driver.findElement(By.id("mobileNoInp"));
	txtmobile.sendKeys("9500880115");
	WebElement btnotp = driver.findElement(By.xpath("//div[@id='otp-container']"));
	btnotp.click();
	
}
}
