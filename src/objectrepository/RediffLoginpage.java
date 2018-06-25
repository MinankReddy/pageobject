package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {
	
	WebDriver driver;
	public RediffLoginpage(WebDriver driver)
	{
	this.driver=driver;	
	}
	By username=By.xpath("//*[@id='login1']");
	By Password=By.name("passwd");
	By Go=By.name("proceed");
	By home=By.linkText("Home");
	By shopping=By.xpath("//div[@class='divicon relative']/img");
	
	public WebElement Emailid()
	{
		return driver.findElement(username);
	}
			
	public WebElement password()
	{
		return driver.findElement(Password);
	}
	
	public WebElement submit()
	{
		return driver.findElement(Go);
		
	}
			
	public WebElement Home()
	{
		return driver.findElement(home);
	}
    
	public WebElement Shopping()
	{
		return driver.findElement(shopping);
	}
}
