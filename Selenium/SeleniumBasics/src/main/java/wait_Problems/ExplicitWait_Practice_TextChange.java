package wait_Problems;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Practice_TextChange {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/waits.xhtml;jsessionid=node0aqzrueu96hjb1sge7xxya7qw914507640.node0");
		
		WebElement button = driver.findElement(By.xpath("//button[@id = 'j_idt87:j_idt98']/child::span"));
		
		button.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		boolean status = wait.until(ExpectedConditions.textToBe(By.xpath("//button[@id = 'j_idt87:j_idt99']/child::span"),"Did you notice?"));
		
		System.out.print(status?"Text changed":"Text not changed");
		
		driver.close();

	}

}
