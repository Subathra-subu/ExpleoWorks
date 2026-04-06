package wait_Problems;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Practice_Clickability {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/waits.xhtml;jsessionid=node0aqzrueu96hjb1sge7xxya7qw914507640.node0");
		
		WebElement Button = driver.findElement(By.xpath("//button[@id = 'j_idt87:j_idt95']/child::span"));
		
		Button.click();
	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("j_idt87:growl_container")));
		
		WebElement SecondButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id = 'j_idt87:j_idt96']/child::span")));
		
		SecondButton.click();
		
		driver.close();
	
	
	}

}
