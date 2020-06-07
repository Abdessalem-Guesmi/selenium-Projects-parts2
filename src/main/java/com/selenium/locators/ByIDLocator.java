package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByIDLocator {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		/*
		 * i will write hello@selenium.org into elements have id= email and id=pass
		 */
		driver.findElement(By.id("email")).sendKeys("hello@selenium.org");
		driver.findElement(By.id("pass")).sendKeys("hello@selenium.org");

	}

}
