package variables;
/*	
	int x=10; // primitive variables
	Student ref= new Student(); //ref.  Reference variables to ref objects

position of variables - Instance, Static & Local
	(position of Declaration & Behaviour) 
	instance- value of variable various from OBJ to OBJ
	Local- within a block, within constructor, within method
	Static- 
	
*
*/
public class variables {
	int  e=100;	 
	int  a=10;	// instance coz of in class & outside of method
	// will created at time of OBJ creation & distraction hence scope of instance variable is exactly same as scope of OBJ
	// instance stored at heap memory as part of OBJ coz of OBJ stored in Heap
	
	
	void m1() {
		int b=30;	// Local coz in method
		System.out.println(b);
	}
	
	public variables() {
		int c=40;		// Local coz of in constructor
		System.out.println(c);
	}
	
	{
		int d=50;	// local coz of in bolck
		System.out.println(d);  // execute 1st before main method
	}
	
	public static void main(String[] args) {
		
		variables t=new variables();
		System.out.println(t.a); // calling a in main
		t.m2();
	}
	
	public  void m2() {
		System.out.println(e);	// e is Instance variable
	}
	
}
