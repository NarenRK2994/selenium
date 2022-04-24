package com.windows;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandler {
	public static void main(String[] args) throws IOException {
		
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
		
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
	txtsearch.sendKeys("Oopo a 31");
	WebElement button = driver.findElement(By.id("nav-search-submit-button"));
	button.click();
	WebElement search = driver.findElement(By.className("s-image"));
	search.click();
	
	String parent = driver.getWindowHandle();
	System.out.println(parent);
	
	Set<String> allpage = driver.getWindowHandles();
	System.out.println(allpage);
	
	for (String child : allpage) {
		if (!(child.equals(parent))) {
			driver.switchTo().window(child);
		}
		
	}

	
	
	WebElement add = driver.findElement(By.xpath("//input[@value='Add to Cart']"));
	add.click();

	TakesScreenshot ts = (TakesScreenshot)driver;
	File as = ts.getScreenshotAs(OutputType.FILE);
	System.out.println(as);

	FileUtils.copyFile(as,new File( "C:\\Users\\Gowtham\\Pictures\\Screenshots\\windowshan.png"));
	
	
	
	}
}