/* In this exercise, we are going to revist our Car and ElectricCar class from lesson 3. 
In lesson 3, you were given the Car class and needed to complete the ElectricCar class. You can use your code from that exercise to get started here.

The focus of this exercise is the CarTester class. In this class, create an ArrayList that can hold Cars and ElectricCars. 
Then, you will prompt the user for a car model. Ask for either the remaining battery percentage or the amount of fuel left, depending on whether the car is electric. 
Add each car to the ArrayList.

You will continue asking the user until they exit, then you will loop through your ArrayList and print the results.

Remember, for a method call to compile, it needs to be defined in the reference type (the Car class in this exercise), 
but the actual method that executes will be based on the instantiated class. In this exercise, we want electric cars to run the Override methods.

Sample Output
Enter your cars' information: 
Model (exit to quit): Leaf
Electric car (y/n): y
Percent of battery left (as a whole number): 57
Model (exit to quit): Tank
Electric car (y/n): n
Gallons of fuel left: 80
Model (exit to quit): exit

Leaf electric car

Tank car */

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

import java.util.*;

public class CarTester
{
    public static void main(String[] args)
    {
        // Start here
        Scanner input = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<Car>();
        
        System.out.println("Enter your cars' information: ");
        
        System.out.print("Model (exit to quit): ");
        String query = input.nextLine();
        
        while (!query.equals("exit")) {
            String model = query;
            
            System.out.print("Electric car (y/n): ");
            String type = input.nextLine();
            
            if (type.equals("y")) {
                
                System.out.print("Percent of battery left (as a whole number): ");
                int batteryLevel = input.nextInt();
                cars.add(new ElectricCar(model, batteryLevel));
            }
            if (type.equals("n")) {
                System.out.print("Gallons of fuel left: ");
                int fuelLevel = input.nextInt();
                cars.add(new Car(model, fuelLevel));
            }
            input.nextLine();
            
            System.out.print("Model (exit to quit): ");
            query = input.nextLine();
        }
        
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}