package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement button = driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(button);
		
		driver.close();
		
	}

}
