/*Let’s look at a calculator class. We have a calculator class that allows us to add, subtract, multiply, and divide doubles.

In the main method, ask for two doubles. Then
print the sum, difference, product, and quotient.

For example, your output should look like this
(you can call nextDouble twice in a row to get two numbers)

Enter two doubles
3.4
1.6
3.4 + 1.6 = 5.0
3.4 - 1.6 = 1.7999999999999998
3.4 * 1.6 = 5.44
3.4 / 1.6 = 2.125 */

public class Calculator
{
    /* This class doesn't need instance variable or
     * a constructor. You can create the same way
     * you create other objects, using empty
     * parenthesis.
     * Calculator c = new Calculator();
     *
     */
     
    // Prints the sum of x and y
    public void add(double x, double y)
    {
        double result = x + y;
        System.out.print(x);
        System.out.print(" + ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
        
    }
    
    // Prints the product of x and y
    public void multiply(double x, double y)
    {
        double result = x * y;
        System.out.print(x);
        System.out.print(" * ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
        
    }
    
    // Prints the quotient of x and y
    public void divide(double x, double y)
    {
        double result = x / y;
        System.out.print(x);
        System.out.print(" / ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
        
    }
    
    // Prints the difference of x and y
    public void subtract(double x, double y)
    {
        double result = x - y;
        System.out.print(x);
        System.out.print(" - ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
        
    }
}

import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments like the last exercise
        // to remind yourself what you need to do
        
        //To get started, create a new Calculator object
        Calculator c = new Calculator();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two doubles");
        double a = input.nextDouble();
        double b = input.nextDouble();
        c.add(a, b);
        c.subtract(a, b);
        c.multiply(a, b);
        c.divide(a, b);
    }
}