package com.selenium.basicsmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MonitorWindowSize {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		// when you will the unique handel code:
		String unique_id = driver.getWindowHandle();
		System.out.println(unique_id);

		/*
		 * when you will the full screen of current Page, can you use this instruction:
		 * driver.manage().window().fullscreen();
		 */

	}
}
