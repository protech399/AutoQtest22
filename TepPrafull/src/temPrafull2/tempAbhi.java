package temPrafull2;



public class tempAbhi {
	int e_id;		// value is 0
	String e_name;	// value is null
	
	int e_id1=100;	// assigned common values
	String e_name1= "abc";
	
	int e_id3;		
	String e_name3;
	
	//parameterized constructor
	int e_id4;
	String e_name5;
	
	public tempAbhi() {
		
	}
	
	public tempAbhi(int e_id4, String e_name4) {
		this.e_id4=e_id4;
		e_name5 = e_name4;
		
	}
	
	void disp() {
		System.out.println("Employee id= "+ e_id4);
		System.out.println("Employee name= "+e_name5);
	}

	public static void main(String[] args) {
		// by using ref var.
		tempAbhi e1=new tempAbhi();
		System.out.println(e1.e_id +" "+ e1.e_name);
		// op is 0 null
		
		// by using common values
		tempAbhi e2=new tempAbhi();
		System.out.println(e2.e_id1+" "+e2.e_name1);
		// op is 100 abc
		
		// by using method
		tempAbhi e3=new tempAbhi();
		e3.e_id3= 300;
		e3.e_name3= "Nitin";
		System.out.println(e3.e_id3+" "+e3.e_name3);
		//op is 300 Nitin
		
		// by using parameterized constructor
		tempAbhi e4=new tempAbhi(400, "Frady");
		e4.disp();
		//op is Employee id= 400
		//		Employee name= Frady
		
		
	}
	

}
