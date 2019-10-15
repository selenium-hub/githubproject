package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import libraryfunctions.BrowserFactory;
import pages.LoginusingPageFactory;

public class PageFactoryLogin {
  @Test
  public void loginpage() throws InterruptedException {
	  WebDriver driver = BrowserFactory.startbrowser("chrome", "http://newtours.demoaut.com/");
	  Thread.sleep(2000);
	  LoginusingPageFactory log = PageFactory.initElements(driver, LoginusingPageFactory.class);
	  log.login("tutorial", "tutorial");
  }
}
