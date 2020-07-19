package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Search {
	
	
	@Test
	public void searchtest() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Documents\\BNP\\training\\testing\\tool\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://automationpractice.com/index.php");
	    
	    driver.findElement(By.className("search_query")).sendKeys("top");  
		driver.findElement(By.className("button-search")).click();
		
	    Assert.assertEquals("Search", driver.findElement(By.className("navigation_page")).getText(), "Search Error");
	    String m = driver.findElement(By.className("heading-counter")).getText();
	    System.out.println(m);
	    
	    driver.close();	    
		
		
	}
}
