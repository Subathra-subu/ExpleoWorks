package demoqa;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		WebElement window = driver.findElement(By.xpath("//a[@href='/alertsWindows']/descendant::h5"));
		
		window.click();
		
		Set<String> allnewwindowHandles = driver.getWindowHandles();
		System.out.println("Count of Windows:"+allnewwindowHandles);
		
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		
		Iterator<String> itr = allnewwindowHandles.iterator();
		
		String mainWindow = itr.next();
		String childWindow = itr.next();
		System.out.println(mainWindow);
		System.out.println(childWindow);
		
		driver.switchTo().window(mainWindow);
		
		
		driver.quit();
	}

}
