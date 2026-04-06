package demo;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;


public class FluentWait_Practice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropDown = driver.findElement(By.cssSelector("button.dropbtn"));
		
		dropDown.click();
		
		
		Wait<WebDriver> wait = new FluentWait<>(driver)
		            .withTimeout(Duration.ofSeconds(5))
		            .pollingEvery(Duration.ofMillis(300))
		            .ignoring(ElementNotInteractableException.class);

		WebElement faceBookOption = wait.until(new Function<WebDriver,WebElement>(){
		        public WebElement apply(WebDriver driver){
		          return driver.findElement(By.cssSelector("a[href='http://facebook.com']"));
		}
		});
		faceBookOption.click();
		
		driver.close();

	}

}
