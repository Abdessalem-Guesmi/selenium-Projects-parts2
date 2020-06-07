package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByCSSSelectorLocatorI {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		/*
		 * syntax tagName[Attribute='value']
		 */
		driver.findElement(By.cssSelector("input[name='email'")).sendKeys("abdou.ge@live.fr");

	}

}
