package Oops;

public class test {
	
	int e_id;
	String e_name;
	int salary;
	int dept_no;
	
	void display() {
		System.out.print("id="+e_id+", ");
		System.out.print("name="+e_name+", ");
		System.out.print("salary="+salary+ ", ");
		System.out.print("Dept_name="+dept_no+", ");
	}
	
	public static void main(String[] args) {
		test emp1= new test();	//1st object
		emp1.e_id=10;
		emp1.e_name="Raj";
		emp1.salary=20000;
		emp1.dept_no=2;
		emp1.display();
		
		System.out.println();
		
		//2nd object
		emp1.e_id=11;
		emp1.e_name="Sujit";
		emp1.salary=50000;
		emp1.dept_no=4;
		emp1.display();
		
		
	}
}
