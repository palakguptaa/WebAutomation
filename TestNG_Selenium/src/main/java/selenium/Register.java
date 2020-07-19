package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Register {
	
	@Test
	public void registertest() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Documents\\BNP\\training\\testing\\tool\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://automationpractice.com/index.php");
	    
	    driver.findElement(By.className("login")).click();        
	    Thread.sleep(5000);
	    
	   try { driver.findElement(By.id("email_create")).sendKeys("register105@gmail.com");
        driver.findElement(By.className("icon-user")).click();
	    Thread.sleep(5000);
	   }
	   catch(Exception e){
		   
		   System.out.println("This email ID is already registered. Use some other ID");
	   }
	   driver.findElement(By.id("id_gender2")).click();
	   driver.findElement(By.id("customer_firstname")).sendKeys("Palak");
	   driver.findElement(By.id("customer_lastname")).sendKeys("Gupta");
	   driver.findElement(By.id("passwd")).sendKeys("comeon");
	   
	   driver.findElement(By.id("days")).click();
	   driver.findElement(By.xpath("//*[@id=\"days\"]/option[5]")).click();
	   driver.findElement(By.id("months")).click();
	   driver.findElement(By.xpath("//*[@id=\"months\"]/option[5]")).click();
	   driver.findElement(By.id("years")).click();
	   driver.findElement(By.xpath("//*[@id=\"years\"]/option[24]")).click();
	   
	   driver.findElement(By.id("address1")).sendKeys("1012, Sector 9");
	   driver.findElement(By.id("city")).sendKeys("Faridabad");
	   
	   driver.findElement(By.id("id_state")).click();
	   driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[6]")).click();
	   
	   driver.findElement(By.id("postcode")).sendKeys("12100");
	   driver.findElement(By.id("phone_mobile")).sendKeys("9654406999");
	   driver.findElement(By.id("submitAccount")).click();
	   Thread.sleep(5000);	   
	   
	   Assert.assertEquals("MY ACCOUNT", driver.findElement(By.className("page-heading")).getText(), "Registration Unsuccessfull!");
	   System.out.println("Registration Successfull");
	   
	    driver.close();
	
	}
}