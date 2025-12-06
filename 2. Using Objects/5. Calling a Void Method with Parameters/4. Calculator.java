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
    public void sum(int x, int y)
    {
        int result = x + y;
        System.out.print(x);
        System.out.print(" + ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
        
    }
    
    // Prints the product of x and y
    public void multiply(int x, int y)
    {
        int result = x * y;
        System.out.print(x);
        System.out.print(" * ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
    }
    
    public void addFive(int x)
    {
        System.out.println(x + 5);
    }
}

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Create a calculator object
        Calculator calc = new Calculator();
        
        // Notice the order of the parameters
        // corresponds to the order in which
        // the values are printed out
        calc.sum(3, 10);
        calc.multiply(-5, -7);
        
        int x = 5;
        calc.addFive(x);
        
        //Notice how the value of x remains 5, even after using it in the addFive method
        //Changes that occur within a method will not apply to the initial variable, unless that
        //variable is changed in the current class (CalculatorTester)
        System.out.println(x);
    }
}