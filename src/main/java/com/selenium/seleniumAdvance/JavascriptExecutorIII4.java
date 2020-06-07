package com.selenium.seleniumAdvance;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorIII4 {

	/*
	 * how to use javaScript into selenium
	 */
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://angular.io/");
		generateAlert(driver, "welcome selenium into Angular!!!");
	}

// how to generate Alert into any web page
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor executor = ((JavascriptExecutor) driver);
		executor.executeScript("alert('" + message + "')");

	}
}
