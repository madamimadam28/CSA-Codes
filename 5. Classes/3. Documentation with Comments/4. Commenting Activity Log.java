public class ActivityLog
{
    private double numHours;
    private double numMiles;
    
    /**
    Initializes a ActivityLog object. 
    Precondition: ActivityLog object
    Postcondition: Instance variables double numHours and double numMiles are initialized with 0 and 0
    */
    
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }
    
    /**
    Update hours. 
    Precondition: double hours
    Postcondition: increments numHours by hours 
    */
    public void addHours(double hours)
    {
        numHours += hours;
    }
    
    /**
    Update miles. 
    Precondition: double miles
    Postcondition: increments numMiles by miles 
    */
    public void addMiles(double miles)
    {
        numMiles += miles;
    }
    
    /**
    Get miles. 
    Precondition: None
    Postcondition: find numMiles
    
    @return: returns numMiles
    */
    public double getMiles()
    {
        return numMiles;
    }
    
    /**
    Get hours. 
    Precondition: None
    Postcondition: find numHours
    
    @return: returns numHours
    */
    public double getHours() 
    {
        return numHours;
    }
    
}