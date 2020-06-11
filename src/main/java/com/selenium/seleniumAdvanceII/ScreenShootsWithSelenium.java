package com.selenium.seleniumAdvanceII;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShootsWithSelenium {
	public static WebDriver driver;
	public static Properties properties;

	public static void main(String[] args) throws IOException {
		login();
	}

	public static void login() throws IOException {
		loadFile();
		System.out.println(properties.getProperty("url"));
		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("password"));
		initilzation(properties.getProperty("url"));
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		username.sendKeys(properties.getProperty("username"));
		password.sendKeys(properties.getProperty("password"));
		takePicture();
	}

	public static void loadFile() throws IOException {
		properties = new Properties();
		// don't forget to change the path of the file according to the location on your
		// computer
		FileInputStream inputStream = new FileInputStream(
				"D:\\Training-WS\\selenium-partII\\src\\main\\java\\com\\application\\configuration\\config.properties");
		properties.load(inputStream);
	}

	public static void initilzation(String URL) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	public static void takePicture() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH");
		Date date = new Date();
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// don't forget to change the path of the file according to the location on your
		// computer

		FileUtils.copyFile(srcFile,
				new File("D:\\Training-WS\\selenium-partII\\screenShots\\login" + dateFormat.format(date) + ".png"));
	}
}
