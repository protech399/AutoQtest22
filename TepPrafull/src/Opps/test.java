package Opps;

public class test {
	
	int e_id;
	String e_name;
	int salary;
	int dept_no;
	
	void display() {
		System.out.println("id "+e_id);
		System.out.println("name "+e_name);
		System.out.println("salary "+salary);
		System.out.println("Dept_name "+dept_no);
	}
	
	public static void main(String[] args) {
		test emp1= new test();	//1st object
		emp1.e_id=10;
		emp1.e_name="Raj";
		emp1.salary=20000;
		emp1.dept_no=2;
		emp1.display();
		
		
		test emp2= new test();	//2nd object
		emp2.e_id=11;
		emp2.e_name="Sujit";
		emp2.salary=50000;
		emp2.dept_no=4;
		emp2.display();
		
		
	
	}
}
