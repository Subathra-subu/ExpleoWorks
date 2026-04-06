package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omayo_Website {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropDown = driver.findElement(By.cssSelector("button.dropbtn"));
		
		dropDown.click();
		
		WebElement facebook = driver.findElement(By.cssSelector("a[href='http://facebook.com']"));
		
		Thread.sleep(5000);
		
		facebook.click();
		
		driver.close();
		

	}

}
