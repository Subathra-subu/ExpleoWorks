package demoBlaze;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.demoblaze.com/index.html");
		
		WebElement login = driver.findElement(By.xpath("//a[@id='login2']"));
		
		login.click();
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='loginusername']"));
		
		userName.sendKeys("admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='loginpassword']"));
		
		password.sendKeys("admin");
		
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@onclick='logIn()']"));
		
		loginButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement logoutButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#logout2")));
		
		if(logoutButton.getText().equals("Log out")) {
			System.out.print("Login Sucessfull!");
		}
		
		driver.close();
	}

}
