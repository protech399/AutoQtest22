package javatestmay;

public class constructorTest {

	constructorTest()										// default constructor
	{
		System.out.println("inside the default constructor");
	}
	
	constructorTest(int a)										//parameterized constructor
	{
		System.out.println("inside the parameterized constructor");
	}
	
	public static void main(String[] args) 
	{
		constructorTest c = new constructorTest(5);
		
		//c.m1();
		//m3();
		System.out.println("in main method: end");
	}

	void m1()									//non-static 
	{
		System.out.println("method1");
		m2();
		//m3();
	}
	
	void m2()									//non-static 
	{
		System.out.println("method2");
	}
	
	static void m3()									//static 
	{
		System.out.println("method3");
		constructorTest c1 = new constructorTest();
		//c1.m1();
	}
	
//	static 
//	{
//		System.out.println("in static block");
//	}
//	
//	{
//		
//		System.out.println("in non-static block");
//	}
//	
	
}
