package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Practice_Visibility {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/waits.xhtml;jsessionid=node0aqzrueu96hjb1sge7xxya7qw914507640.node0");
		
		WebElement button = driver.findElement(By.xpath("//button[@id = 'j_idt87:j_idt89']/child::span"));
		
		button.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement box = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id = 'j_idt87:j_idt90']/child::span")));
		
		System.out.print("Present"); // if(box.isDisplayed) System.out.print("Present")
		
		driver.close();
		
		
	}

}
