package javatestmay;

public class dataTypes 
{

	public static void main(String[] args) 
	{
		byte a  = 127;			//1 byte
		
//		short b = 456;			//2 byte
//		
		int c  =  2147483647;		//4 byte
			
		//long d  = 92233720388l;		//8 byte
		
		System.out.println("++++++++++++++++++++++++++++++Implicit Casting (aka Widening Casting)+++++++++++++++++++++++++++++++");
		short s = a;									//Implicit Casting (aka Widening Casting)
		System.out.println(s);
	
		long l =  c;
		System.out.println(l);
		
		System.out.println("++++++++++++++++++++++++++++++Explicit Casting (aka Narrowing Casting)+++++++++++++++++++++++++++++++");

		double db = 5.46;							//8 byte
		
	    int i  = (int) db;								//4 byte
		System.out.println(i);
		
		long ln = (long) db;
		System.out.println(ln);
		
		System.out.println("++++++++++++++++++++++++++++++Other Data Types+++++++++++++++++++++++++++++++");

		char ch = 'a';								//2 byte	
		System.out.println("Character data type example: "+ch);
		
		char ch1 = 60;								//60 is ASCII value for '<'
		System.out.println("ch1 is: "+ch1);
		
		char ch2 = '<';
		System.out.println("ch2 is: "+ch2);
		
		boolean bl = false;												//1 - bit of memory (Either 0 or 1)
		System.out.println("Boolean data type example: "+bl);		
	
		
		float fl = 9.45f;
		System.out.println("Floating data type example: "+fl);		
	}

}
