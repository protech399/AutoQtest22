package string;

public class string {

	public static void main(String[] args) {
		String s="Welcome ";
		
		System.out.println(s.length());	//nub of char is 7
		
		//concatenation
		String s1="to ";
		String s2="Training";
		
		System.out.println(s+s1+s2);	//Welcome to Training
		
		System.out.println(s1.concat(s));	//to Welcome 
		
		//Equals
		String s3= "wELCOME";
		String s4= "welcome";
		
		System.out.println(s3.equals(s4));	//false
		
		
	}

}
