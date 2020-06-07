package com.selenium.actionsOfElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaScriptAlerts {

	/*
	 * i want to accept alert:
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		WebElement alertButton = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button"));
		WebElement confirmbutton = driver
				.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button"));
		WebElement promptbutton = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button"));

		alertButton.click();
		// Store the alert text in a variable

		String textAlert = driver.switchTo().alert().getText();
		System.out.println(textAlert);
		// Press the OK button

		driver.switchTo().alert().accept();
		/*
		 * i want to use trigger to can you show the second example!!
		 */
		Thread.sleep(3000);
		confirmbutton.click();
		// Press the Cancel button
		driver.switchTo().alert().dismiss();

	}
}
