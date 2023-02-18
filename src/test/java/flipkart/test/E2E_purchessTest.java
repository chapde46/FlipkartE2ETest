package flipkart.test;

import java.util.ArrayList;
import java.util.Set;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonLibrary.BaseClass;
import flipcart.pageobjects.addtocartPOM;
import flipcart.pageobjects.buyitemPOM;
import flipcart.pageobjects.loginPOM;

public class E2E_purchessTest extends BaseClass  
{
	loginPOM a1;
	buyitemPOM a2 ;
	addtocartPOM a3 ;
	@BeforeClass
	public void browser()
	{
		Browser();
	}
	@BeforeMethod
	public void objectclass()
	{
		a1 = new loginPOM(driver);
		a2 = new buyitemPOM(driver);
		a3 = new addtocartPOM (driver);
	}
	@Test
	public void Testcas1() throws InterruptedException
	{
		a1.loginpopup();
		a1.dashboard();
		a2.buyitem1();
		a2.buyitem2();
		
		Set<String> win2 = driver.getWindowHandles();
		ArrayList<String> a1=new ArrayList<String>(win2);
		String s1 = a1.get(1);
		driver.switchTo().window(s1);
		a3.addtocart1();
	
	}
	{
		
	}

}
