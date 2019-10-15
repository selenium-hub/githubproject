package libraryfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	static WebDriver driver;
	public static WebDriver startbrowser(String browsername, String URL) {
		if(browsername=="chrome")
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\a08019dirp_c2c.04.02\\Desktop\\eclipse-jee-2019-06-R-win32-x86_64\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		driver.get(URL);
		return driver;
		
	}
	
}
