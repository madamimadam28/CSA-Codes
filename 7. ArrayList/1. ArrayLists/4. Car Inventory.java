/* A car company wants to keep a list of all the cars that they have in stock. The company has created a ClassicCar class that stores important information about each of their cars.

Initialize an ArrayList called garage that stores each ClassicCar that the company has in stock. */

public class ClassicCar
{
    String name;
    String model;
    int cost;
    
    public ClassicCar(String name, String model, int cost)
    {
        this.name = name;
        this.model = model;
        this.cost = cost;
    }
}

import java.util.ArrayList;
public class CarTracker
{
    public static void main(String[] args)
    {
        //Initialize your ArrayList here:
        ArrayList<ClassicCar> garage = new ArrayList<ClassicCar>();
    }
}