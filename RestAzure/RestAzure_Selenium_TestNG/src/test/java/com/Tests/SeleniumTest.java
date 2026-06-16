package com.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SeleniumTest {
	
	@Test
	public void demo() {
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://jsonplaceholder.typicode.com/");
			String exp = driver.getCurrentUrl();
			
			Assert.assertTrue(exp.contains("jsonplaceholder"));
			System.out.println("Done");
		}
		finally {
			driver.quit();
		}
		
	}
}
