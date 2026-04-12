package javaScriptUsages;

//URL - toString()

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HYRtutorialsAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("document.getElementsByTagName('input')[0].value='Charu'");
		
		js.executeScript("document.getElementsByTagName('input')[1].value='mathi'");
		
		js.executeScript("document.getElementsByTagName('input')[2].value='charu@gmail.com'");
		
		js.executeScript("document.getElementsByTagName('input')[3].value='1234'");
		
		js.executeScript("document.getElementsByTagName('input')[4].value='1234'");
		
		js.executeScript("document.getElementsByClassName('btn')[0].click()");
		
		String url = js.executeScript("return document.URL").toString();
		
		if(url.equals("https://www.hyrtutorials.com/p/add-padding-to-containers.html?name=Charu&name=mathi")) {
			System.out.println("Registered");
		}
		
		js.executeScript("window.scrollBy(0,2000)");
		
		System.out.println("Domain: "+js.executeScript("return document.domain").toString());
		
		System.out.println("Title: "+js.executeScript("return document.title").toString());
		
		
		
		driver.close();

	}

}
