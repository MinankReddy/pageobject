package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import objectrepository.RediffLoginpage;

public class Loginapplication {
	
	@Test
	public void Login()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginpage rd=new RediffLoginpage(driver);
		rd.Emailid().sendKeys("hello");
		rd.password().sendKeys("hello");
		rd.submit().click();
		rd.Home().click();
		rd.Shopping().click();
		
		
		
	}
	}
	

