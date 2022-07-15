package String;

public class ExtractNoString {

	public static void main(String[] args) {
		// Reverse a string
		
		String x= "My23424354 Space Class 44234";
		String y= "";
		for(int i=0; i<x.length(); i++) {
			if(Character.isDigit(x.charAt(i))) {
			y= y + x.charAt(i);
		}	
		}System.out.println(y);
	}

}
