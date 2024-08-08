import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myfirstclass {
static WebDriver driver;
	
	@BeforeMethod
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
	public static void first1() 
	{
		assert false;
	}
	

	@AfterMethod
	public  void tearup() {
		
		driver.close();
	}

}