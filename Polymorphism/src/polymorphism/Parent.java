package polymorphism;

class Vehicle{
	void engine()
{
		System.out.println("this is vechile engine");
		}
}

class Bike extends Vehicle{
	void engine() {
		System.out.println("this is bike engine");
	}
}

class Car extends Vehicle{
	void engine() {
		System.out.println("this is car engine");
	}
}

public class Parent{
	public static void main(String[] args) {
		Bike rx = new Bike();
		rx.engine();
		
		Car audi = new Car();
		audi.engine();
	}
}
