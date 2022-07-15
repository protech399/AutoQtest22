package Opps;

public class test2 {
	int e_id;
	String e_name;
	int salary;
	int dept_no;
	
	void setdata(int id, String name, int salary, int dep_no) {
		e_id=id;
		e_name=name;
		this.salary=salary;
		dept_no=dep_no;
	}
	void disp() {
		System.out.print("id="+e_id+", ");
		System.out.print("name="+e_name+", ");
		System.out.print("salary="+salary+", ");
		System.out.print("Dept_name="+dept_no+", ");
	}
	
	public static void main(String[] args) {
		// assigning values class variables using methods
		test2 e1= new test2();
		e1.setdata(10, "akshay", 38000, 2);
		e1.disp();

	}

}
