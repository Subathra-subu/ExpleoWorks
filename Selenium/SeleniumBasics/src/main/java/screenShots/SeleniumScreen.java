package screenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScreen {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		
		File Source = screen.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(Source,new File("./SeleniumScreenshots/Screen.png"));
		
		System.out.println("Screenshot is Captured");
		
		driver.quit();

	}

}
