package com.contains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
		
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458755421&hvpos=&hvnetw=g&hvrand=9306226044642204535&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061891&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQjw0PWRBhDKARIsAPKHFGi2o2xN6IHyPb0vQaYj2l9QmwjMxWnuxQhWuUh68o1g-LadjGmey10aAtwrEALw_wcB");
	
	driver.manage().window().maximize();
	
	WebElement txtlogin = driver.findElement(By.xpath("//a[contains(text(),'Con')]"));
	String text = txtlogin.getText();
	System.out.println(text);
	Thread.sleep(2000);
	
	driver.quit();
	
}
}




