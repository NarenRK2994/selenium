package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class filpkartTask {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");

	WebElement txtemail = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	txtemail.sendKeys("9500880115");
	WebElement txtpass = driver.findElement(By.xpath("//input[@type='password']"));
	txtpass.sendKeys("9500880115");
	WebElement btnlogin = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	btnlogin.click();
	
	
}
}
