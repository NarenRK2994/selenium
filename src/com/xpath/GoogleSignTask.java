package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSignTask {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");	

	WebElement txtfirstName = driver.findElement(By.xpath("//input[@id='firstName']"));
	txtfirstName.sendKeys("Naren");
	
	WebElement txtlastName = driver.findElement(By.xpath("//input[@id='lastName']"));
	txtlastName.sendKeys("Rk");
	
	WebElement txtuser = driver.findElement(By.xpath("//input[@id='username']"));
	txtuser.sendKeys("naren9500");
	
	WebElement txtpassword = driver.findElement(By.xpath("//input[@name='Passwd']"));
	txtpassword.sendKeys("naren7921");

	WebElement txtconfrom = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
	txtconfrom.sendKeys("naren7921");
	
	


}
}
