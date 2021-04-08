package SeliniumBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HowToReadExcel {
public static void main(String[]args) throws Exception {
	File ff=new File("./Excel/Book1.xlsx");
	FileInputStream fis=new FileInputStream(ff);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheetAt(0);
	System.out.println(sheet.getRow(1).getCell(3).getStringCellValue());

	FileOutputStream fos=new FileOutputStream(ff);
	sheet.getRow(1).createCell(5).setCellValue("Rajinessh posa");	
	sheet.getRow(1).createCell(8).setCellValue("Anush reddy");
	wb.write(fos);
			
	
	
}
}
