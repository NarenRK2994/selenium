package com.location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcbankTask {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");

	WebElement txtuser = driver.findElement(By.xpath("//input[@class='form-control text-muted']"));
	txtuser.sendKeys("Naren7921");
	WebElement btnlogin = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
	btnlogin.click();
	WebElement txtpassword = driver.findElement(By.xpath("//input[@class='form-control text-muted']"));
	txtpassword.sendKeys("Naren7921");
	WebElement btnlogin1 = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
	btnlogin1.click();
	
}
}