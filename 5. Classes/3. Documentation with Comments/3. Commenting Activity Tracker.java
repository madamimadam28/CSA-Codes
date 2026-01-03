/* Over the next two exercises, we are going to comment the ActivityTracker and ActivityLog class.  */

public class ActivityTracker
{
    public static void main(String[] args)
    {
        // Create new activity log
        ActivityLog mylog = new ActivityLog();
        
        // Update the log by adding 5 miles and 1 hour
        mylog.addMiles(5);
        mylog.addHours(1);
        
        // Output what the total mileage is
        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles());
        
        // Find the current number of hours in the log
        double hoursToday = mylog.getHours();
        
        // Update the number of hours by adding
        mylog.addHours(1.5);
        mylog.addHours(3);
        
        // Find the increase in hours from before to after the update
        double increase = mylog.getHours() - hoursToday;
        
        // Output the increase in hours
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}