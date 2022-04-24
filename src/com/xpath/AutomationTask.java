package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTask {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Register.html");
	
	WebElement txtname = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required'][1]"));
	txtname.sendKeys("Narendran");
	
	WebElement txtaddress = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
	txtaddress.sendKeys("4/139 a, Vannampatti"+"\n"+"Dindigul"+"\n"+"624707");
	
	WebElement txtemail = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']"));
	txtemail.sendKeys("naren7921an@email.com");
	
	
	WebElement btngender = driver.findElement(By.xpath("//input[@value='Male']"));
	btngender.click();
		
	WebElement txtlanguage = driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']"));
	txtlanguage.sendKeys("English");
	
	



}
}
