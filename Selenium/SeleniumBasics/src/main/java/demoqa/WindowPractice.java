package demoqa;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPractice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/window.xhtml");
		
		String parent = driver.getWindowHandle();
		
		WebElement window = driver.findElement(By.xpath("//span[text()='Close Windows']"));
		
		window.click();
		
		WebElement Childwindow = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']"));
		
		Childwindow.click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		 for (String w : allWindows) {
	            if (!w.equals(parent)) {
	                driver.switchTo().window(w);
	                driver.close();
	            }
	        }
		
		 driver.switchTo().window(parent);

	        System.out.println("Back to Parent Window");

	        driver.quit();

	}

}
