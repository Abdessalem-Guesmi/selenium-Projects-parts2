package com.selenium.seleniumAdvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteCookies {
	/*
	 * 
	 * how to delete al cookies with selenium
	 */
	public static void main(String[] args) {
		// using class ChromeOptions from selenium
		ChromeOptions chromeOptions = new ChromeOptions();

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.kooora.com/");
		driver.manage().window().maximize();
		// apply on all elements
		driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);
		// apply on load a page
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		// i will to delete all cookies
		driver.manage().deleteAllCookies();
		// you can test this function, if you specify delete a cookie name
		driver.manage().deleteCookieNamed("login");
		// you can test this function, if you specify add a cookie name
		Cookie cookie = new Cookie("user", "user");
		driver.manage().addCookie(cookie);
	}

}
