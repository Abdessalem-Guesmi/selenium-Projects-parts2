package com.selenium.seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWait {

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
		 * in this class i have explicitly wait using!
		 */

		driver.get("https://french.alibaba.com/");
		driver.findElement(By.linkText("Libraries")).click();
		WebDriverWait driverWait = new WebDriverWait(driver, 30);

		driverWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Abc"))));

	}
}
