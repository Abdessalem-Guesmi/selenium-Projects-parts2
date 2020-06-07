package com.selenium.basicsmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateMethod {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*
		 * in this example, i will navigate into a pages i have 3 methods into navigate
		 * using to + back + refresh + forward step 1: open google step 2: go to
		 * facebook step 3: back to google step 4: refresh google page step 5: go to
		 * facebook
		 */
		driver.get("http://www.google.com");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();

	}

}
