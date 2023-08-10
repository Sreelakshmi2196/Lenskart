package Tests;

import org.testng.annotations.Test;

import Pages.Menu6;

public class Menu6test extends HomePage{
	
	@Test
	public void perform() throws Exception
	{
		Menu6 obj = new Menu6(driver);
		obj.perform1();
	}

}
