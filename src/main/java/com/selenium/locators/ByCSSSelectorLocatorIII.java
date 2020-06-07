package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByCSSSelectorLocatorIII {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		/*
		 * in this example we using ID tag syntax tagName#(value of)ID
		 */
		driver.findElement(By.cssSelector("input#email")).sendKeys("abdou.ge@live.fr");

	}

}
