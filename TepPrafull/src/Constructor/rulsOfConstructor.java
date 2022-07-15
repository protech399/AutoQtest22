package Constructor;

public class rulsOfConstructor {

	rulsOfConstructor() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
	/*constructor is a special method to call an object
	 * Name of constructor & class must be Same
	 * return type of constructor is not applicable even void also it will executed automatically
	 * if we calling return type must needed
	 * the only modifier is allowed to constructors are 
	 * public- anywhere can create object,
	 *  <Default> -create an object only within the same package,
	 *   protected-create an object within same package & outside package only in chield classes,
	 *    private-create an class within the class only,
	 *    
	 *  	*/

		
		rulsOfConstructor t1=new rulsOfConstructor();
			t1.getClass();
		
		rulsOfConstructor t2= new rulsOfConstructor();
			t2.getClass();
	}

}
