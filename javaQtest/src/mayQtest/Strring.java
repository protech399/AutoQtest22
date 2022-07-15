package mayQtest;

public class Strring {

	public static void main(String[] args) {
		
		// Sting is a Class/Object/Data type
		
		// String Constant Pool(SCP) & Heap
		// x.length= 14
		//charAt(index)= Returns
		//charAt(0)= M Returns character
		//charisUpperCase(0)= Ture
		//charisLowerCase(1)= Ture
		//charisDigit(0)= Ture
				
		String x="My Space Class";
		System.out.println(x);
		System.out.println(x.length());
		System.out.println(x.charAt(0));
		System.out.println(x.charAt(4));
		System.out.println(Character.isUpperCase('M'));
		System.out.println(Character.isUpperCase('y'));
		System.out.println(Character.isLowerCase('M'));
		System.out.println(Character.isLowerCase('y'));
		System.out.println(Character.isDigit('y'));
		System.out.println(Character.isDigit('0'));
	}

}
