package com.location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IcicibankTask {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
			
		driver.manage().window().maximize();
		
		WebElement txtuser= driver.findElement(By.xpath("//input[@class='login-input mode-select-userid']"));
		txtuser.sendKeys("naren7921");
		Thread.sleep(3000);
		WebElement txtpass= driver.findElement(By.xpath("//input[@class='mode-select-mobile']"));
		txtpass.sendKeys("9500880115");
	
	
	}
}
