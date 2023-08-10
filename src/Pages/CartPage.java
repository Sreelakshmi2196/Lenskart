package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	
	WebDriver driver;
	
	By cart = By.xpath("//*[@id=\"header\"]/div[2]/div/div[3]/div[4]/span");
	By contishop = By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/div/div/div/div[2]/button");
	
	public CartPage(WebDriver driver) {
	
		this.driver = driver;
	}

	public void addtocart() throws InterruptedException
	{
		driver.findElement(cart).click();
		Thread.sleep(5000);
	}
	
	public void cshop()
	{
		driver.findElement(contishop).click();
	}

}
