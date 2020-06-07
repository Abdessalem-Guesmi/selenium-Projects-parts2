package com.selenium.mouseKeyboardActions;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static WebDriver driver;
	public static Properties properties;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://Down//chromedriver_win32 (6)/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		Actions actions = new Actions(driver);
		WebElement input = driver.findElement(By.xpath("//input[@name='q']"));
		actions.moveToElement(input).click().sendKeys("selenium").doubleClick().build().perform();
		System.out.println("end action");
	}
}
