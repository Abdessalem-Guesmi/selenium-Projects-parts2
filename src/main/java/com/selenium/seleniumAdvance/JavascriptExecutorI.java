package com.selenium.seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorI {

	/*
	 * how to use javaScript into selenium
	 * 
	 * in this example i will change the background-color of google to green
	 */
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement submit = driver.findElement(By.xpath("//div[@id='lga']"));
		JavascriptExecutor executor = ((JavascriptExecutor) driver);
		String color = "green";
		executor.executeScript("arguments[0].style.backgroundColor = '" + color + "'", submit);

	}

}
