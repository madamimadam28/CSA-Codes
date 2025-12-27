/*Create a program using a for loop which will print out the 4’s times table through 10.

Sample output:

4 * 1 = 4
4 * 2 = 8
4 * 3 = 12
4 * 4 = 16
4 * 5 = 20
4 * 6 = 24
4 * 7 = 28
4 * 8 = 32
4 * 9 = 36
4 * 10 = 40 */

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        // Your code goes here!
        for (int i = 1; i <= 10; ++i) {
            System.out.println(4 + " * " + i + " = " + 4 * i);
        }
    }
}