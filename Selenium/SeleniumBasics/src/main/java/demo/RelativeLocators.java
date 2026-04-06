package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		WebElement p_element = driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]"));
		
		p_element.sendKeys("abc@gmail.com");
		
		WebElement A_element = driver.findElement(with(By.tagName("input")).above(p_element));
		
		A_element.sendKeys("Suba");
		
		WebElement B_element = driver.findElement(with(By.tagName("input")).below(p_element));
		
		B_element.sendKeys("Subu@2004");
		
		WebElement reg_button = driver.findElement(By.xpath("//div[@class='buttons']/child::button[@type='submit']"));
		
		WebElement r_button = driver.findElement(with(By.tagName("button")).toRightOf(reg_button));
		
		WebElement ref_button = driver.findElement(By.xpath("//div[@class='buttons']/child::input"));
		
		r_button.click();
		
		WebElement l_button = driver.findElement(with(By.tagName("button")).toLeftOf(ref_button));
		
		l_button.click();
		
		WebElement n_button = driver.findElement(with(By.tagName("button")).near(ref_button));
		
		n_button.click();
		

	}

}
