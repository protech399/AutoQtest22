package pkg1;

public class clsIntrTest implements Intr1{

	
	public void test()
	{
		System.out.println("QA");
	}
	
	
	
	public static void main(String[] args) 
	{
		
		//Intr1 i1 = new Intr1();    // can not create object of Interface
		
		clsIntrTest ci = new clsIntrTest();
		ci.test();
	}

}
