package demoqa;


import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class Window_Example {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/");
		
		String parentHandler = driver.getWindowHandle();
		System.out.println(parentHandler);
		
		Set<String> allwindowHandles = driver.getWindowHandles();
		System.out.println("Count of Windows:"+allwindowHandles.size());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://demoqa.com/alertsWindows");
		
		Set<String> allnewwindowHandles = driver.getWindowHandles();
		System.out.println("Count of Windows:"+allnewwindowHandles.size());
		
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		
		driver.quit();
	}

}
