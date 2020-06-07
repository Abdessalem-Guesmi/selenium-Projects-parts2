package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByClassNameLocator {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.linkedin.com/");
		/*
		 * i want click of element have className= nav__button-secondary
		 * 
		 * 
		 */
		driver.findElement(By.className("nav__button-secondary")).click();

	}

}
