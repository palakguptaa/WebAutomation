package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void logintest() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Documents\\BNP\\training\\testing\\tool\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://automationpractice.com/index.php");
		
		
	    driver.findElement(By.className("login")).click();        
	    Thread.sleep(5000);
	    
	    driver.findElement(By.id("email")).sendKeys("register100@gmail.com");
	    driver.findElement(By.id("passwd")).sendKeys("comeon");
		driver.findElement(By.id("SubmitLogin")).click();
	    Thread.sleep(5000);
	    
	    Assert.assertEquals("MY ACCOUNT", driver.findElement(By.className("page-heading")).getText(), "Login Unsuccessfull!");
		System.out.println("Login Successfull");
		   
		driver.close();
	}

}
