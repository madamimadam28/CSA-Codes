/* In this program you will ask the user for three integers and
then print out the median (middle) value.

Remember that a number is the median value if it is larger than one number and smaller than the other. For example, given the numbers 1, 3, 2 or the numbers 2, 3, 1, the middle number is 2.

Use compound boolean expressions to help you.

Example Output:

Enter the first integer: 
89
Enter the second integer: 
1000
Enter the third integer: 
23

The median is 89*/

import java.util.*;

public class FindMedian 
{
    public static void main(String[] args)
    {
        // Ask the user for three ints and 
        // print out the median.
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("The median is " + Math.max(Math.min(a, b), Math.min(Math.max(a, b), c)));
    }
}