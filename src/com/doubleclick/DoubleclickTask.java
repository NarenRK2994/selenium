package com.doubleclick;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class DoubleclickTask {
public static void main(String[] args) throws InterruptedException, AWTException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	
	WebDriver driver= new ChromeDriver();
	driver.get("http://greenscart.in/#/login?returnUrl=%2F");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement txtuser = driver.findElement(By.id("loginEmailId"));
	txtuser.sendKeys("naren7921an@gmail.com");
	
	WebElement txtpass = driver.findElement(By.id("loginPassword"));
	txtpass.sendKeys("Naren7921@");
	
	
	
	WebElement btnclick = driver.findElement(By.xpath("//input[@value='Login']"));
	btnclick.click();

	
	WebElement txtsearch = driver.findElement(By.id("typeahead-basic"));
	txtsearch.sendKeys("apple iphone 12 pro max");

	
	
	WebElement btnclick2 = driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary']"));
	btnclick2.click();
	
	
	WebElement btnclick3 = driver.findElement(By.xpath("//img[@class='card-img-top']"));
	btnclick3.click();
	
	
	WebElement btnbuynow = driver.findElement(By.xpath("//button[text()='Buy Now']"));
	btnbuynow.click();
	
	
	WebElement btnadd = driver.findElement(By.xpath("//button[text()='ADD GIFT CODE']"));
	btnadd.click();
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	WebElement btngrn = driver.findElement(By.xpath("//span[text()='GRN10']"));
	Actions action = new Actions(driver);
	action.doubleClick(btngrn).perform();
	
	
	WebElement btnconclick = driver.findElement(By.xpath("//span[@class='px-1 close']"));
	action.contextClick(btnconclick).perform();
	
	
	WebElement btnremove = driver.findElement(By.xpath("//div[text()='Remove Promo Code ']"));
	btnremove.click();

	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	System.out.println(screenshotAs);
	
}
}
 