/* With the addition of electric cars, we have a need to create a subclass of our Car class. 
In this exercise, we are going to create the Electric Car subclass so that we can override a few methods to update them to work for ElectricCars.

The Car class has a field called fuelLevel. It represents the number of gallons left in the tank of a regular car. 
We’re going to reinterpret it to mean the battery percentage left in an Electric Car. 
Since it’s an int, to use fuelLevel in the ElectricCar, you’ll first need to convert it to a percentage by dividing by 100.

The Car class is complete, but you need to complete the ElectricCar class as outlined in the starter code with comments.

Once complete, use the CarTester to create both a Car and ElectricCar object and test these per the instructions in the CarTester class. */

public class Car {
    
    // This code is complete
    private String model;
    private int fuelLevel;
    
    public Car(String model, int fuelLeft){
        this.model = model;
        this.fuelLevel = fuelLeft;
    }
    
    public String getModel(){
        return model;
    }
    
    public double getFuelLevel(){
        return fuelLevel;
    }
    
    // Returns how many more miles the car can go
    // with the fuel left
    public double milesLeft(double mpg){
        return fuelLevel * mpg;
    }
    
    public String toString(){
        return model + " car";
    }
}

public class ElectricCar extends Car {

    // Complete the constructor
    // Note we're reinterpreting "fuelLevel" as "batteryLevel"
    public ElectricCar(String model, int batteryLevel){
       super(model, batteryLevel);
    }

    // Override getFuelLevel
    // Reinterprets fuelLevel() as a percentage
    // Remember super.getFuelLevel will return fuelLevel!
    @Override
    public double getFuelLevel(){
        return super.getFuelLevel() / 100;
    }

    // Override milesLeft
    // Takes one parameter - the total number of miles an ElectricCar
    // gets on a full charge.
    // Computes miles left by interpreting fuelLevel as the
    // battery percentage left in the car
    @Override
    public double milesLeft(double mpg){
        return getFuelLevel() * mpg;
    }
    
    // Override toString
    // Should print: model electric car
    @Override
    public String toString() {
        return super.getModel() + " electric car";
    }
}

public class CarTester
{
    public static void main(String[] args)
    {
        // Create a Car object
        Car c1 = new Car("Ford", 100);
        // Print out the model
        System.out.println(c1.getModel());
        // Print out the fuelLevel
        System.out.println(c1.getFuelLevel());
        // Print how many miles are left with 23 mpg
        System.out.println(c1.milesLeft(23));
        // Print the object
        System.out.println(c1);
        // Create an ElectricCar object
        Car c2 = new ElectricCar("Tesla", 1000);
        // Print out the model
        System.out.println(c2.getModel());
        // Print out the fuelLevel
        System.out.println(c2.getFuelLevel());
        // Print how many miles are left with 400 miles per charge
        System.out.println(c2.milesLeft(400));
        // Print the object
        System.out.println(c2);
    }
}