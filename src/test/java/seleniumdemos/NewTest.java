package seleniumdemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void readfile() throws IOException, InterruptedException {
	  File src = new File("C:\\Users\\a08019dirp_c2c.04.02\\Desktop\\Data.xlsx");
	  
	  FileInputStream fis = new FileInputStream(src);
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sheet1 = wb.getSheetAt(0);
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\a08019dirp_c2c.04.02\\Desktop\\eclipse-jee-2019-06-R-win32-x86_64\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  
	  for(int i=0; i<2;i++)
	  {
		  driver.get("http://newtours.demoaut.com/");
		  WebElement username = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"));
		  WebElement password = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"));
		  String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
		  System.out.println("row 0 cel 0 " +data0);
		  username.sendKeys(data0);
		  String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
		  System.out.println("row 0 cel 0 "+data1);
		  password.sendKeys(data1);
		  Thread.sleep(2000);
		  //driver.close();
	  }
	  wb.close();
	  driver.close();
	  
  }
}
