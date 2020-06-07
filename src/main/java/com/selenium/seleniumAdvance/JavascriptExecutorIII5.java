package com.selenium.seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorIII5 {

	/*
	 * how to use javaScript into selenium
	 */
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://angular.io/");
		driver.manage().window().maximize();
		WebElement element = driver
				.findElement(By.xpath("//img[@src='generated/images/marketing/home/speed-performance.svg']"));
		scrollIntoView(element, driver);
		drawBorder(driver, element);
	}

// generate drawBorder into specific element
	public static void drawBorder(WebDriver driver, WebElement element) {
		JavascriptExecutor executor = ((JavascriptExecutor) driver);
		executor.executeScript("arguments[0].style.border='10px solid red'", element);
	}

	// go to specific element of page
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor executor = ((JavascriptExecutor) driver);
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}
