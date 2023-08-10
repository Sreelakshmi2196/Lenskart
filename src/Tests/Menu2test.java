package Tests;

import org.testng.annotations.Test;

import Pages.Menu2;

public class Menu2test extends HomePage{
	
	@Test
	public void perform2() throws Exception
	{
		Menu2 obj = new Menu2(driver);
		obj.perform1();
	}

}
