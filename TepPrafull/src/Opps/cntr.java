package Opps;

public class cntr {
	
	int e_id;
	String e_name;
	
	int e_id1= 100;
	String e_name1="abc";

	int e_id2;
	String e_name2;
	
	int e_id3;
	String e_name3;
	
	public cntr() {
		// TODO Auto-generated constructor stub
	}
	public cntr(int e_id3, String e_name3) {
		this.e_id3=e_id3;
		this.e_name3=e_name3;
	}
	
	
	void disp()
	{
		System.out.println("Employee id= "+e_id3);
		System.out.println("Emlpoyee name= "+e_name3);
	}
	
	public static void main(String[] args) {
		// 3 ways of initializing Object
		// way 1 by using ref. var.
		cntr e1=new cntr();
		System.out.println(e1.e_id);
		System.out.println(e1.e_name);
		
		cntr e2=new cntr();
		System.out.println(e2.e_id);
		System.out.println(e2.e_name);	// o/p is 0,null,0,null
		
		// 2nd way By using assigning commen values
		cntr a1=new cntr();
		System.out.println(a1.e_id1);
		System.out.println(a1.e_name1);
		
		cntr a2=new cntr();
		System.out.println(a2.e_id1);
		System.out.println(a2.e_name1);	// o/p is 100,abc,100,abc
		
		// 3rd way by using Methods
		cntr b1=new cntr();
		b1.e_id2=200;
		b1.e_name2="ABC";
		
		cntr b2=new cntr();
		b2.e_id2=300;
		b2.e_name2="DEF";
		
		System.out.println(b1.e_id2);
		System.out.println(b1.e_name2);
		System.out.println(b2.e_id2);
		System.out.println(b2.e_name2);	//o/p is 200, DEF
		
		// by using  parameterized constructor
		cntr c1=new cntr(400, "Akshay");
		c1.disp();
		
		cntr c2=new cntr(500, "Sujit");
		c2.disp();	
		/*  o/p is Employee id= 400
			Emlpoyee name= Akshay
			Employee id= 500
			Emlpoyee name= Sujit	*/

	}

}
