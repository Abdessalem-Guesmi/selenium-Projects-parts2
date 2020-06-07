package com.selenium.browsers;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class RunSeleniumOnFirefox {
	public static WebDriver driver;
	public static Properties properties;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E://Down//geckodriver.exe");
		// driver = new FirefoxDriver();
	}

}
