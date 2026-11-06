package Base_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import page_package.Keralalogin;

public class Kerala_baseclass {
	public static WebDriver driver;
	public static Keralalogin loginobj;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void objectmthd()
	{
		loginobj=new Keralalogin(driver);
	}

}
