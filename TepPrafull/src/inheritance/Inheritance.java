package inheritance;
// acquiring methods & variables from parent class to child class is called as inheritance 
// multiple inheritance not possible with extends key word
// multiple inheritance possible by interface...(Diamond ambiguity problem)
// one parent class & 2 child class hierarchy inheritance
// combine multiple & hierarchy called hybrid inheritance


//multilevel inheritance
class A{
	int a;
	int b;
	public void Disp() {
		System.out.println(a+b);
	}
}

class B extends A {
	int x;
	int y;
	public void show() {
		System.out.println(x+y);
	}
}		

class C extends B {
	int p;
	int q;
	public void addition() {
		System.out.println(p+q);
	}
}



public class Inheritance {

	public static void main(String[] args) {
//		A aobj =new A();
//		aobj.a=100;
//		aobj.b=200;
//		aobj.Disp();
		
		B bobj = new B();
		bobj.x=10;
		bobj.y=20;
		bobj.show();
		
		bobj.a=150;
		bobj.b=250;
		bobj.Disp();
		
		C cobj = new C();
		cobj.a=5;
		cobj.b=5;
		cobj.x=15;
		cobj.y=15;
		cobj.p=20;
		cobj.q=20;
		
		cobj.Disp();
		cobj.show();
		cobj.addition();
	}

}
