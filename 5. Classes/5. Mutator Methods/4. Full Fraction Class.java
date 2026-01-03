/* In this exercise, you must take your Fraction class from exercise 2.8.9 (exercise number may be different in some cases) and extend it by adding a few handy methods.

YOUR JOB:

Implement the following methods in the Fraction class:

public void add(Fraction other)
public void subtract(Fraction other)
public void multiply(Fraction other)
public int getNumerator()
public int getDenominator()
public void setNumerator(int x)
public void setDenominator(int x)
public String toString()
Use the FractionTester file to test as you go along.

HINTS:

Note that

public void add(Fraction other)
public void subtract(Fraction other)
public void multiply(Fraction other)
are void methods. They do not return anything. These methods should not create a new Fraction and return it.

Instead, these methods should modify the instance variables to be added, subtracted, or multiplied by the Fraction other.

For example, if you had the following code in your FractionTester class:

Fraction first = new Fraction(1, 2);
Fraction second = new Fraction(1, 3);
System.out.println();

System.out.println("BEFORE:");
System.out.println("first: " + first);
System.out.println("second: " + second);

first.multiply(second);

System.out.println("AFTER:");

System.out.println("first: " + first);
System.out.println("second: " + second);
Running should print out:

BEFORE:
first: 1 / 2
second: 1 / 3

AFTER:
first: 1 / 6
second: 1 / 3 */

public class Fraction
{
    // Create your instance variables and constructor here
    private int num;
    private int deno;
    
    public Fraction(int numerator, int denominator) {
        num = numerator;
        deno = denominator;
    }
    
    
    public int getNumerator() {
        // IMPLEMENT THIS METHOD
        return num;
    }
    
    public int getDenominator() {
        // IMPLEMENT THIS METHOD
        return deno;
    }
    
    public void setNumerator(int x) {
        // IMPLEMENT THIS METHOD
        num = x;
    }
    
    
    public void setDenominator(int x) {
        // IMPLEMENT THIS METHOD
        deno = x;
    }
    
    public void add(Fraction other) {
        // IMPLEMENT THIS METHOD
        num = num * other.deno + deno * other.num;
        deno = deno * other.deno;
    }
    
    public void subtract(Fraction other) {
        // IMPLEMENT THIS METHOD
        num = num * other.deno - deno * other.num;
        deno = deno * other.deno;
    }
    
    public void multiply(Fraction other) {
        // IMPLEMENT THIS METHOD
        num = num * other.num;
        deno = deno * other.deno;
    }
    
    public String toString() {
        // IMPLEMENT THIS METHOD
        return num + " / " + deno;
    }
}

public class FractionTester
{
    public static void main(String[] args)
    {
        // Implement the Fraction class in Fraction.java
        
        // Then add code here to test out your Fraction class!
    }
}