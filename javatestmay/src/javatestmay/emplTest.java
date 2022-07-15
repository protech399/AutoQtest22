package javatestmay;



public class emplTest {

	int eid;
	String ename;
	
	
	public static void main(String[] args) 
	{
		//3 ways of initializing objects
		// Way-1 : By using Ref. var. 
		
		
		emplTest e1  = new emplTest();					
		System.out.println(e1.eid);
		System.out.println(e1.ename);
		
		emplTest e2  = new emplTest();
		System.out.println(e2.eid);
		System.out.println(e2.ename);			
		
		// Default values get initialized (for int --> 0 and for String --> null)
	}

}
