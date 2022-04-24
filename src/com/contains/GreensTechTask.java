package com.contains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechTask {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	Thread.sleep(3000);
	
	WebElement btnclick = driver.findElement(By.xpath("//span[text()='Overview']"));
	btnclick.click();
	Thread.sleep(3000);
	
	WebElement txtprint = driver.findElement(By.xpath("//div[@id='collapse661']"));
	String text = txtprint.getText();
	System.out.println(text);
	
}
}
