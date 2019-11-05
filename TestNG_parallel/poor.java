package TestNG_parallel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class poor {
	WebDriver driver;
  
	
	@Test
  public void f() throws InterruptedException {
	Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("how to be poor");
		driver.findElement(By.name("btnK")).click();
  }
 
	
	@BeforeClass
  public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ayesha\\eclipse-workspace\\SeleniumPractice\\Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(10000);
	  driver.quit();
  }

}
