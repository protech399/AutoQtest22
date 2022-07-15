
public class ifElseIf {
	
	
	public static void main(String[] args) {
		/*60-100 Grade A
		  50-59  Grade B
		  39-49  Grade C
		  Below 39 Fail */
		
		int m=39;
		if (m>=60 && m<=100) {
			System.out.println("A Grade");
		}
		else if (m>=50 && m<=59) {
			System.out.println("B Grade");
		}
		else if (m>=40 && m<=49) {
			System.out.println("C Grade");
		}else {
			System.out.println("Fail");
		}
		
		
}
}
