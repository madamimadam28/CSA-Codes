public class Calculator
{
    // This class does not need instance variables!
    
    // This class does not need a constructor!
    // Java will make a default constructor
    // if you don't make one yourself
    
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
    
    
}

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Create a Calculator object
        // Java gives the class a default
        // constructor if we don't implement one
        Calculator calc = new Calculator();
        
        
        // Print sum, product
        double num1 = 10;
        double num2 = 20.5;
        System.out.println(num1 + " + " +  num2 + " = " + calc.sum(num1, num2));
        System.out.println(num1 + " * " +  num2 + " = " + calc.multiply(num1,num2));
        
    }
}