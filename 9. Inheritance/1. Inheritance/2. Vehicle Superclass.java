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
    
    public String toString(){
        return "A " + color + " " + type +".";
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
    
    public String toString(){
        return "A " + make + " " + model +".";
    }
}

public class VehicleTester
{
    public static void main(String[] args)
    {
        Car tesla = new Car("Tesla", "Model 3");
        
        Bike trek = new Bike("White", "Mountain Bike");
        
        System.out.println(tesla);
        System.out.println("Has engine: " + tesla.hasEngine());
        System.out.println("Number of Wheels: " + tesla.getWheels());
        System.out.println();
        
        System.out.println(trek);
        System.out.println("Has engine: " + trek.hasEngine());
        System.out.println("Number of Wheels: " + trek.getWheels());
    }
}