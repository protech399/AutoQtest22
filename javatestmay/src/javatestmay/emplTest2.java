package javatestmay;

public class emplTest2 {

	int eid2 = 100;
	String ename2 = "abc";
	
	
	public static void main(String[] args) {

				//3 ways of initializing objects
				// Way-1  : By using ref var

		emplTest2 e1 = new emplTest2();
		System.out.println(e1.eid2);
		System.out.println(e1.ename2);
		
		emplTest2 e2 = new emplTest2();
		System.out.println(e2.eid2);
		System.out.println(e2.ename2);		
		
		
	}

}
