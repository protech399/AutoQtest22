package Constructor;

public class emp1TestConstr {


		String ename4;
		int eid4;
		
		emp1TestConstr(int eid, String ename)
		{
			ename4 = ename;
			//System.out.println("Employee Name is "+ename4);
			eid4 = eid;
			//System.out.println("Employee ID is "+eid4);
		}
		
		void display()
		{
			System.out.println("Employee Name is "+ename4);
			System.out.println("Employee ID is "+eid4);
		}
		
		public static void main(String[] args)
		{
			emp1TestConstr e1 = new emp1TestConstr(100, "abc");
			e1.display();
			
			emp1TestConstr e2= new emp1TestConstr(200, "xyz");
			e2.display();
		}

	}




