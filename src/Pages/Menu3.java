package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Menu3 {
	
	WebDriver driver;
	
	public Menu3(WebDriver driver) {
		this.driver = driver;
	}

	public void perform1() throws Exception
	{
		Actions act = new Actions(driver);
		WebElement main = driver.findElement(By.xpath("//*[@id=\"lrd11\"]"));
		act.moveToElement(main).perform();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/div[3]/div/div[1]/div[3]/div/div/a[2]/div")));
		WebElement sub = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div[1]/div[3]/div/div/a[2]/div"));
		act.moveToElement(sub).perform();
		sub.click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,150)","");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"next\"]/div[2]/div/div[2]/div/div/section/div/div[3]/div[1]/div[1]/div/div[3]/a/div[3]/p")).click();
	}

}
