package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoTest {

	public static void main(String[] args) throws IOException {

		FileInputStream dmo= new FileInputStream("C:\\Users\\DELL\\Desktop\\demoTest.xlsx");
		
		XSSFWorkbook workbook =new XSSFWorkbook(dmo);
		XSSFSheet sheet = workbook.getSheet("test1");
		
		
		
	}

}
