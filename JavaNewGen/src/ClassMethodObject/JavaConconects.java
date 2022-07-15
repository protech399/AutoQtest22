package ClassMethodObject;
/*class is blueprint which contains variables methods & Object  
 * access modifier-
 * public- any one can use
 * Default- within package only
 * private- within class only
 * protected- different package subclass is not allowed
 * 
 * Return void, Data type & Object
 * 
 * 
 * */
public class JavaConconects {

	
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		JavaConconects j=new JavaConconects();
		int c=j.add(a, b);
		j.sub(c, 50);
		
	}

	public int  add(int a, int b) {
		int c= a+b;
		System.out.println(c);
		return c;
	}
	
	public void sub(int a, int b) {
		int c=b-a;
		System.out.println(c);
	}
}
