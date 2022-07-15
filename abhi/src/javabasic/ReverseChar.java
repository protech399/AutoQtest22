package javabasic;

public class ReverseChar {

	public static void main(String[] args) {
	String p="Abhinandan";
	String q="";
	for(int i=p.length()-1;i>=0;i--) {
		q=q+p.charAt(i);
		
	}
	System.out.println(q);

	}

}
