/* You are going to create a Car class to simulate how far a car can drive on a road trip. To do this, you will need to complete both the Car and the CarTester classes.

For the Car class, you will use the following variables and methods:

Instance Variables:

private double efficiency // this is miles per gallon
private double gas
private double tankCapacity
private double totalMilesDriven
Constructor:

public Car(double carEfficiency, double carTankCapacity)
Methods:

* public void addGas()- this method should fill the car with gas up to the tank capacity. The method should print `Filling up ...`

* public void addGas(double amount) - This should add amount to the tank. If the amount is greater than the capacity, set the gas to the tank capacity. The method should print `Adding gas ...`

* public double getTotalMilesDriven() - returns the number of miles the car has driven

* public void drive(double distance) - checks if car can drive that number of miles, and then adds miles to totalMilesDriven and subtracts the amount of gas needed to go those miles. The method should print `Driving [distance]` or, if the distance is too far, it should print `Can't drive [distance]. That's too far!`

* public boolean canDrive (double distance) - returns true if the car has enough gas to travel the specified distance

* public double milesAvailable() - returns how many more miles the car could drive

* public double getGas() - returns the amount of gas left
In creating both the Car and CarTester, be sure to check the sample output to guide your design considerations. You will need to have a conditional statement in the drive method to determine if you can drive the correct distance.

Also, make sure you check that you don’t over fill the gas tank!

Sample Output:
Filling up ...
Miles available: 300.0
Driving 100.0
Miles available: 200.0
Adding gas ...
Miles available: 240.0
Can't drive 1000.0. That's too far!
Driving 200.0
Gas remaining: 2.0
Total Miles Driven: 300.0 */

public class Car {

    // Start here
    private double efficiency;
    private double gas;
    private double tankCapacity;
    private double totalMilesDriven;
    
    public Car(double carEfficiency, double carTankCapacity) {
        efficiency = carEfficiency;
        tankCapacity = carTankCapacity;
    }
    
    public void addGas() {
        System.out.println("Filling up ...");
        gas = tankCapacity;
    }
    
    public void addGas(double amount) {
        System.out.println("Adding gas ...");
        gas += amount;
        
        if (gas > tankCapacity) {
            gas = tankCapacity;
        }
    }
    
    public double getTotalMilesDriven() {
        return totalMilesDriven;
    }
    
    public void drive(double distance) {
        if (gas * efficiency >= distance) {
            totalMilesDriven += distance;
            gas -= distance / efficiency;
            System.out.println("Driving " + distance);
        }
        else {
            System.out.println("Can't drive " + distance + ". That's too far!");
        }
    }
    
    public boolean canDrive(double distance) {
        return gas * efficiency >= distance;
    }
    
    public double milesAvailable() {
        return gas * efficiency;
    }
    
    public double getGas() {
        return gas;
    }
}

public class CarTester {

    public static void main(String[] args) {
        //Create a car that gets 20 mpg and has a 15 gallon tank
        Car car = new Car(20, 15);
        
        //Fill up the gas tank
        car.addGas();
        
        //Check the miles available
        System.out.println("Miles available: " + car.milesAvailable());

        //Drive 100 miles
        car.drive(100);

        //Check the miles available
        System.out.println("Miles available: " + car.milesAvailable());
        
        //Add 2 gallons to the gas tank
        car.addGas(2);

        //Check the miles available
        System.out.println("Miles available: " + car.milesAvailable());
        
        //Try driving more miles than available by driving 1000 miles
        car.drive(1000);

        //Drive 200 miles
        car.drive(200);

        //Check how much gas you have left
        System.out.println("Gas remaining: " + car.getGas());

        //Print total miles driven
        System.out.println("Total Miles Driven: " + car.getTotalMilesDriven());
    }
}