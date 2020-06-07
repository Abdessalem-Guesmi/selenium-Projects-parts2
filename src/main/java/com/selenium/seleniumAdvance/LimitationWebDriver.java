package com.selenium.seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LimitationWebDriver {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://french.alibaba.com/");
		WebElement footer = driver.findElement(By.xpath("//footer[@id='ui-footer']"));
		// I want to know the number of links in the footer
		System.out.println(driver.findElements(By.tagName("a")).size());
		// the result is 153

	}
}
