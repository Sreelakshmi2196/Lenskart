package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Menu6 {
	
	WebDriver driver;
	
	
	
	public Menu6(WebDriver driver) {
		this.driver = driver;
	}

	public void perform1() throws Exception
	{
		Actions act = new Actions(driver);
		WebElement main = driver.findElement(By.xpath("//*[@id=\"lrd9\"]"));
		act.moveToElement(main).perform();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/div[3]/div/div[1]/div[7]/div/div/div[1]/a")));
		WebElement sub = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div[1]/div[7]/div/div/div[1]/a"));
		act.moveToElement(sub).perform();
		sub.click();
		Thread.sleep(5000);
	}
	
	

}
