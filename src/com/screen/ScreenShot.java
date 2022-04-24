package com.screen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
public static void main(String[] args) throws InterruptedException, IOException {
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	
	WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
	txtsearch.sendKeys("Oppo A 31");
	
	WebElement btnclick = driver.findElement(By.id("nav-search-submit-button"));
	btnclick.click();
	
	Thread.sleep(3000);
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	
	File amascreen = ts.getScreenshotAs(OutputType.FILE);
	System.out.println(amascreen);
	
	FileUtils.copyFile(amascreen, new File("C:\\Users\\Gowtham\\Pictures\\Screenshots\\amazon.png"));
	
	
	
}
}
