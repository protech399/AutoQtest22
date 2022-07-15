package javatestmay;

public class methodsTest 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
//		m1();																	//directly calling static method
//		methodsTest.m2();														//by using class name
//		
		methodsTest ref = new methodsTest();									//creating an object
//		ref.m1();																//by creating object
		
		ref.m3();																//instance method is called in static 
		ref.m4();
	}
	
	static void m1()
	{
		System.out.println("static method M1");
	}
	
	static void m2()
	{
		System.out.println("static method M2");
	}
	
	void m3()
	{
		m1();											//calling static method directly in instance method
		m2();
		System.out.println("Non-static method M3");
	}
	
	void m4()
	{
		m3();
		System.out.println("Non-static method M4");
	}
}



/*Main Method
static method M1
static method M2
Non-static method M3
*/