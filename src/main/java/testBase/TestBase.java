package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.db.pageLayer.CartPage;
import com.db.pageLayer.HomePage;
import com.db.pageLayer.LoginPage;
import com.db.utilities.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase 
{
 
	public static WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
     public void setUp(String set)
    {
	 
		
		
		if(set.equalsIgnoreCase("chrome"))
		{
		 WebDriverManager.chromedriver().setup();
         driver= new ChromeDriver();
		}
		else if(set.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		
		else if(set.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		
		else
		{
			System.out.println("Please provide Brower");
		}
		
		
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 
		
    }
		
		
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
		
		
 
}

