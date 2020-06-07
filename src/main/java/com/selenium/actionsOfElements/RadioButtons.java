package com.selenium.actionsOfElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	/*
	 * i want to select the Male gender as a radio button!!
	 * 
	 */

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement genderMale = driver.findElement(By.xpath("//input[@value='2']"));
		genderMale.click();
		System.out.println(genderMale.isSelected());

	}
}
