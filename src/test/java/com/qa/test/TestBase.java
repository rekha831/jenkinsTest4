package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBase {
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
	}
	
	@Test
	public void Test1() {
		System.out.println("test1");
	}
	
	@AfterMethod
	public void tearDowb() {
		
	}

	
}
