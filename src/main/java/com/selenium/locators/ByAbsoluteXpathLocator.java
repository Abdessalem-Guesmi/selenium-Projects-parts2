package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByAbsoluteXpathLocator {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com/");
		driver.manage().window().maximize();
		/*
		 * absolute xpath is the xpath that we customize using the attributes
		 * 
		 * of the parent of the element and we travel down using tag name
		 * 
		 * to targeted element
		 * 
		 * 
		 */
		driver.findElement(By.xpath("//body/div[1]/div/div/ul/li[4]/a")).sendKeys("Berlin");

	}
	/*
	 * if you want to travel from child to parent we use :
	 * 
	 * //childxpath/parent::tagName for parent
	 */

}
