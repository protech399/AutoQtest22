package Costructor;

public class cOnstructor2 {

		int e_id;
		String e_name;
		
		int e_id1=100;
		String e_name1= "abc";
		
		int e_id3;		
		String e_name3; 
		
		int e_id4;		//this
		String e_name4;	//this
		
		
		
		public cOnstructor2() {
			// TODO Auto-generated constructor stub
		}
		
		cOnstructor2(int e_id4, String e_name4){				//parameterized constructor
			this.e_id4= e_id4;		//this because same value after = e_id4
			this.e_name4=e_name4;	//this because same vale after =e_name4
		}
		
		void display() {
			System.out.println("Employe Nmae"+ e_name4);
			System.out.println("Emlpoyee Id"+e_id4);
		}
		
	public static void main(String[] args) {
		// 3 ways of initializing Object
		// way 1 by using ref. var.
		cOnstructor2 e1= new cOnstructor2();
		System.out.println(e1.e_id);
		System.out.println(e1.e_name);
		
		cOnstructor2 e2=new cOnstructor2();
		System.out.println(e2.e_id);
		System.out.println(e2.e_name);
		// o/p is 0,null,0,null
		
		// 2nd way By using assigning common values
		
		cOnstructor2 c1=new cOnstructor2();
		System.out.println(c1.e_id1);
		System.out.println(c1.e_name1);
		
		cOnstructor2 c2=new cOnstructor2();
		System.out.println(c2.e_id1);
		System.out.println(c2.e_name1);
		// o/p is 100 & abc two times
		
		// 3rd way by using Methods
		cOnstructor2 d1= new cOnstructor2();
		d1.e_id3= 200;
		d1.e_name3="abc3";
		
		cOnstructor2 d2= new cOnstructor2();
		d2.e_id3=300;
		d2.e_name3="abc4";
		
		System.out.println(d1.e_id3);
		System.out.println(d1.e_name3);
		
		// by using  constructor
		
//		cOnstructor2 f1=new cOnstructor2(100, "abcd4");
//		f1.display();
//		
//		cOnstructor2 f2= new cOnstructor2(200,"abc4");
//		f2.display();
//		
	}
	
	

}
