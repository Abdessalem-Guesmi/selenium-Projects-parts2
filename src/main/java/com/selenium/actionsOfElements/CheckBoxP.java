package com.selenium.actionsOfElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxP {

	/*
	 * i want to check to elements:
	 * 
	 * smartPhone and iPhone
	 * 
	 */

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mytek.tn/124-smartphone-mobile-tunisie");
		WebElement smartPhone = driver.findElement(By.id("layered_category_142"));
		WebElement iPhone = driver.findElement(By.id("layered_category_362"));
		WebElement phone = driver.findElement(By.id("layered_category_141"));
		smartPhone.click();
		iPhone.click();
		System.out.println(smartPhone.isSelected()); // true
		System.out.println(iPhone.isSelected()); // true
		System.out.println(phone.isSelected()); // false

	}
}
