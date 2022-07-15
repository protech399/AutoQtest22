package Opps;

public class test1 {
	int e_id;
	String e_name;
	int salary;
	int dept_no;	
	//below is constructor
	test1(int id, String name, int salary, int dep_no){
		e_id=id;
		e_name=name;
		this.salary=salary;
		dept_no=dep_no;
	}
	
	void display(){
		System.out.print("id="+e_id+", ");
		System.out.print("name="+e_name+", ");
		System.out.print("salary="+salary+", ");
		System.out.print("Dept_name="+dept_no+", ");
	}
	
	public static void main(String[] args) {
		// constructor is kind of method 
		// assigning values to class variables using constructor
		test1 e1=new test1(1, "Raj", 20000, 2); 
		e1.display();
		
		test1 e2= new test1(12, "Sujit", 50000, 4);
		e2.display();
	}

}
