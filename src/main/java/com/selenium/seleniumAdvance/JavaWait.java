package com.selenium.seleniumAdvance;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaWait {
	public static WebDriver driver;
	public static Properties properties;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://Down//chromedriver_win32 (6)/chromedriver.exe");
		driver = new ChromeDriver();

		/*
		 * we have 3 wait
		 * 
		 * 1- sleep : from java --------------------------->static wait
		 * 
		 * 2- implicitly wait: from selenium -------->dynamic wait and is globally
		 * 
		 * 3- explicitly wait: from selenium -------->dynamic wait and is private or
		 * locally
		 * 
		 * in this class i have java wait using!
		 */

		driver.get("https://library-app.firebaseapp.com/");
		driver.findElement(By.linkText("Libraries")).click();
		;
		// I want to wait around 3 seconds to click into Abc element
		Thread.sleep(3000);
		driver.findElement(By.linkText("Abc")).click();
		;

	}
}
