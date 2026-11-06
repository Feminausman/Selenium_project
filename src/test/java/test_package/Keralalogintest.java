package test_package;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Base_package.Kerala_baseclass;

public class Keralalogintest extends Kerala_baseclass {
	@Test
	public void testmthd1()
	{
		String actualtitle=loginobj.titleverification();
		Assert.assertEquals(actualtitle,"Post your Property - Login | Keralaproperty");
	}
	
	@Test
	public void testmthd2() 
	{
		loginobj.loginmthd("abcd","abc@123");
	}
	
	@AfterTest
	public void close()
	{
		driver.quit();
	}

}
