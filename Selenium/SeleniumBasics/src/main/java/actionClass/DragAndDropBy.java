package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDropBy {

	public static void main(String[] args){
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node0w5qyvhhw06v61jozu0a9ymahi14562129.node0");
		
		WebElement box = driver.findElement(By.xpath("//div[@id='form:conpnl_header']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(box,500,0).perform();
		
		driver.close();
		
		

	}

}
