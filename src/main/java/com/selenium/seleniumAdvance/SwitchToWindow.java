package com.selenium.seleniumAdvance;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://french.alibaba.com/");
		driver.manage().window().maximize();
		WebElement gotoPage = driver.findElement(By.xpath("//a[@title='Messages']"));
		gotoPage.click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> iterator = ids.iterator();
		String parentID = iterator.next();
		String childID = iterator.next();
		driver.switchTo().window(childID);
		WebElement login = driver.findElement(By.id("fm-login-id"));
		login.sendKeys("guesmiabdessalem@yahoo.fr");

	}
}
