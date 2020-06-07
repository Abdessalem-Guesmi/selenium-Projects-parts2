package com.selenium.basicsmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseAndQuitWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.close();

		/*
		 * warning
		 * 
		 * the difference between driver.close() and driver.quit ()
		 * 
		 * driver.close() -->it will close the current page that you opened by selenium
		 * 
		 * 
		 *
		 * driver.quit() --> it will close all pages that was opened by selenium
		 */

	}
}
