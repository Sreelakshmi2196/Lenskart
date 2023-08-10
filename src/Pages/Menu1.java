package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Menu1 {
	
	WebDriver driver;
	
	public Menu1(WebDriver driver) {
		this.driver = driver;
		
	}

	public void perform1() throws Exception
	{
		Actions act = new Actions(driver);
		WebElement main = driver.findElement(By.xpath("//*[@id=\"lrd1\"]"));
		act.moveToElement(main).perform();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/div[3]/div/div[1]/div[1]/div/div/div[3]/div[2]/span")));
		WebElement sub = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div[1]/div[1]/div/div/div[3]/div[2]/span"));
		act.moveToElement(sub).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/div[3]/div/div[1]/div[1]/div/div/div[5]/a[2]/div[1]/span[1]")));
		WebElement sub1 = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div[1]/div[1]/div/div/div[5]/a[2]/div[1]/span[1]"));
		act.moveToElement(sub1).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/div[3]/div/div[1]/div[1]/div/div/div[7]/div[1]/a")));
		WebElement sub2 = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div[1]/div[1]/div/div/div[7]/div[1]/a"));
		act.moveToElement(sub2).perform();
		sub2.click();	
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,150)","");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"next\"]/div[2]/div/div[2]/div/div[1]/section/div/div[3]/div[1]/div[1]/div/div[1]/a/div[3]/p")).click();
	}
	
}
