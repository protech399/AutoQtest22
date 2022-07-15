package Costructor;

public class cOnstructor3 {
	int id;
	String name;
	
	cOnstructor3 (int id1, String name1){
		id=id1;
		name=name1;
		System.out.println("Emp Name- "+name);
		System.out.println("Emp Id- "+id);
	}
	
	public static void main(String[] args) {
		cOnstructor3 e1= new cOnstructor3(100,"abc");
		
	//	cOnstructor3 e2= new cOnstructor3(200,"sagar");
		
		System.out.println(e1);
	//	System.out.println(e2);
	
	}

}
