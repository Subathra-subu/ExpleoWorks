package screenShots;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementScreenShot {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.demoblaze.com/index.html");
		
		
		try {
			WebElement login = driver.findElement(By.xpath("//a[@id='login2']"));
			
			File source = ((TakesScreenshot)login).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source,new File("./SeleniumScreenshots/Element.png"));
		
		}
		
		catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println("Screenshot is Captured");
		
		driver.quit();
		
	}

}
