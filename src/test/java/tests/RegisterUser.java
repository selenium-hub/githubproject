package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import libraryfunctions.BrowserFactory;
import pages.Register;

public class RegisterUser {
  @Test
  public void newuser() throws InterruptedException {
	  WebDriver driver = BrowserFactory.startbrowser("chrome", "http://newtours.demoaut.com/");
	  Thread.sleep(2000);
	  Register reg = new Register(driver);
	  reg.registernewuser("test", "user", "1234567890", "abcd@gmail.com");
  }
}
