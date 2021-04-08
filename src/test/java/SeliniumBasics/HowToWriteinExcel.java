package SeliniumBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HowToWriteinExcel {
	public static void main(String[]args) throws Exception {
		File f=new File("./Excel/Book1.xlsx");
		FileInputStream fs=new FileInputStream(f);
		XSSFWorkbook rs=new XSSFWorkbook(fs);
		XSSFSheet paper=rs.getSheetAt(0);
		System.out.println(paper.getRow(1).getCell(2).getRawValue());
		
	}

}
