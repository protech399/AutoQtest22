package SDETdataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtility {

	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;
	String path=null;
	
	XLUtility(String path){
		this.path=path;
	}
	
	public int getRowCount(String sheetNmae) throws IOException {
		fi= new FileInputStream(path);
		workbook = new XSSFWorkbook(fi);
		sheet= workbook.getSheet(sheetNmae);
		int row count
	}
	
	
	
}
