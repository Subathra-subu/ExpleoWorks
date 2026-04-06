package wait_Problems;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		WebElement new_input = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#reveal")));
		
		new_input.click();
		
		WebElement new_textBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#revealed")));
		
		new_textBox.sendKeys("Subathra");
		
		System.out.println(new_textBox.getAttribute("value"));
		
		driver.close();
		

	}

}
