package Oops;

public class Employee {
	
	int e_id;
	String e_name;
	int salary;
	int dep;
	
	void disp() {
		System.out.println(e_id);
		System.out.println(e_name);
		System.out.println(salary);
		System.out.println(dep);
	}
//	
//	public Employee(int e_id1,String e_name1,int salary1,int dep1) 
//	{
//		e_id=e_id1;
//		e_name=e_name1;
//		salary=salary1;
//		dep=dep1;
//	}
		
		void setData(int e_id2,String e_name2,int salary2,int dep2) 
		{
			e_id=e_id2;
			e_name=e_name2;
			salary=salary2;
			dep=dep2;
		}
		
		
	
	public static void main(String[] args) {
		
		//by using object
//		Employee e= new Employee();
//		e.e_id=12;
//		e.e_name="Dhanush";
//		e.salary=50000;
//		e.dep= 1;
//		e.disp();		//op is 12, Dhanush, 50000, 1
	
//		//by using constructor
//		Employee e1=new Employee(13, "Raj", 40000, 2);
//		e1.disp();
		
		
		// by using method
		Employee e2=new Employee();
		e2.setData(3, "Abhi", 68780, 3);
		e2.disp();		//op is 3, Abhi, 68780 ,3

	}

}
