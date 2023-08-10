package Tests;

import org.testng.annotations.Test;

import Pages.SigninPage;

public class SigninTest extends HomePage{
	
	@Test
	public void signin3() throws InterruptedException
	{
		SigninPage obj2 = new SigninPage(driver);
		obj2.signin();
		obj2.signin1("sreelakshmi2196@gmail.com");
		obj2.signin2("Sree21*96");
	}

}
