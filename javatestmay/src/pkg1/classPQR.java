package pkg1;

public class classPQR extends classABC
{
	void print(int a, String b)
	{
		System.out.println("Lenovo");
	}
	
	public static void main(String[] args) 
	{
		classABC a = new classABC();			
		a.print(23, "abc");
		
		classPQR p = new classPQR();
		p.print(89, "abc1");
	}
}
