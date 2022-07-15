import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Insert Date");
			int i = s.nextInt();
			

			if (i<0) {
			System.out.println("i is possitive");
			}else if((i>0)) {
			System.out.println("i is positive");
			}else {
			System.out.println("i is zero");
			}		

/*			Scanner s = new Scanner(System.in);
			System.out.println("Insert Date");
			int i = s.nextInt();	*/
			

			switch (i) {

				case 1: System.out.println("Monday");
				break;
				case 2: System.out.println("Tuseday");
				break;
				case 3: System.out.println("Wednesday");
				break;
				case 4: System.out.println("Thursday");
				break;
				case 5: System.out.println("Friday");
				break;
				case 6: System.out.println("Saturady");
				break;
				case 7: System.out.println("Sunday");
				break;
				default: System.out.println("not in week");
			}
		}
	
	
	
	
	
	
	}
	
}