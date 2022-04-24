package org.mouse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextclick {
public static void main(String[] args) throws AWTException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
driver.get("https://www.google.co.in/");	
driver.manage().window().maximize();

WebElement lnkgmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
Actions action = new Actions(driver);

action.contextClick(lnkgmail).perform();


Robot robot = new Robot();

robot.keyPress(KeyEvent.VK_DOWN);
robot.keyRelease(KeyEvent.VK_DOWN);

robot.keyPress(KeyEvent.VK_ENTER);


}
}
