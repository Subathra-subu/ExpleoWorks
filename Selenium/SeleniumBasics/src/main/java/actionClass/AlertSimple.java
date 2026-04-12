package actionClass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertSimple {

	public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://omayo.blogspot.com/#");
	        
	        driver.findElement(By.id("alert1")).click();
	        Alert alert=driver.switchTo().alert();
	        alert.accept();
		}
}
