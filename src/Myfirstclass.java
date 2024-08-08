import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myfirstclass {
static WebDriver driver;
	
	@BeforeClass
	public  void setup()
	{
		 WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
	}
   @Test
	public static void first() 
	{
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title=driver.getCurrentUrl();
		   System.out.println(title);
	}
	@Test
	public static void login() 
	{
	System.out.println("this is a login method");	
	}
	

	@AfterClass
	public  void tearup() {
		
		driver.close();
	}

}