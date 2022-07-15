package pkg1;

public class childTest extends parentTest {

	public static void main(String[] args) 
	{
//		childTest ch = new childTest();
//		ch.m1();
//		ch.m2();
//		ch.m3();
//		ch.m4();
		
//		parentTest p = new childTest();
//		p.m1();
//		p.m2();
//		p.m3();
//		//p.m4();
	
		
		parentTest p = new parentTest();
		p.m1();
		p.m2();
		p.m3();
		
	}

	void m4()
	{
		System.out.println("Method 4 in Child Class");
	}
	
	
}
