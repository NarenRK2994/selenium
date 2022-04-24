package org.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver  = new ChromeDriver();
	
	driver.get("https://www.t-mobile.com/?src=spr&rdpage=/");
	driver.manage().window().maximize();
	
	WebElement element = driver.findElement(By.xpath("//button[@class='phx-button phx-button--primary']"));
	element.click();
	
	Thread.sleep(5000);
	
	WebElement element2 = driver.findElement(By.xpath("//button[@class='tntOverlayCloseBtn']"));
	element2.click();	
	 
	Thread.sleep(5000);
	

	
	WebElement btnauto = driver.findElement(By.xpath("//a[text()='Phones & devices']"));
	Actions action = new Actions(driver);
	action.moveToElement(btnauto).perform();
	
	Thread.sleep(3000);
	
	WebElement btnauto2 = driver.findElement(By.xpath("//a[text()='5G phones']"));
	btnauto2.click();
	
	
	Thread.sleep(5000);
	
	WebElement txt = driver.findElement(By.xpath("//a[text()=' Do Not Sell My Personal Information']"));
	String text = txt.getText();
	System.out.println(text);

	
	
	
	
}
}
