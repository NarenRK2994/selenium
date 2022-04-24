package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CleartripTask {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.cleartrip.com/trains");
	
	WebElement txtfrom = driver.findElement(By.id("from_station"));
	txtfrom.sendKeys("Chennai");
	
	WebElement txtto = driver.findElement(By.id("to_station"));
	txtto.sendKeys("Dindigul");

	WebElement btnclick = driver.findElement(By.id("trainClass"));
	btnclick.click();
}
}
