package javatestmay;

public  class varTest 
{

//	static int roll1 = 106;						// Static Variable
//	String name1 = "Hello World 2";				//Instance Variable
	
	int test()									//Instance Method 
	{
		int a = 8;
		int b = 5;
		int c = a + b;
		
		System.out.println(c);
		
		return 5;
		
		//System.out.println(c);
	}
	
	
	
	public static void main(String args[]) 			//Static Method
	{
		int roll = 106;							//  Local Variable (Instance)
		
		String name = "Hello World 2";			//String --> data type    // name --> variable   //"John Doe"  ---> value
		
		System.out.println("Hello World 1");
		
		System.out.println(name);
		
		
	
		
		System.out.println("Roll no. is "+roll);
		
		varTest  t = new varTest();								// object creation
		
		// new varTest().test();
		t.test();
		
		System.out.println("this is end st.");
		test2();										// called directly
		varTest.test2();								// class name
		t.test2();										// by using object
		System.out.println("Last Line");
		
	}
	
	static void test2()
	{
		System.out.println("static method test2");
	}

	
}
