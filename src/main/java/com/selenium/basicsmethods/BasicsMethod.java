package com.selenium.basicsmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicsMethod {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// i will facebook page with chrome open:
		driver.get("https://www.facebook.com/");
		String url = driver.getCurrentUrl();
		/*
		 * i will test the actual url some with url Expected or no if yes: print pass!!
		 * if not: print fail!!
		 */
		if (url.contentEquals("https://www.facebook.com/"))
			System.out.println("pass!!");
		else {
			System.out.println("fail!!");
		}
		// i will print the title of current page:
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		// i will print the code source the current page, i can using:
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);

	}

}
