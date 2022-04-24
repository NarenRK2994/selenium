package com.waits;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver  = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();

	WebElement btnclick = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	btnclick.click();
	
	WebDriverWait driverwait= new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement until = (WebElement) driverwait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		until.sendKeys("Naren");
	
	
//FluentWait w = new FluentWait(driver);			
//			
//w.withTimeout(Duration.ofSeconds(30));
//w.pollingEvery(Duration.ofSeconds(5));
//w.ignoring(NoSuchElementException.class);


		
	
	}
}