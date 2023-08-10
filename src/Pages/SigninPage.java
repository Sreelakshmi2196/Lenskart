package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage {
	
	WebDriver driver;
	
	By sign = By.xpath("//*[@id=\"header\"]/div[2]/div/div[3]/div[2]/span[1]");
	
	By semail = By.xpath("//*[@id=\"sign-in-form\"]/div/div[2]/div[2]/div[1]/input");
	By but1 = By.xpath("//*[@id=\"remove-button\"]");
	
	By pwd = By.xpath("//*[@id=\"sign-in-form\"]/div/div[2]/div[3]/div[1]/input");
	By cbox = By.xpath("//*[@id=\"whatsapp-updates\"]/div");
	By but2 = By.xpath("//*[@id=\"remove-button\"]");
	
	
	public SigninPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void signin()
	{
		driver.findElement(sign).click();
	}

	public void signin1(String email) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(semail).sendKeys(email);
		Thread.sleep(5000);
		driver.findElement(but1).click();
	}
	
	public void signin2(String password) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(pwd).sendKeys(password);
		driver.findElement(cbox).click();
		Thread.sleep(5000);
		driver.findElement(but2).click();

	}

}
