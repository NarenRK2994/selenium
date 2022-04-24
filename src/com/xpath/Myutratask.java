package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myutratask {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/register");	

	
	WebElement txtmobile = driver.findElement(By.className("//input[@class='form-control mobileNumberInput']"));
	txtmobile.sendKeys("9500880115");
	
	WebElement btncontinue = driver.findElement(By.className("//div[@class='submitBottomOption']"));
	btncontinue.click();
}	
}
