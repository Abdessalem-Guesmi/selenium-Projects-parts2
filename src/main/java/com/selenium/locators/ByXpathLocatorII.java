package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByXpathLocatorII {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		/*
		 * syntax xpath part II: //*[@Attribute=value]
		 */
		driver.findElement(By.xpath("//*[@class='inputtext login_form_input_box']")).sendKeys("selenium@training.com");

	}

}
