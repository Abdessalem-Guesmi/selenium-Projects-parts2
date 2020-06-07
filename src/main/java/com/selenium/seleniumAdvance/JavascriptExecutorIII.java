package com.selenium.seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorIII {

	/*
	 * how to use javaScript into selenium
	 */
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://angular.io/");
		WebElement element = driver.findElement(By.xpath("//div[@class='text-headline']"));
		scrollIntoView(element, driver);
	}

// go to specific element of page
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor executor = ((JavascriptExecutor) driver);
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}
