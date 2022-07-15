package inheritance;
// method overriding is Redefine method in parent class & child class
// is possible in all classes...
// overloading						Vs	overriding
// no inheritance req.					at least we should have two class
// definition should not be same		definition should be same but body can be changed


// hierarchy  inheritance with overriding 
class Bank
{
	int getROI()
	{
		return 0;
	}
}

class SBI extends Bank	
{
	int getROI()		// overridden
	{
		return 10;
	}
}
class ICICI extends Bank 
{
	int getROI()		// overridden
	{
		return 15;
	}
}
class AXIS extends Bank
{
	int getROI()		// overridden
	{
		return 12;
	}
}



public class methodOveriding {

		
	public static void main(String[] args) {
		Bank obj=new Bank();
		System.out.println(obj.getROI());	// 0
		
		SBI sobj=new SBI();
		System.out.println(sobj.getROI()); //10

		ICICI iobj=new ICICI();
		System.out.println(iobj.getROI());	//15
		
		AXIS aobj=new AXIS();
		System.out.println(aobj.getROI());	//12
	} 

}
