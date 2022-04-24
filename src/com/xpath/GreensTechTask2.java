package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechTask2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement btnclick = driver.findElement(By.xpath("//h2[@class='mb-0'][2]"));
		btnclick.click();
		
		WebElement btnclick2 = driver.findElement(By.xpath("//i[@class='fas fa-arrow-right'][19]"));
		btnclick2.click();
		
	}
}
