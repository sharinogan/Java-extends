class Start {

    public static void main(String[] data) {
        // User u = new User();      // Error
        User u = new Monthly();      // OK
        //Monthly m = new User();      // Error
        Monthly m = new Monthly();   // OK
    }
}

abstract class User { }

class Monthly extends User { }

class Vehicle {
    double price;
}

class Car extends Vehicle { }

@Deprecated
class Boat extends Vehicle { }

class Truck extends Vehicle { }

class Scooter { } // super class of Scooter is "Object"
