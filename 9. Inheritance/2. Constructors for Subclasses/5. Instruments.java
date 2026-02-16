/* In this exercise, you are going to build a hierarchy to create instrument objects. 
We are going to create part of the orchestra using three classes, Instrument, Wind, and Strings. 
Note that the Strings class has a name very close to the String class, so be careful with your naming convention!

We need to save the following characteristics:

Name and family should be saved for all instruments
We need to specify whether a strings instrument uses a bow
We need to specify whether a wind instrument uses a reed
Build the classes out with getters and setters for all classes. Only the superclass needs a toString and the toString should print like this:
Violin is a member of the Strings family.

Your constructors should be set up to match the objects created in the InstrumentTester class. */

public class Instrument
{
    private String name;
    private String family;
    
    public Instrument(String theName, String theFamily) {
        name = theName;
        family = theFamily;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String x) {
        name = x;
    }
    
    public String getFamily() {
        return family;
    }
    
    public void setFamily(String x) {
        family = x;
    }
    
    public String toString() {
        return name + " is a member of the " + family + " family.";
    }
}

public class Strings extends Instrument
{
    private boolean bow;
    
    public Strings(String theName, boolean theBow) {
        super(theName, "Strings");
        bow = theBow;
    }
    
    public boolean getBow() {
        return bow;
    }
    
    public void setBow(boolean x) {
        bow = x;
    }
}

public class Wind extends Instrument
{
    private boolean reed;
    
    public Wind(String theName, String theFamily, boolean theReed) {
        super(theName, theFamily);
        reed = theReed;
    }
    
    public boolean getReed() {
        return reed;
    }
    
    public void setReed(boolean x) {
        reed = x;
    }
}

public class InstrumentTester
{
    public static void main(String[] args)
    {
        /**
         * Don't Change This Tester Class!
         * 
         * When you are finished, this should run without error.
         */ 
        Wind tuba = new Wind("Tuba", "Brass", false);
        Wind clarinet = new Wind("Clarinet", "Woodwind", true);
        
        Strings violin = new Strings("Violin", true);
        Strings harp = new Strings("Harp", false);
        
        System.out.println(tuba);
        System.out.println(clarinet);
        
        System.out.println(violin);
        System.out.println(harp);
    }
}