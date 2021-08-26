package com.qa.test;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBase {
	
	public static WebDriver driver;
	
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://book.spicejet.com/Login.aspx");
		
		driver.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_TextBoxUserID")).sendKeys("rekhakathayat94@gmail.com");
		driver.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_PasswordFieldPassword")).sendKeys("Rekha@2407");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(4000);
		
	}
	
	@Test
	public void Test1() {
		System.out.println("test1");
	}
	

	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
		
	}

	
}
