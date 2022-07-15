package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class collectonSet {
	
	public static void main(String[] args) {
		//Types Set : Same types of Data type or OBJ
		ArrayList<String> name=new ArrayList<String>();
		name.add("Abhi");
		name.add("Sujit");
		name.add("Dhanush");
		name.add("Akshay");
		name.add("Abhya");
		name.add("Rohit");
		name.add(0,"Prafull");
		Collections.sort(name);
		name.size();
		
		System.out.println(name);
		System.out.println(name.size());
		
		// Un type safe: diff types of data type or OBJ
		
		LinkedList<Object> l1 = new LinkedList<Object>();
		l1.add(1);
		l1.add("l2");
		l1.add('$');
		
		System.out.println(l1);
		
		// for each loop
		for(Object x: l1) {
			System.out.print(x+" ");
		}
	}

}
