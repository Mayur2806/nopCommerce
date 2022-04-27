package Utilities;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class UtilityMethods {

	public WebDriver driver;
	public Properties prop;
	
	public void intializeDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\patil\\git\\gitlabDemo\\nopCommerce\\src\\main\\java\\TestData\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\\\Self Study\\\\Java CDAC\\\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox"))
		{
			 //driver= new FirefoxDriver();
			//firefox code
		}
		else if (browserName.equals("IE"))
		{
//			IE code
		}
	}
}
