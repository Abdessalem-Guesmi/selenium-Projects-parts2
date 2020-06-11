package com.selenium.seleniumAdvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcceptSSIOnchrome {
	/*
	 * 
	 * how to resolve problem of secure with certificate with selenium
	 */
	public static void main(String[] args) {
		// using class ChromeOptions from selenium
		ChromeOptions chromeOptions = new ChromeOptions();
		// when you find a web site with certificate please accept
		chromeOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		// when you find a web site with insecure certificate please accept
		chromeOptions.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		// i will the chrome Browser with incognito open!
		chromeOptions.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		// apply on all elements
		driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);
		// apply on load a page
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
	}

}
