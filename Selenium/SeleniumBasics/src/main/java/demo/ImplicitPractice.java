package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitPractice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement add = driver.findElement(By.cssSelector("input#adder"));
		
		add.click();
		
		WebElement box = driver.findElement(By.cssSelector("div.redbox"));
		
		System.out.println(box.getCssValue("background-color"));
		
		
		
		driver.close();

	}

}
