package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node0w5qyvhhw06v61jozu0a9ymahi14562129.node0");
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='form:drag_content']"));
		
		WebElement target = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag, target).perform();
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
