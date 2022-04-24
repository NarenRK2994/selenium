package org.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver  = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();

	WebElement s = driver.findElement(By.id("credit2"));
	WebElement d = driver.findElement(By.id("bank"));
	Actions actions = new Actions(driver);
	actions.dragAndDrop(s, d).perform();
	
	Thread.sleep(3000);
	
	WebElement s1 = driver.findElement(By.id("fourth"));
	WebElement d1 = driver.findElement(By.id("amt7"));
	actions.dragAndDrop(s1, d1).perform();

	Thread.sleep(3000);
	
	WebElement s2 = driver.findElement(By.id("credit1"));
	WebElement d2 = driver.findElement(By.id("loan"));
	actions.dragAndDrop(s2, d2).perform();

	Thread.sleep(3000);
	
	WebElement s3 = driver.findElement(By.id("fourth"));
	WebElement d3 = driver.findElement(By.id("amt8"));
	actions.dragAndDrop(s3, d3).perform();
	
	Thread.sleep(3000);
	
	WebElement txt = driver.findElement(By.xpath("//div[@class='table4_result']"));
	String text = txt.getText();
	System.out.println(text);



}
}
