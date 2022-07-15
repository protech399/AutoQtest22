package Opps;

public class Delete {
	int e_id=12;
	String e_name="Rohit";
	
	int e_id1;
	String e_name1;
	
	int e_id2;
	String e_name2;
	
	public Delete() {
		
	}
	
	public Delete(int e_id, String e_name) {
		this.e_id1=e_id;
		this.e_name1=e_name;
	}
	
	void disp() {
		System.out.println(e_id1+e_name1);
	}
	
	public static void main(String[] args) {
		Delete e=new Delete();
		System.out.println(e.e_id+" "+e.e_name);
		
		// by using Method
		Delete e1=new Delete();
		e1.e_id1=1;
		e1.e_name1="Sachin";
		System.out.println(e1.e_id1+" "+e1.e_name1);
		
		// by using Parameterised constructor
		Delete e2=new Delete(05,"Abhi");
		e2.disp();
	}

}
