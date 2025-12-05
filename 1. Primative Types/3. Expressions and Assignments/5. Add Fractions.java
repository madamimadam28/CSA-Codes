/*In this program you will initialize 4 integers that represent each part of two fractions, namely the numerator and denominator of the first fraction and the numerator and denominator of the second fraction.

Your program should add the two fractions and print out the result.*/

public class AddFractions 
{
    public static void main(String[] args)
    {
        //Your code goes here! 
        int a = 1, b = 2, c = 3, d = 4;
        System.out.println("The numerator of the first fraction is " + a);
        System.out.println("The denominator of the first fraction is " + b);
        System.out.println("The numerator of the second fraction is " + c);
        System.out.println("The denominator of the second fraction is " + d);
        
        int sum = a * d + b * c;
        System.out.println("The sum of " + a + "/" + b + " + " + c + "/" + d + " = " + sum + "/" + b * d);
    }
}