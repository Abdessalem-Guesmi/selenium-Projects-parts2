package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByXpathLocatorI {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		/*
		 * syntax xpath partI: //tagName[@Attribute=value]
		 */
		driver.findElement(By.xpath("//a[@class='nav__button-secondary']")).click();

	}

}
