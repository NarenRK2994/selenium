package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationpracticeTask {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://toolsqa.com/selenium-training?q=banner#enroll-form");
	WebElement txtfirstname = driver.findElement(By.id("first-name"));
	txtfirstname.sendKeys("Narendran");
	
	WebElement txtlastname = driver.findElement(By.id("last-name"));
	txtlastname.sendKeys("R");
	
	WebElement txtemail = driver.findElement(By.id("email"));
	txtemail.sendKeys("naren7921an@gmail.com");
	
	WebElement txtmobile = driver.findElement(By.id("mobile"));
	txtmobile.sendKeys("9500880115");

	WebElement btnselect = driver.findElement(By.xpath("//select[@name='country']"));
	btnselect.sendKeys("India");
	
	WebElement txtcity = driver.findElement(By.xpath("//input[@name='city']"));
	txtcity.sendKeys("Dindigul");
	
	WebElement txtaddress = driver.findElement(By.xpath("//textarea[@name='message']"));
	txtaddress.sendKeys("4/139 a, Vannampatti"+"\n"+"Dindigul"+"\n"+"624707");
}
}
