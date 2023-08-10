package Tests;

import org.testng.annotations.Test;

import Pages.CartPage;

public class CartTest extends HomePage{
	
	
	@Test
	public void adcart() throws InterruptedException
	{
		CartPage obj = new CartPage(driver);
		obj.addtocart();
		obj.cshop();
	}

}
