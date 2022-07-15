package String;

public class ChangeCaseLetter {

	public static void main(String[] args) {
		// Reverse a string
		
		String x= "My Space Class";
		String y= "";
		for(int i=0; i<x.length(); i++) {
			if(Character.isUpperCase(x.charAt(i))) {
				y=y + Character.toLowerCase(x.charAt(i));
			}else if(Character.isLowerCase(x.charAt(i))) {
				y=y + Character.toUpperCase(x.charAt(i));
			}else {
				y= y + x.charAt(i);			
				}
			} System.out.println(y);

	}

}
