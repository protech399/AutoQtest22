package String;


public class Strring {

	public static void main(String[] args) {
		
		// Sting is a Class/Object/Data type
		
		// String Constant Pool(SCP) & Heap
		// x.length= 14
		//x.charAt(index)= Returns "character"
		//x.charAt(0)= M Returns character
		//Character.isUpperCase(0)= Ture
		//Character.isLowerCase(1)= Ture
		//Character.toUpperCase(M)= m
		//Character.toLowerCase(y)= Y
		//Character.isDigit(0)= Ture
				
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
		System.out.println(Character.toUpperCase('m'));
		System.out.println(Character.toLowerCase('Y'));
	}

}
