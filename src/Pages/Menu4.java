package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Menu4 {
	
	WebDriver driver;
	
	
	public Menu4(WebDriver driver) {
		this.driver = driver;
	}

	public void perform1() throws Exception
	{
		Actions act = new Actions(driver);
		WebElement main = driver.findElement(By.xpath("//*[@id=\"lrd4\"]"));
		act.moveToElement(main).perform();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/div[3]/div/div[1]/div[4]/div/div/div[2]/div[1]/a")));
		WebElement sub = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div[1]/div[4]/div/div/div[2]/div[1]/a"));
		act.moveToElement(sub).perform();
		sub.click();
		Thread.sleep(5000);
	}
	
	public void perform2() throws Exception
	{
		Actions act = new Actions(driver);
		WebElement main = driver.findElement(By.xpath("//*[@id=\"lrd4\"]"));
		act.moveToElement(main).perform();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/div[3]/div/div[1]/div[4]/div/div/div[4]/div[4]/a")));
		WebElement sub = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div[1]/div[4]/div/div/div[4]/div[4]/a"));
		act.moveToElement(sub).perform();
		sub.click();
		Thread.sleep(5000);
	}
	
	public void perform3() throws Exception
	{
		Actions act = new Actions(driver);
		WebElement main = driver.findElement(By.xpath("//*[@id=\"lrd4\"]"));
		act.moveToElement(main).perform();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/div[3]/div/div[1]/div[4]/div/div/div[6]/div[2]/a")));
		WebElement sub = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div[1]/div[4]/div/div/div[6]/div[2]/a"));
		act.moveToElement(sub).perform();
		sub.click();
		Thread.sleep(5000);
	}
	
	public void perform4() throws Exception
	{
		Actions act = new Actions(driver);
		WebElement main = driver.findElement(By.xpath("//*[@id=\"lrd4\"]"));
		act.moveToElement(main).perform();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/div[3]/div/div[1]/div[4]/div/div/div[8]/div[5]/a")));
		WebElement sub = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div[1]/div[4]/div/div/div[8]/div[5]/a"));
		act.moveToElement(sub).perform();
		sub.click();
		Thread.sleep(5000);
	}
	
	public void perform5() throws Exception
	{
		Actions act = new Actions(driver);
		WebElement main = driver.findElement(By.xpath("//*[@id=\"lrd4\"]"));
		act.moveToElement(main).perform();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/div[3]/div/div[1]/div[4]/div/div/div[10]/div[3]/a")));
		WebElement sub = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div[1]/div[4]/div/div/div[10]/div[3]/a"));
		act.moveToElement(sub).perform();
		sub.click();
		Thread.sleep(5000);
	}
}
