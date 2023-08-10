package Tests;

import org.testng.annotations.Test;

import Pages.Menu4;

public class Menu4test extends HomePage{
	
	@Test
	public void perform() throws Exception
	{
		Menu4 obj = new Menu4(driver);
		obj.perform1();
		driver.navigate().back();
		Thread.sleep(5000);
		obj.perform2();
		driver.navigate().back();
		Thread.sleep(5000);
		obj.perform3();
		driver.navigate().back();
		Thread.sleep(5000);
		obj.perform4();
		driver.navigate().back();
		Thread.sleep(5000);
		obj.perform5();
		Thread.sleep(5000);
	}

}
