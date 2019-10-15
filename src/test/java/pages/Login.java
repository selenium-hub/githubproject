package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	By username = By.name("userName");
	By password = By.name("password");
	By submit = By.name("login");
	
	public Login(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void loginuser(String un, String pass)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(submit).click();
	}

}
