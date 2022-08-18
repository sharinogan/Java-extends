class Start {

    public static void main(String[] data) {
        int n = 7;
        // Integer w = new Integer(n);  // Deprecated
        
        Integer w = n;   // autoboxing
        int m = w;       // unboxing
        
        Object[] all = { 37.5, 38, 37.2, 37, 36.7,
                         36, 37, 37.2, 38, 37.3, 35.7 };
        
        // Write code to find the summation of integers
        // from the given array
        int result = 0;
        for (int i = 0; i < all.length; i++) {
            if(all[i] instanceof Integer meow) {
                result += meow;            
            }
        }
         System.out.print(" " + result);
        
    }
}

class Vehicle {
    double price;
}

class Car extends Vehicle { }

@Deprecated
class Boat extends Vehicle { }

class Truck extends Vehicle { }

class Scooter { } // super class of Scooter is "Object"
