package Opps;

public class Constructor {
	int e_id;
	String e_name;
	int dep_id;
	Character dep_name;
	
	public Constructor(int id, String name,int did, Character dname ) {
		e_id=id;
		e_name=name;
		dep_id=did;
		dep_name=dname;
	}
	
	public Constructor(int no, String disc, int dep_no ) {
		e_id=no;
		e_name=disc;
		dep_id=dep_no;
	}
	
	
	void disp() {
		System.out.println(e_id+" "+e_name+" "+dep_id+" "+dep_name);
	}
	
	public static void main(String[] args) {
		Constructor e_details=new Constructor(1, "Sagar", 12, 'P');
		e_details.disp();
		
		Constructor e_desc=new Constructor(12, "Abhi", 33);
		e_desc.disp();
	}

}
