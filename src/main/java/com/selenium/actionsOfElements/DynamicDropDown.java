package com.selenium.actionsOfElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropDown {

	/*
	 * 
	 * 
	 */

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spiciejet.com/");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		/*
		 * 
		 * i want to send a value: 05 into day
		 * 
		 * August into month
		 * 
		 * 1983 into year
		 * 
		 * to using the Select from Selenium, method selectByIndex(index)
		 * 
		 */
		Select dayValue = new Select(day);
		Select monthValue = new Select(month);
		Select yearValue = new Select(year);
		dayValue.selectByIndex(5);
		monthValue.selectByIndex(8);
		yearValue.selectByIndex(38);

	}
}
