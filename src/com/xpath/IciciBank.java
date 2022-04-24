package com.xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {	
public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/AuthenticationController?"
			+ "FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_personalb_personal_login_btn&_gl=1*1mku6y1*_ga*MTQzMTIzMDI3OS4xNjQ4MDE4NTE2*_ga_SKB78GHTFV*MTY0OTAwMDUxNy4xLjAuMTY0OTAwMDUxNy42MA..");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	
	WebElement textid = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
	textid.sendKeys("Naren");
	
	WebElement txtphone = driver.findElement(By.name("AuthenticationFG.ACCESS_CODE"));
	txtphone.sendKeys("9500880115");

}
}