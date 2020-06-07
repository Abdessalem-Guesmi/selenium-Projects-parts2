package com.selenium.browsers;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunSeleniumOnChrome {
	public static WebDriver driver;
	public static Properties properties;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://Down//chromedriver_win32 (6)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com/");
//		String url = driver.getCurrentUrl();
//		System.out.println(url);

	}

}
