package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Login;
import libraryfunctions.BrowserFactory;

public class Logintest {
  @Test
  public void login() throws InterruptedException {
	  WebDriver driver = BrowserFactory.startbrowser("chrome", "http://newtours.demoaut.com/");
	  Thread.sleep(2000);
	  Login log = new Login(driver);
	  log.loginuser("tutorial", "tutorial");
	  Thread.sleep(2000);
	  driver.close();
  }
}
