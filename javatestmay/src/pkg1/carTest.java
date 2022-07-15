package pkg1;

public class carTest extends vehicleTest
{
	void start()
	{
		System.out.println("Starts with Key");
	}
	
	void seats()
	{
		System.out.println("Seats =5");
	}
	public static void main(String[] args) 
	{
		//vehicleTest vt = new vehicleTest();   //can't instantiate abstract class 
		
		carTest ct = new carTest();
		ct.start();
		ct.seats();
	}
	
}
