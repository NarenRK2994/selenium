package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyTask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		
		WebElement btnsign = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		btnsign.click();
		
		WebElement txtmobile = driver.findElement(By.xpath("//input[@id='mobile']"));
		txtmobile.sendKeys("9500880115");
		WebElement txtname = driver.findElement(By.xpath("//input[@id='name']"));
		txtname.sendKeys("Narendran");
		WebElement txtemail = driver.findElement(By.xpath("//input[@id='email']"));
		txtemail.sendKeys("naren7921an@gmail.com");
		WebElement txtpassword = driver.findElement(By.xpath("//input[@id='password']"));
		txtpassword.sendKeys("naren7921an");
		WebElement btncontinue = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		btncontinue.click();
	
	}
}
