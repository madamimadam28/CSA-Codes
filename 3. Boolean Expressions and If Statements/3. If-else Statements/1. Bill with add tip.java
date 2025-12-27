class Bill
{
	private double costOfMeal;
	private int totalCustomers;

    // Constructor
	public Bill(double totalBill, int numCustomers)
	{
		costOfMeal = totalBill;
		totalCustomers = numCustomers;
	}
	
	// Add a tip based on the number of guests
	public void addTip()
    {
        if(totalCustomers >= 8)
        {
        	costOfMeal *= 1.25;   //OR costOfMeal += costOfMeal * .25
        }
        else
        {
        	costOfMeal *= 1.20;   //OR costOfMeal += costOfMeal * .20
        }
    }


    public String toString()
    {
        // Round the bill to two decimal places
        double roundedBill = Math.round(costOfMeal * 100.0) / 100.0;
        
        return "Bill for " + totalCustomers + " comes to $" + roundedBill;
    }
	
	
}

public class BillTester
{
    public static void main(String[] args)
    {
        // Create a bill for a (very expensive) birthday dinner
        Bill birthdayDinner = new Bill(250.46, 14);
        System.out.println("Birthday Dinner");
        System.out.println(birthdayDinner);
        
        // Add the tip
        birthdayDinner.addTip();
        System.out.println("\nBirthday Dinner after tip");
        System.out.println(birthdayDinner);
        
        
        // Another dinner with less guests
        System.out.println("\n\n"); // print a few blank lines
        birthdayDinner = new Bill(250.46, 7);  // reassign the variable to a new object
        System.out.println("Birthday Dinner");
        System.out.println(birthdayDinner);
        
        // Add the tip
        // Notice the difference in the final amount
        birthdayDinner.addTip();
        System.out.println("\nBirthday Dinner after tip");
        System.out.println(birthdayDinner);
        
        
    }
}