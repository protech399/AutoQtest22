package javatestmay;

public class emplTestConstr {

	String ename4;
	int eid4;
	
	emplTestConstr(int eid, String ename)
	{
		ename4 = ename;
		System.out.println("Employee Name is "+ename4);
		eid4 = eid;
		System.out.println("Employee ID is "+eid4);
	}
	
//	void display()
//	{
//		System.out.println("Employee Name is "+ename4);
//		System.out.println("Employee ID is "+eid4);
//	}
	
	public static void main(String[] args)
	{
		emplTestConstr e1 = new emplTestConstr(100, "abc");
		//e1.display();
		
		emplTestConstr e2 = new emplTestConstr(200, "xyz");
		//e2.display();
	}

}
