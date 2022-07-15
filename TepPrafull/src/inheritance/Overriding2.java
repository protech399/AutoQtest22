package inheritance;

class vehicle extends Bike
{
	void run()
	{
		System.out.println("Vehicle is Running");
	}
}

class Bike 
{
	void run()
	{
		System.out.println("Bike is Running");
	}
}

public class Overriding2 {

	public static void main(String[] args) {
		vehicle v=new vehicle();
		v.run();
		
		Bike b=new Bike();
		b.run();
		
		 Bike v1= new vehicle();
		v1.run();
		
	}

}
