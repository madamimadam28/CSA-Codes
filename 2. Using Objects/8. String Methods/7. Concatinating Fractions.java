/* Here is a partial Fraction class.

Implement getNumerator and getDenominator. Then fill in the toString method so that it returns a Fraction in the form “numerator/denominator”, such as “1/2” or “16/20”.

Main
Test your toString method using main.

In main, create a Fraction that represents 1/2.

Then you should ask the user for the numerator and denominator for another Fraction. Create a new Fraction object to represent the user’s fraction so you can print it out later.

Compute the fractions’ sum (in main) as follows

a/b + c/d = (a*d + b*c)/(b*d)
You can store the results of the sum in another Fraction object.

Print out the equation and the answer using the objects. Note you do not have to call toString on the objects explictly.

Your output should look something like

Enter the numerator: 
2
Enter the denominator: 
3
1/2 + 2/3 = 7/6 */

public class Fraction
{
    private int numerator;
    private int denominator;
    
    public Fraction(int numer, int denom)
    {
        numerator = numer;
        denominator = denom;
    }
    
    // Returns the numerator
    public int getNumerator()
    {
        return numerator;
    }
    
    // Returns the denominator
    public int getDenominator()
    {
        return denominator;
    }
    
    
    // Returns a string representing a fraction
    // in the form
    // numerator/denominator
    public String toString()
    {
        return numerator + "/" + denominator;
    }
    
    
}

import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        // Create objects
        Scanner input = new Scanner(System.in);
        
        // Ask for input
        System.out.println("Enter the numerator: ");
        int num = input.nextInt();
        System.out.println("Enter the denominator: ");
        int den = input.nextInt();
        
        // Create a new Fraction with the user's input
        Fraction frac1 = new Fraction(1, 2);
        Fraction frac2 = new Fraction(num, den);
        
        // Add the fractions
        // Make use of the getDenominator and getNumerator methods
        int fnum = frac1.getNumerator() * frac2.getDenominator() + frac2.getNumerator() * frac1.getDenominator();
        int fden = frac1.getDenominator() * frac2.getDenominator();
        Fraction frac3 = new Fraction(fnum, fden);
        
        // Print out the fractions as an equation
        // Remember you don't have to call toString yourself!
        System.out.println(frac1 + " + " + frac2 + " = " + frac3);
        
    }
}