package com.selenium.seleniumAdvance;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorIII2 {

	/*
	 * how to use javaScript into selenium
	 */
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kooora.com/");
		scrollPageDown(driver);
	}

// go to down of page
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor executor = ((JavascriptExecutor) driver);
		executor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
}
