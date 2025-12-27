/*Using a while loop, create an algorithm extractDigits that prints the individual digits of a positive integer.

For instance, extractDigits(82947); would create the output:

7
4
9
2
8
Java
Hint: The % and the / operators are going to be very useful in this program. How can you use these to extract the last digit of the given number? You should be using a while loop to help you. */

public class ExtractDigits
{
    public static void main(String[] args)
    {
        extractDigits(2938724);
        
    }
    
    public static void extractDigits(int num)
    {
        while (num > 0) {
            System.out.println(num % 10);
            num /= 10;
        }
    }
}