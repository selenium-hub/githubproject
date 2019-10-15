package seleniumdemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fileoutput {
  @Test
  public void f() throws IOException {
File src = new File("C:\\Users\\a08019dirp_c2c.04.02\\Desktop\\Data.xlsx");
	  
	  FileInputStream fis = new FileInputStream(src);
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sheet1 = wb.getSheetAt(0);
	 
	  
	  
	  for(int i=0; i<2;i++)
	  {
		  
		  String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
		  System.out.println(data0);
		  
		  String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
		  System.out.println(data0);
		  
	  }
	  sheet1.getRow(0).createCell(2).setCellValue("Pass");
	  sheet1.getRow(1).createCell(2).setCellValue("Fail");
	  
	  FileOutputStream fo = new FileOutputStream(src);
	  wb.write(fo);
	  wb.close();
	  
	  
  }
  }

