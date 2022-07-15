package Constructor;

public class Shirt {

	public String color;
	public char size;
	
	
	Shirt() {
		// TODO Auto-generated constructor stub
	}
	
	Shirt(String color, char size){
		this.color=color;
		this.size=size;
	}
	
	public static void putOn() {
		System.out.println("shirt on!!!");
	}
	
	public static void takeoff() {
		System.out.println("take off.....");
	}
	
	public void setcolor(String newcolor) {
		color=newcolor;
	}
	
	public void setsize(char newsize) {
		size=newsize;
	}

}