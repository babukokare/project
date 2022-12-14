package pomclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
//declaration
	@FindBy(xpath="//div[@class='app_logo']") private WebElement logo;
	//initialization
	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//usage
	public void varifyHomePageLogo() 
	{
		boolean res=logo.isDisplayed();
		if(res==true) 
		{
			System.out.println("logo is visible");
		}
		else
			System.out.println("logo is not visible");
	}
	
	
	
	
	
	
	
}
