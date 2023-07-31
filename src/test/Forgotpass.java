package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Forgotpass {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void testcase()
	{
		
		
	}
	
	
	
	

}
