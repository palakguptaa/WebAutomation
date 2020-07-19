package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Addtocart {
	
	@Test
	public void addtocarttest() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Documents\\BNP\\training\\testing\\tool\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://automationpractice.com/index.php");
	    
//	    driver.findElement(By.className("login")).click();        
//	    Thread.sleep(5000);
//	    
//	    driver.findElement(By.id("email")).sendKeys("register100@gmail.com");
//	    driver.findElement(By.id("passwd")).sendKeys("comeon");
//		driver.findElement(By.id("SubmitLogin")).click();
//	    Thread.sleep(5000);
//	    
//	    driver.findElement(By.className("logo")).click();	
//	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/h5/a[@href=\'http://automationpractice.com/index.php?id_product=1&controller=product\']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
		Thread.sleep(5000);
		
		Assert.assertEquals("Your shopping cart", driver.findElement(By.className("navigation_page")).getText(), "Not added to the cart");
		System.out.println("Added to the cart");
		
		driver.close();
	}

}
