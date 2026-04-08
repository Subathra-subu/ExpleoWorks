package wait_Problems;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Practice3 {
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://configureselenium.blogspot.com/");
		
		WebElement selenium = driver.findElement(By.xpath("//div[@class='widget PageList']/descendant::a[1]"));
		
		
		
		driver.close();
	
	}
		

}
