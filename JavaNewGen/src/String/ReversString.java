package String;

public class ReversString {

	public static void main(String[] args) {
		// Reverse a string
		
		String x= "My Space Class";
		String y= "";
		for(int i=x.length()-1; i>=0; i--) {
			y= y + x.charAt(i);
					
		}System.out.println(y);

	}

}
