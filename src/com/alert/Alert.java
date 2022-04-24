package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver  = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	

	WebElement btnclick = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	btnclick.click();
	Thread.sleep(2000);
	
	WebElement btnclick2 = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
	btnclick2.click();

	Thread.sleep(2000);
	org.openqa.selenium.Alert alert = driver.switchTo().alert();
	alert.sendKeys("Naren");
	alert.accept();
	
	
	
	Thread.sleep(2000);
	WebElement txtprint = driver.findElement(By.id("demo1"));
	String text = txtprint.getText();
	System.out.println(text);
}
}
