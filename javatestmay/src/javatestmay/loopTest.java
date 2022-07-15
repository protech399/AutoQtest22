package javatestmay;

public class loopTest 
{

	public static void main(String[] args)
	
	{
//		int a ;
//		
//		for(a = 1; a <= 5; a++)
//		{
//			System.out.println(a);
//		}
//			
//		
//		System.out.println("outside for loop");
		
		for(int i = 1; i<= 5; i++)						//3
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	
}

/*
1
2
3
4

5*/