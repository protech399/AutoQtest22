package Constructor;

public class Main {

	public static void main(String[] args) {
				
		Shirt s1=new Shirt("Black", 'S');
		Shirt.takeoff();	// change access static using 'Shirt'(Decleration Type)
		System.out.println(s1.color);
		System.out.println(s1.size);
		
		Shirt s=new Shirt();
		s.setcolor("white");
		s.setsize('M');
		Shirt.putOn();	// change access static using 'Shirt'(Decleration Type)
		
		System.out.println(s.color);
		System.out.println(s.size);
		
	}
}