class Start {
	public static void main(String[] data) {
		Car c = new Car(); // create instance
		System.out.println( c instanceof Car ); // true
                
                // Given an array of Vehicle, write code fragment to
                // count the number of instance of Car
                Vehicle[] list = { new Car(), new Truck(), new Car(), new Car(),
                                    new Truck(), new Car(), new Car(), new Car()};
                int count = 0;
                for (int i = 0; i < list.length; i++) {
                    // System.out.println(list[i] instanceof Car);
                    if(list[i] instanceof Car) {
                        count++;
                    }
                }
                System.out.println(count);
	}
}

class Vehicle {
    double price;
}
class Car extends Vehicle { }
class Boat extends Vehicle { }
class Truck extends Vehicle { }
class Scooter { }