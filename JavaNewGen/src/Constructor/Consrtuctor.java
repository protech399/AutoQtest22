package Constructor;
/* method name should me same as class name
 * constructor does't return anything
 * its get automatically executed
 * default & parameterized constructor
 * constructor chaining- calling one constructor to another to form a chain  
 * */
public class Consrtuctor {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		B b1=new B(3, 4);

	
//		C1 c1=new C1(1, 3);
		
//		D1 d1=new D1(5, 7);
	}
}

class B{
	B(int a, int b){
		int c= a+b;
		System.out.println(c);
		C1 c1=new C1(1, 3); // constructor chaining
	}
}

class C1{
	C1(int a, int b){
		int c= a+b;
		System.out.println(c);
		D1 d1=new D1(5, 7); // constructor chaining
	}
}

class D1{
	D1(int a, int b){
		int c= a+b;
		System.out.println(c);
	}
}