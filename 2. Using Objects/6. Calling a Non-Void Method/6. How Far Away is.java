/* In this exercise you will write a program to compute the distance between any two geo locations.

In this program you will ask the user for four numbers.

starting latitude
starting longitude
ending latitude
ending longitude
Then, using the GeoLocation class, compute the distance in miles between the two locations.

A sample program run should match exactly as below:

Enter the latitude of the starting location: 48.8567
Enter the longitude of the starting location: 2.3508
Enter the latitude of the ending location: 51.5072
Enter the longitude of the ending location: 0.1275
The distance is 208.08639358288565 miles. */

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

    private double latitude;
    private double longitude;

    /**
     * Constructs a geo location object with given latitude and longitude
     */
    public GeoLocation(double theLatitude, double theLongitude) 
    {
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

    // returns a string representation of this geo location
    public String toString() 
    {
        return "latitude: " + latitude + ", longitude: " + longitude;
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

import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        // your code here.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the latitude of the starting location: ");
        double x1 = input.nextDouble();

        System.out.print("Enter the longitude of the starting location: ");
        double y1 = input.nextDouble();

        System.out.print("Enter the latitude of the ending location: ");
        double x2 = input.nextDouble();

        System.out.print("Enter the longitude of the ending location: ");
        double y2 = input.nextDouble();

        GeoLocation g1 = new GeoLocation(x1, y1);
        GeoLocation g2 = new GeoLocation(x2, y2);
        
        double distance = g1.distanceFrom(g2);
        
        System.out.print("The distance is " + distance + " miles.");
    }
}