/* Implement the class Distance.

This class has one instance variable, a double called kilometers. The class has methods that convert the kilometers into different units.

It should have the following methods

A constructor taking one parameter - initializes kilometers to the parameter value
toMiles - converts kilometers to miles, then returns the value. To convert to miles, divide kilometers by 1.609
toLeagues - converts kilometers to leagues, then returns the value. To convert to leagues, divide kilometers by 5.556.
doubleMiles - converts kilometers to miles, then returns double that value. Use toMiles to do the conversion.
getKilometers - returns the value of kilometers
Note that the only method that should modify the value of kilometers is the constructor.

Main Method
To test your class, create three Distance objects in main. Convert one distance to miles, one to leagues, and one to doubled miles. Print out the kilometer value and the converted value.

Here is an example of what your output could look like:

5.0 km = 3.107520198881293 miles
20.0 km = 3.599712023038157 leagues
10.0 km (one way) = 12.430080795525171 miles (round trip) */

public class Distance
{
    private double kilometers;
    
    public Distance(double km) {
        kilometers = km;
    }
    
    public double toMiles() {
        return kilometers / 1.609;
    }
    
    public double toLeagues() {
        return kilometers / 5.556;
    }
    
    public double doubleMiles() {
        return 2 * toMiles();
    }
    
    public double getKilometers() {
        return kilometers;
    }
}

public class DistanceTester
{
    public static void main(String[] args)   
    {
        // Create three Distance objects
        Distance d1 = new Distance(5);
        Distance d2 = new Distance(20);
        Distance d3 = new Distance(10);
        
        // Convert one to miles, one to leagues and
        // double one mileage
        double miles = d1.toMiles();
        double leagues = d2.toLeagues();
        double round = d3.doubleMiles();
        
        // Print out the converted values
        // Use the getter!
        System.out.println(d1.getKilometers() + " km = " + miles + " miles");
        System.out.println(d2.getKilometers() + " km = " + leagues + " leagues");
        System.out.println(d3.getKilometers() + " km (one way) = " + round + " miles (round trip)");
    }
}