package Tests;

import org.testng.annotations.Test;

import Pages.Menu5;

public class Menu5test extends HomePage{
	
	@Test
	public void perform() throws Exception
	{
		Menu5 obj = new Menu5(driver);
		obj.perform1();
	}

}
