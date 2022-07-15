package Abstaction;

public class Abstract_1 extends Abstract {
	
	void start() {
		System.out.println("STart with Kick");
		}
		
		void seat() {
			System.out.println("seat=2");
		}
		
	public static void main(String[] args) {
		Abstract_1 bike= new Abstract_1();
		bike.start();
		bike.seat();
		
	}
	
}
