package com.screenscroll;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.javascr.JavaScript;

import graphql.language.Argument;

public class ScrollDownUp {
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Public\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
		WebDriver driver= new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		
		WebElement down = driver.findElement(By.xpath("//h2[text()='Top rated, premium quality | Amazon Brands & more']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollby", down);
		

}
}
