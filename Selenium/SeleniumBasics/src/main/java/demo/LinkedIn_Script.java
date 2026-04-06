package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedIn_Script {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.linkedin.com/home");
		
		WebElement Signin_element = driver.findElement(By.cssSelector("a[data-tracking-control-name='guest_homepage-basic_nav-header-signin']"));
		
		Signin_element.click();
		
		WebElement email = driver.findElement(By.cssSelector("input[name='session_key']"));
		
		email.sendKeys("2k22cse147@kiot.ac.in");
		
		WebElement password = driver.findElement(By.cssSelector("input#password"));
		
		password.sendKeys("Subu@2004");
		
		WebElement submit = driver.findElement(By.cssSelector("button[data-litms-control-urn=\"login-submit\"]"));
		
		submit.click();
		
		WebElement profile = driver.findElement(By.cssSelector(""));
		
		
		
		driver.close();
	}

}
