package flipcart.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPOM
{
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']") private WebElement popup;	
	@FindBy(xpath = "//input[@class='_3704LK']") private WebElement search;
	@FindBy(xpath = "//ul[@class='col-12-12 _1MRYA1 _38UFBk']/li") private List<WebElement> searchlist;
	
	
	
	public loginPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void loginpopup()
	{
		popup.click();
	}
	
	public void dashboard( )
	{
		search.sendKeys("ipad");
		for(int i=0; i<=searchlist.size()-1; i++)
		{
			if(searchlist.get(i).getText().equals("ipad pro"))
			{
				searchlist.get(i).click();
			}
		}
	}
	
	
}
