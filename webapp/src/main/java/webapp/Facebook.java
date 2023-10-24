package webapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void initbrowser() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
	}
	
	@Test
	public void webelements() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("srini");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123");
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
	}
	
	@AfterTest
	public void closebrowser() {
		driver.quit();
	}

}
