package com.selenium.seleniumAdvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		/*
		 * we have 3 wait
		 * 
		 * 1- sleep : from java --------------------------->static wait
		 * 
		 * 2- implicit wait: from selenium -------->dynamic wait and is globally
		 * 
		 * 3- explicit wait: from selenium -------->dynamic wait and is private or
		 * locally
		 * 
		 * in this class i have implicitly wait using!
		 */

		driver.get("https://library-app.firebaseapp.com/");
		driver.findElement(By.linkText("Libraries")).click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Abc")).click();

	}
}
