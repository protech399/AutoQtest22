package Abstaction;

public class Abstraction_ extends Abstract {
	
	void start() {
	System.out.println("STart with Key");
	}
	
	void seat() {
		System.out.println("seat=5");
	}
	
	public static void main(String[] args) {
		Abstraction_ car= new  Abstraction_();
		car.start();
		car.seat();
	}
	
	
	
}
