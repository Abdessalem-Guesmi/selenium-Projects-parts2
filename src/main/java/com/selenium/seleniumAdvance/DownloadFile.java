package com.selenium.seleniumAdvance;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.pexels.com/photo/scenic-view-of-mountains-during-dawn-1266810/");

		// We find the download links
		WebElement image = driver.findElement(By.partialLinkText("Free"));

		// Click to downaload image
		// WebElement el = list.get(list.size() - 1);
		image.click();

		File folder = new File(System.getProperty("user.dir"));

	}

}
