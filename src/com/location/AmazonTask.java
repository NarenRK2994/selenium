package com.location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486462454211&hvpos=&hvnetw=g&hvrand=13275476583155720698&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061891&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=CjwKCAjwiuuRBhBvEiwAFXKaNNrzXLTPcEV46FCEE3aOulXJy3RbuQ5lCI2kFf8XXD9j0DqG13_nmRoCLXMQAvD_BwE");
		
	driver.manage().window().maximize();
	
	WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
	txtsearch.sendKeys("i phone");
	
	WebElement button = driver.findElement(By.id("nav-search-submit-button"));
	button.click();

	//driver.quit();
	
}
}
