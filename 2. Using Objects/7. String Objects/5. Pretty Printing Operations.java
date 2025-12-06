/*Let’s revisit the calculator you implemented in a previous lesson.

The Calculator class has been implemented a bit differently in this lesson. The last time you implemented the Calculator class, its methods were void. Check out the class to understand it.

Modify the main method. Ask for two doubles. Then
print the sum, difference, product, and quotient. This time, you will have to call each method and store the result. The equation will be printed from main rather than from Calculator.

You should use a single print statement for each equation. Use String concatenation to form the equations. Be sure to add the spaces around the operators to ensure the output is formatted neatly.

For example, your output should look like this

Enter two doubles
3.4
1.6
3.4 + 1.6 = 5.0
3.4 - 1.6 = 1.7999999999999998
3.4 * 1.6 = 5.44
3.4 / 1.6 = 2.125 */

public class Calculator
{
    // This class does not need instance variables!
    // Since there are no instance variables,
    // this class also does not need a constructor.
    
    // Java will create an empty constructor for you.
    
    // Returns the sum of x and y
    public double sum(double x, double y)
    {
        return x + y;
        
    }
    
    // Returns the product of x and y
    public double multiply(double x, double y)
    {
        return x * y;
        
    }
    
    // Returns the quotient x / y
    public double divide(double x, double y)
    {
       return x / y;
    }
    
    // Returns the difference of x - y
    public double subtract(double x, double y)
    {
        return x - y;
    }
    
}

import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments to remind yourself 
        // what you need to do
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();
        
        System.out.println("Enter two doubles");
        double a = input.nextDouble();
        double b = input.nextDouble();
        
        System.out.println(a + " + " + b + " = " + calc.sum(a, b));
        System.out.println(a + " - " + b + " = " + calc.subtract(a, b));
        System.out.println(a + " * " + b + " = " + calc.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calc.divide(a, b));
    }
}