public class Vehicle
{
    private String name;
    private boolean engine;
    private int wheels;
    
    public Vehicle(String name, boolean engine, int wheels)
    {
        this.name = name;
        this.engine = engine;
        this.wheels = wheels;
    }
    
    public String getName()
    {
        return name;
    }
    
    public boolean hasEngine()
    {
        return engine;
    }
    
    public int getWheels()
    {
        return wheels;
    }
}

public class Bike extends Vehicle
{
    private String color;
    private String type;
    
    public Bike(String color, String type)
    {
        super("Bicycle", false, 2);
        this.color = color;
        this.type = type;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public String getType()
    {
        return type;
    }
    
    // Override the getName method
    @Override
    public String getName()
    {
        return color + " " + type;   
    }
    
    public String toString(){
        return "A " + this.getName() +".";
    }
}

public class Car extends Vehicle
{
    private String make;
    private String model;
    
    public Car(String make, String model)
    {
        super("Car", true, 4);
        this.make = make;
        this.model = model;
    }
    
    public String getMake()
    {
        return make;
    }
    
    public String getModel()
    {
        return model;
    }
    
    // Override the getName method
    @Override
    public String getName()
    {
        return make + " " + model;   
    }
    
    public String toString(){
        return "A " + this.getName() +".";
    }
}

public class VehicleTester
{
    public static void main(String[] args)
    {
        // Create 3 Vehicle objects
        Vehicle tesla = new Car("Tesla", "Model 3");
        Vehicle trek = new Bike("White", "Mountain Bike");
        Vehicle boat = new Vehicle("Boat", true, 0);
        
        // Add to a Vehicle array
        Vehicle[] transportation = new Vehicle[3];
        transportation[0] = tesla;
        transportation[1] = trek;
        transportation[2] = boat;
        
        // Call the getName method for each
        // This will compile since getName is in the Vehicle class
        // Each object will use it's own method.
        for (int i = 0; i < transportation.length; i++){
           System.out.println("Name: " + transportation[i].getName()); 
        }
    }
}