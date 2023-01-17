package ReadExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Aspire\\eclipse-workspace\\SeleniumProject\\TestData\\Book1.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet2");
		
		for(int row=0;row<4;row++)
		{
			for(int col=0;col<3;col++)
			{
				String v = excel.getRow(row).getCell(col).getStringCellValue();
				System.out.print(v + "\t\t");
			}
			System.out.println();
		}
		
	} 

}
