package com.testCase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pages.ExcelRead;
import com.pages.ExcelWriteData;
import com.pages.TestPage;

public class PedigreeTest {

	WebDriver driver;

	@Test
	public void f() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.pedigree.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		TestPage tp = new TestPage(driver);
		tp.searchDog();
		tp.articles();
		tp.secondLink();
		tp.logo();
		tp.screenshot();
		driver.close();

	}
}
