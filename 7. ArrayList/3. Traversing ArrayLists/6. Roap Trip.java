/* In this problem, we are going to use ArrayLists and classes to design a road trip.

You have three classes: GeoLocation.java which represents a geo location. 
A RoadTrip.java class, which represents a road trip (or an ordered list of places), and a RoadTripTester.java class which brings them all together.

In GeoLocation.java:

Add a private instance variable called name which is a String. This represents the name of the location.

Modify the Geolocation class constructor so that it is now of the format

public GeoLocation(String name, double theLatitude, double theLongitude) 
Add a getter method for name called getName().

Update the toString so that it returns a String of the format

San Francisco (37.7833, -122.4167)
Now, you’ll also need to create a RoadTrip class. 
RoadTrip stores an ordered list of locations, so you’ll need to have an ArrayList as an instance variable. 
The RoadTrip class constructor should initialize an ArrayList that stores a list of GeoLocations.

You’ll also need to support these methods.

// Create a GeoLocation and add it to the road trip
public void addStop(String name, double latitude, double longitude)

// Get the total number of stops in the trip
public int getNumberOfStops()

// Get the total miles of the trip
public double getTripLength()

// Return a formatted toString of the trip
public String toString()
We’ve given you a tester program to help get you started.

The output from that program would be:

1. San Francisco (37.7833, -122.4167)
2. Los Angeles (34.052235, -118.243683)
3. Las Vegas (36.114647, -115.172813)

Stops: 3
Total Miles: 572.9708850442705 */

/*
 * This class stores information about a location on Earth.  Locations are
 * specified using latitude and longitude.  The class includes a method for
 * computing the distance between two locations.
 *
 * This implementation is based off of the example from Stuart Reges at 
 * the University of Washington.
 */

public class GeoLocation 
{
    // Earth radius in miles
    public static final double RADIUS = 3963.1676;  
    
    private String name;
    private double latitude;
    private double longitude;

    /**
     * Constructs a geo location object with given latitude and longitude
     */
    public GeoLocation(String theName, double theLatitude, double theLongitude) 
    {
        name = theName;
        latitude = theLatitude;
        longitude = theLongitude;
    }

    /**
     * Returns the latitude of this geo location
     */
    public double getLatitude() 
    {
        return latitude;
    }

    /**
     * returns the longitude of this geo location
     */
    public double getLongitude() 
    {
        return longitude;
    }
    
    public String getName() 
    {
        return name;
    }

    // returns a string representation of this geo location
    public String toString() 
    {
        return name + " (" + latitude + ", " + longitude + ")";
    }

    // returns the distance in miles between this geo location and the given
    // other geo location
    public double distanceFrom(GeoLocation other) 
    {
        double lat1 = Math.toRadians(latitude);
        double long1 = Math.toRadians(longitude);
        double lat2 = Math.toRadians(other.latitude);
        double long2 = Math.toRadians(other.longitude);
        // apply the spherical law of cosines with a triangle composed of the
        // two locations and the north pole
        double theCos = Math.sin(lat1) * Math.sin(lat2) +
            Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
        double arcLength = Math.acos(theCos);
        return arcLength * RADIUS;
    }
}

import java.util.ArrayList;

public class RoadTrip
{
    // Create a GeoLocation and add it to the road trip
    public ArrayList<GeoLocation> trip = new ArrayList<GeoLocation>();
    
    public void addStop(String name, double latitude, double longitude)
    {
        GeoLocation geo = new GeoLocation(name, latitude, longitude);
        trip.add(geo);
    }
    
    // Get the total number of stops in the trip
    public int getNumberOfStops()
    {
        return trip.size();
    }
    
    // Get the total miles of the trip
    public double getTripLength()
    {
        double tot = 0;
        for (int i = 0; i < trip.size() - 1; ++i) {
            tot += trip.get(i).distanceFrom(trip.get(i + 1));
        }
        return tot;
    }
    
    // Return a formatted toString of the trip
    public String toString() {
        String s = "";
        for (int i = 0; i < trip.size(); ++i) {
            s += Integer.toString(i + 1) + ". " + trip.get(i) + "\n";
        }
        return s;
    }
}

public class RoadTripTester
{
    public static void main(String[] args)
    {
        RoadTrip rt = new RoadTrip();
        rt.addStop("San Francisco", 37.7833, -122.4167);
        rt.addStop("Los Angeles", 34.052235, -118.243683);
        rt.addStop("Las Vegas", 36.114647, -115.172813);

        
        System.out.println(rt);
        
        System.out.println("Stops: " + rt.getNumberOfStops());
        System.out.println("Total Miles: " + rt.getTripLength());
    }
}