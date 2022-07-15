package mayQtest;
/*	primitive= int, char, double, float, boolean, 
 * non primitive = String, Array, Classes, Interface
 * */
public class dataTypes {

	public static void main(String[] args) {
	byte a=127;		//1 byte
	short b=456;		//2 byte
	int c=2147483647;	// 4 byte
	long d=92233720388l;	// 8 byte
	
	System.out.println("----------Implicite casting(widening)--------------");
	
	short s=a;
	System.out.println(s);
	
	long l=c;
	System.out.println(l);
	
	System.out.println("----------Explicite casting(narrowing)--------------");
	
	double db=5.46;			// 8 byte
	
	int i= (int) db;		//4 byte
	System.out.println(i);
	
	long ln=(long)db;
	System.err.println(ln);
	
	System.out.println("----------Other data type--------------");
	
	char ch='a';			// 2 byte
	System.out.println(ch);
	
	char ch1=60;			// 60 is ASCII value for '<'
	System.out.println(ch1);
	
	char ch2='<';
	System.out.println(ch2);
	
	boolean b1=false;		//1bit
	System.out.println(b1);
	
	float f1= 9.45f; // 4 byte & always ends with f
	
	System.out.println(f1);
	System.out.println(b);
	System.out.println(d);
	
	
	}
}
