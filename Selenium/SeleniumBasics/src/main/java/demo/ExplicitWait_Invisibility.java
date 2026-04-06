package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Invisibility {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/waits.xhtml;jsessionid=node0aqzrueu96hjb1sge7xxya7qw914507640.node0");
		
		WebElement button = driver.findElement(By.xpath("//button[@id = 'j_idt87:j_idt92']/child::span"));
		
		button.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		boolean isBoxDisappear = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[@id = 'j_idt87:j_idt93']/child::span")));
		
		if(isBoxDisappear) System.out.println("Disappeared!!");
		
		driver.close();
	}

}
