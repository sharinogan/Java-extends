class Start {
	public static void main(String[] data) {
		Car c = new Car(); // create instance
		System.out.println( c instanceof Car ); // true
                
                // Given an array of Vehicle, write code fragment to
                // count the number of instance of Car
                Vehicle[] list = { new Car(), new Truck(), new Car() };
                System.out.println(list.length);
	}
}

class Vehicle { }
class Car extends Vehicle { }
class Boat extends Vehicle { }
class Truck extends Vehicle { }
class Scooter { }