package Tests;

import org.testng.annotations.Test;

import Pages.Menu3;

public class Menu3test extends HomePage{
	
	@Test
	public void perform() throws Exception
	{
		Menu3 obj = new Menu3(driver);
		obj.perform1();
	}
	

}
