package besicOfAutomationtesting;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcelForLoop {

	public static void main(String[] args) throws IOException {
		
		File path = new File("C:\\Users\\DELL\\Desktop\\demoTest.xlsx");
		
		FileInputStream load = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		
		XSSFSheet test1 = workbook.getSheetAt(0);
		
//		String data = test1.getRow(11).getCell(9).getStringCellValue();
//		
//		System.out.println(data);
		
//		using for loop reading the sheet data
		int rows = test1.getLastRowNum();
		int colm = test1.getRow(1).getLastCellNum();
		
		for(int r=0; r<=rows; r++) {
			XSSFRow row=test1.getRow(r);
			
			for(int c=0; c< colm; c++){
				XSSFCell cell = row.getCell(c);
				switch(cell.getCellType()) {
				case STRING: System.out.print(cell.getStringCellValue());
				break;
				case NUMERIC: System.out.print(cell.getNumericCellValue());
				break;
				case BOOLEAN: System.out.print(cell.getBooleanCellValue());
				case BLANK:
					break;
				case ERROR:
					break;
				case FORMULA:
					break;
				case _NONE:
					break;
				default:
					break;
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
		
	}

}
