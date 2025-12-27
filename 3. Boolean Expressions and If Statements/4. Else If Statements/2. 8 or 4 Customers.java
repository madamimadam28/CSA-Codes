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
	// Notice how the else if statement is added to differentiate between greater
	// than 8 customers and between 4-8. 
	public void addTip()
    {
        if(totalCustomers >= 8) 
        {
            costOfMeal *= 1.25;
        }
        else if(totalCustomers >= 4)
        {
            costOfMeal *= 1.20;
        }
        else
        {
            // if totalCustomers < 4
        	costOfMeal *= 1.05;
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
        double cost = 125.45;
        
        // Create a bill for a (very expensive) birthday dinner
        Bill birthdayDinner = new Bill(cost, 10);
        System.out.println("Birthday Dinner");
        System.out.println(birthdayDinner);
        
        // Add the tip
        birthdayDinner.addTip();
        System.out.println("\nBirthday Dinner after tip");
        System.out.println(birthdayDinner);
        
        
        // Another dinner with less guests
        System.out.println("\n\n"); // print a few blank lines
        birthdayDinner = new Bill(cost, 5);  // reassign the variable to a new object
        System.out.println("Birthday Dinner");
        System.out.println(birthdayDinner);
        
        // Add the tip
        // Notice the difference in the final amount
        birthdayDinner.addTip();
        System.out.println("\nBirthday Dinner after tip");
        System.out.println(birthdayDinner);
        

        // Another dinner with even less guests
        System.out.println("\n\n"); // print a few blank lines
        birthdayDinner = new Bill(cost, 2);  // reassign the variable to a new object
        System.out.println("Birthday Dinner");
        System.out.println(birthdayDinner);
        
        // Add the tip
        // Notice the difference in the final amount
        birthdayDinner.addTip();
        System.out.println("\nBirthday Dinner after tip");
        System.out.println(birthdayDinner);

        
    }
}