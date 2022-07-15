package besicOfAutomationtesting;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelTest {
		
		
		
	public static void main(String[] args) throws IOException  {
		
		
		
		
		
		
//		Java class
		FileInputStream fs= new FileInputStream("C:\\Users\\DELL\\Desktop\\demoTest.xlsx");
		
		String data =WorkbookFactory.create(fs).getSheet("test1").getRow(11).getCell(9).getStringCellValue();
		System.out.println(data);
		
	
		
		
	}

}
