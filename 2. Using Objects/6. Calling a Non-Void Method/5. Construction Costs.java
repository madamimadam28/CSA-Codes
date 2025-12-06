/* The Construction class is completed for you, but you may want to look at it to make sure you understand how to use it.

Then write a program in the main method that asks the user to enter the sales tax rate as a decimal, the number of boards needed, and the number of windows needed.

Create a Construction object to compute the cost of the lumber and windows. Use $8 for the cost of lumber. Use $11 for the cost of windows.

Print the total cost. Then use the method to compute the tax and print out the grand total including tax.

Here is an example of the output

Enter the sales tax rate: 
.08
How many boards do you need? 
10
How many windows do you need? 
5
Total: 135.0
Grand Total: 145.8 */

public class Construction
{
    
    private double lumber;  // price per board 
    private double windows; // price per square inch of window
    private double taxRate; 
   
    
    public Construction(double lumberPrice, double windowPrice, double taxes)
    {
        lumber = lumberPrice;
        windows = windowPrice;
        taxRate = taxes;
    }
    
    // Computes and returns the cost
    // of the lumber
    public double lumberCost(int numBoards)
    {
        return lumber * numBoards;   
    }
    
    // Computes and returns the cost of the windows
    public double windowCost(int numWindows)
    {
        return windows * numWindows;   
    }
    
    // Computes the grand total by adding
    // the tax amount to the total
    public double grandTotal(double total)
    {
        return total * (1 + taxRate);
    }
    
}

import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sales tax rate: ");
        double tax = input.nextDouble();
        Construction c = new Construction(8.0, 11.0, tax);
        
        System.out.println("How many boards do you need? "); 
        int boards = input.nextInt();
        double bcost = c.lumberCost(boards);
        
        System.out.println("How many windows do you need?"); 
        int windows = input.nextInt();
        double wcost = c.windowCost(windows);
        
        double total = bcost + wcost;
        System.out.println("Total: " + total);
        System.out.println("Grand Total: " + c.grandTotal(total)); 
    }
}