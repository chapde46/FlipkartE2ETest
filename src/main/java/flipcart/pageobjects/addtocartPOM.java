package flipcart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocartPOM 
{

	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']") private WebElement addtocart;
	@FindBy(xpath = "//button[@class='_2KpZ6l _3-J4S1']") private WebElement addtocart2;
	@FindBy(xpath = "//button[@class='_2KpZ6l _2ObVJD _3AWRsL']") private WebElement placeorder;

	
	public addtocartPOM (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void addtocart1()
	{
		addtocart.click();
		addtocart2.click();
		placeorder.click();
	}
	



}
