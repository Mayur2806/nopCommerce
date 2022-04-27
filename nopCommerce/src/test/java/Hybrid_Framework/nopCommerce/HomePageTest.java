package Hybrid_Framework.nopCommerce;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.UtilityMethods;

public class HomePageTest extends UtilityMethods{


	
	public void HomepageTest(WebDriver driver) {
		this.driver = driver;
	}
	@Override
	@BeforeTest
	public void intializeDriver() throws IOException {
		// TODO Auto-generated method stub
		super.intializeDriver();
	}
		
	
	@Test
	public void NavigateToBasePage() {
		String url = prop.getProperty("url");
		System.out.println(url);
		driver.get(url);
	}
}
