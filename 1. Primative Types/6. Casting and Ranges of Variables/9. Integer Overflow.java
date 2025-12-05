/*If an expression would evaluate to an int value outside of the allowed range, an integer overflow occurs. This could result in an incorrect value within the allowed range.

In this program, you will test for underflow and overflow in Java by adding 1 to the maximum value and subtracting 1 from the minimum value to see what happens to the output. Your output should include 4 items:

The minimum value for an integer.
The maximum value for an integer.
The minimum value subtracted by 1.
The maximum value with 1 added. */

public class IntegerOverflow
{
    public static void main(String[] args)
    {
        // Start here!
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE - 1);
        System.out.println(Integer.MAX_VALUE + 1);
    }
}