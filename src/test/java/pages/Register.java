package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {
	WebDriver driver;
	By Register = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a");
	By Firstname = By.name("firstName");
	By Lastname = By.name("lastName");
	By Phone = By.name("phone");
	By Emailid = By.name("userName");
	By Submit = By.name("register");

public Register(WebDriver driver)
{
	this.driver = driver;
}

public void registernewuser(String fn, String ln, String ph, String em)
{
	driver.findElement(Register).click();
	driver.findElement(Firstname).sendKeys(fn);
	driver.findElement(Lastname).sendKeys(ln);
	driver.findElement(Phone).sendKeys(ph);
	driver.findElement(Emailid).sendKeys(em);
	driver.findElement(Submit).click();
}
}
