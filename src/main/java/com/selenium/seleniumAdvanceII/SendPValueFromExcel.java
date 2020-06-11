package com.selenium.seleniumAdvanceII;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendPValueFromExcel {

	public static void main(String[] args) throws IOException, InvalidFormatException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Object data[][] = getDataFromExcelSheet("data");
		// i will display the value of cell
		System.out.println(data[0][0]);
		System.out.println(data[0][1]);
		System.out.println(data[1][0]);
		System.out.println(data[1][1]);
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		String email = (String) data[0][0];
		String pass = (String) data[0][1];
		username.sendKeys(email);
		password.sendKeys(pass);
	}

	public static Object[][] getDataFromExcelSheet(String sheetName) throws InvalidFormatException, IOException {

		// don't forget to change the path of the file according to the location on your
		// computer
		FileInputStream fileInputStream = new FileInputStream(
				new File("D:\\Training-WS\\selenium-partII\\data\\Data.xlsx"));
		// don't forget to add the jar files: POI apache and xlsx
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
		// to get the name of the file window we use:
		Sheet sheet = workbook.getSheet(sheetName);
		// calcul the number of get size of
		int rows = sheet.getLastRowNum();
		// get size of Cell
		int columns = sheet.getRow(0).getLastCellNum();

		Object data[][] = new Object[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < columns; k++) {

				// if you use a numbers
				if (sheet.getRow(i).getCell(k).getCellTypeEnum() == CellType.NUMERIC) {
					data[i][k] = String.valueOf(sheet.getRow(i).getCell(k).getNumericCellValue()).trim();

				}

				else {

					data[i][k] = sheet.getRow(i).getCell(k).getStringCellValue();
				}
			}
		}

		return data;
	}
}