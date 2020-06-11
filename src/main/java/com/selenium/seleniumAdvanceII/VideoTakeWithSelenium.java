package com.selenium.seleniumAdvanceII;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VideoTakeWithSelenium {
	public static WebDriver driver;
	public static Properties properties;
	public static ATUTestRecorder recorder;

	public static void main(String[] args) throws IOException, ATUTestRecorderException {
		login();
	}

	public static void login() throws IOException, ATUTestRecorderException {
		loadFile();
		System.out.println(properties.getProperty("url"));
		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("password"));
		initilzation(properties.getProperty("url"));
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		username.sendKeys(properties.getProperty("username"));
		password.sendKeys(properties.getProperty("password"));

		recorder.stop();

	}

	public static void loadFile() throws IOException {
		properties = new Properties();
		// don't forget to change the path of the file according to the location on your
		// computer
		FileInputStream inputStream = new FileInputStream(
				"D:\\Training-WS\\selenium-partII\\src\\main\\java\\com\\application\\configuration\\config.properties");
		properties.load(inputStream);
	}

	public static void initilzation(String URL) throws ATUTestRecorderException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		takeVideo();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	public static void takeVideo() throws ATUTestRecorderException {
		DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		// Created object of ATUTestRecorder
		// Provide path to store videos and file name format.
		recorder = new ATUTestRecorder("D:\\Training-WS\\selenium-partII\\records\\",
				"TestVideo-" + dateFormat.format(date), false);
		// To start video recording.
		recorder.start();

	}
}
