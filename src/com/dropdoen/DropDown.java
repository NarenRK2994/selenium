package com.dropdoen;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws AWTException {
		
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement btnreg = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	btnreg.click();
	
	
	WebElement txtfir = driver.findElement(By.name("firstname"));
	txtfir.sendKeys("Naren");

	WebElement txtlas = driver.findElement(By.name("lastname"));
	txtlas.sendKeys("RK");
	
	WebElement txtemail = driver.findElement(By.name("reg_email__"));
	txtemail.sendKeys("naren7921an@gmail.com");
		
	WebElement txtpass = driver.findElement(By.name("reg_passwd__"));
	txtpass.sendKeys("9500880115");
	
	WebElement dropday = driver.findElement(By.id("day"));
	Select s = new Select(dropday);
	s.selectByValue("2");
	
	WebElement dropmon = driver.findElement(By.id("month"));
	Select s1 = new Select(dropmon);
	s1.selectByIndex(9);
	
	WebElement dropyear = driver.findElement(By.id("year"));
	Select s2 = new Select(dropyear);
	s2.selectByVisibleText("1994");
	
	WebElement click = driver.findElement(By.xpath("//input[@value='2']"));	
	click.click();		
	
	WebElement gettxt = driver.findElement(By.xpath("//p[@class='_58mv']"));
	String text = gettxt.getText();
	System.out.println(text);
	}
}