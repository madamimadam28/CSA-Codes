/* Write a method called getLastElement that returns the last element of the given array.

In the main method, call the ‘getLastElement` method and print the results.

Your output should be the following:

The final unit circle value is 7.85 */

public class LastElement
{
    public static void main(String[] args)
    {
        double[] unitCircle = {0, 1.57, 3.14, 6.28, 7.85};
        //get and print the last element of the array
        System.out.println("The final unit circle value is " + getLastElement(unitCircle));
    }

    public static double getLastElement(double[] arr)
    {
        // Your code goes here!
        return arr[arr.length - 1];
    }
}