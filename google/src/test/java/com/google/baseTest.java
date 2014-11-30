package com.google;
import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseTest 
{	
	public static WebDriver driver;

	@BeforeClass
	public static void beforeClass() 
	{
		//instantiate firefox driver
		driver=new FirefoxDriver();
		
		//opens google website
		driver.get("https://www.google.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@AfterClass
	public static void afterclass()
	{
		driver.quit();

	}

}

