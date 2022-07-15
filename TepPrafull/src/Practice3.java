//import java.util.Iterator;

public class Practice3 {

	public static void main(String[] args) {
		// Reverse a string
		
		String x="My Class is 110";
		String y="";
		for (int i = 0; i < x.length(); i++) {
			if (Character.isDigit(x.charAt(i))) {
				y= y+ x.charAt(i);
			}
			
		}System.out.println(y);
	}
		

}
