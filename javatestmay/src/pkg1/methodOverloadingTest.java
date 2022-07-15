package pkg1;

public class methodOverloadingTest 
{
		void test(int a, String b, char c)								//1
		{
			System.out.println("Python");
		
		}
		
		void test(String b, int a, char c)										//2
		{
			System.out.println("Java");
		
		}
		
		public static void main(String[] args) 
		{
			methodOverloadingTest r1 = new methodOverloadingTest();
			r1.test(2, "abc", 'c');
			
			r1.test("pqr", 56, '%');
			
			System.out.println("End of Main");
		}
}
