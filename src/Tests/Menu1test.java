package Tests;

import org.testng.annotations.Test;

import Pages.Menu1;

public class Menu1test extends HomePage{
	
	@Test
	public void perform() throws Exception
	{
		Menu1 obj = new Menu1(driver);
		obj.perform1();
	}

}
