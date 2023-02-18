package flipcart.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class buyitemPOM {
	
	@FindBy(xpath = "//section[contains(@class,'_167Mu')]/div/div") private List<WebElement> filter;
	
	@FindBy(xpath = "//input[@type='checkbox']") private List<WebElement> ram;

	@FindBy(xpath = "//div[@class='_4rR01T']") private WebElement F1link;	
	public buyitemPOM (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void buyitem1() throws InterruptedException
	{		
		for(int i=0; i<=filter.size()-1; i++)
		{
			if(filter.get(i).getText().equals("Connectivity"))
			{
				filter.get(i).click();
			}
		}
		Thread.sleep(3000);
		for(int i=0; i<=ram.size()-1; i++)
		{
			
			if(ram.get(i).getText().equals("Wi-Fi Only"))
			{
				ram.get(i).click();
			//	ram.get(i).findElement(By.xpath("/preceding-sibling::input")).click();
				
			}
		}
	}

	public void buyitem2()
	{
		F1link.click();
	}
	


}
