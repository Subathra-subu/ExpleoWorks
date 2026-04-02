package demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Example {

	public static void main(String[] args) {
		
		
		WebDriver driver = new EdgeDriver();
		
		String expected_url = "https://www.flipkart.com/";
		
		
		driver.get(expected_url);
		
		String  title = driver.getTitle();
		
		System.out.println("Title: "+title);
		
		System.out.println("Title length: "+title.length());
		
		String url = driver.getCurrentUrl();
		
		if(expected_url.equals(url))
			System.out.print("Equal");
		
		else System.out.print("Not_Equal");
		
		String Page_Source = driver.getPageSource();
		
		System.out.println("Page source: "+Page_Source);
		
		System.out.println("Page source length: "+Page_Source.length());
		
		driver.close();
		
		

	}

}
