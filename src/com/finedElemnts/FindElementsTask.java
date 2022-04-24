package com.finedElemnts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsTask {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	WebElement r1 = driver.findElement(By.id("customers"));
	List<WebElement> r2 = r1.findElements(By.tagName("tr"));
	
	for (int i = 0; i < r2.size(); i++) {
		if (i==r2.size()/2) {
			WebElement w1 = r2.get(i);
			String text = w1.getText();
			System.out.println(text);
		}
	}	}
}