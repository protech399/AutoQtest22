import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperty {

	public static void main(String[] args) {
		
		
		Properties prop=new Properties(); // This class is available in java
		
		FileInputStream ip= new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\AutoQtest\\src\\main\\resources\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
//		System.out.println(prop.getProperty("age"));
//		System.out.println(prop.getProperty("url"));
//		System.out.println(prop.getProperty("browser"));

		
	}

}
