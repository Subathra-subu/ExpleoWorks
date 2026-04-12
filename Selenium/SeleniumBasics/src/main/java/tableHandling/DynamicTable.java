package tableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicTable {

	public static void main(String[] args) {
		
		   WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://thinking-tester-contact-list.herokuapp.com/");

	        driver.findElement(By.id("email")).sendKeys("ram@yahoo.com");
	        driver.findElement(By.id("password")).sendKeys("1234567");
	        driver.findElement(By.id("submit")).click();

	        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='myTable']//tr"));
	        int rowsCount = rows.size();
	        System.out.println("Rows: " + rowsCount);

	        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='myTable']//tr[1]//th"));
	        int colCount = cols.size();
	        System.out.println("Columns: " + colCount);

	        List<WebElement> contactNames = driver.findElements(By.xpath("//table[@id='myTable']//tr[1]//th"));
	        
	        int i=1;
	        
	        for(WebElement element : contactNames) {
	        		if(element.getText().equals("Charu mathi")) {
	        			List<WebElement> actualRow = driver.findElements(By.xpath("//table[@id='myTable'/tr["+i+"]"));
	        			for(WebElement row: actualRow) {
	        				System.out.print(row.getText());
	        			}
	        		}
	        		i++;
	        }
	}

}
