package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class HomePage {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lenskart.com/");
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();//popup notification cancel
		
	}

}
