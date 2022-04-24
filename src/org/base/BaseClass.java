package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	WebDriver driver;
	TakesScreenshot ts;
	// get driver
	public void getDriver() {
		System.setProperty("String", "Loaction");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	// launch URL
	public void launchURL(String url) {
		driver.get("URL");
	}

	// send keys
	public void sendkey(WebElement ref, String data) {
		ref.sendKeys(data);
	}

	// Click
	public void Click(WebElement ref) {
		ref.click();
	}

	// close
	public void Close(WebDriver ref) {
		driver.quit();
	}

	// findElement
	public void find(WebDriver ref) {
		ref.findElement(By.id(""));
	}

	public void find1(WebDriver ref) {
		ref.findElement(By.className(""));
	}

	public void find2(WebDriver ref) {
		ref.findElement(By.name(""));
	}

	public void find3(WebDriver ref) {
		ref.findElement(By.tagName(""));
	}
	public void find4(WebDriver ref) {
		ref.findElement(By.xpath(""));
	}
	public void action(Actions re) {
		Actions action = new Actions(driver);
		re.contextClick();
		re.contextClick();
		re.doubleClick();
	}

	public void robot(Robot ro) throws AWTException {
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_SHIFT);
		rob.keyRelease(KeyEvent.VK_SHIFT);
	}
	public void screenshot (TakesScreenshot ts) {
		TakesScreenshot reff = (TakesScreenshot)driver;
		ts.getScreenshotAs(OutputType.FILE);
	}



}



