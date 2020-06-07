package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByCSSSelectorLocatorII {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		/*
		 * 
		 * in this example we using className tag with syntax tagName.(value
		 * of)className or .(value of)className
		 * 
		 */
		driver.findElement(By.cssSelector(".inputtext")).sendKeys("selenium@training.com");

	}

}
