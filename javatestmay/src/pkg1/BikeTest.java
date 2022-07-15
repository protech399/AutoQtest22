package pkg1;

public class BikeTest extends vehicleTest {

	void start()
	{
		System.out.println("Starts with Kick");
	}
	
	void seats()
	{
		System.out.println("Seats =2");
	}
	
	public static void main(String[] args) 
	{
		BikeTest bt = new BikeTest();
		bt.seats();
		bt.start();
	}
}
