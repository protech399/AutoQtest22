package varies;

import java.util.Scanner;

public class varText {

	
	public static void main(String[] args) {
		
		System.out.println("++++++++++++++++++++++++++ if -else/ if-else if- else +++++++++++++++++++++++++++");
		
		int x = -1;
		
		if (x < 0)
		{
			System.out.println("x is negative");
		}
		
		else if ((x > 0))
		{
			System.out.println("x is Positive");
			
		}
		else 
		{
			System.out.println("x is zero");
			
		}		
		
		System.out.println("++++++++++++++++++++++++++ Switch Case +++++++++++++++++++++++++++");
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Day No");
			int day = s.nextInt();
				
			switch (day) 
			{
			  case 1: System.out.println("Monday");
			    break;
			  case 2: System.out.println("Tuesday");
			    break;
			  case 3: System.out.println("Wednesday");
			    break;
			  case 4: System.out.println("Thursday");
			    break;
			  case 5: System.out.println("Friday");
			    break;
			  case 6: System.out.println("Saturday");
			    break;
			  case 7: System.out.println("Sunday");
			    break;
			  //Default case statement  
			  default: System.out.println("Not in Monday to Sunday");  
			}
		}	

	
}
}	