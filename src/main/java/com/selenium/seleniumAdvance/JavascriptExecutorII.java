package com.selenium.seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorII {

	/*
	 * how to use javaScript into selenium
	 * 
	 * in this example i will change the background-color of google to green then
	 * refresh page to zero
	 */
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement submit = driver.findElement(By.xpath("//div[@id='lga']"));
		JavascriptExecutor executor = ((JavascriptExecutor) driver);
		// background to green
		String color = "green";
		executor.executeScript("arguments[0].style.backgroundColor = '" + color + "'", submit);
		// refresh page
		refreshBrowserByJS(driver);
	}

	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor executor = ((JavascriptExecutor) driver);
		executor.executeScript("history.go(0)");
	}

}
