/* Write the methods

public static int sumRow(int[][] array, int row)
and

public static int sumArray(int[][] array)
sumRow returns the sum of row row in the 2D array called array.

sumArray returns the sum of all of the elements in the 2D array called array. You should use sumRow to implement this method.

In main, print the sum of all the elements in the array. */

public class Sum
{
    public static void main(String[] args)
    {
        int[][] array = {{4, 4, 5, 6, 3, 1},
                        {14, 2, 5, 4, 8, 2},
                        {45, 12, 13, 5, 2, 1}};
        System.out.println(sumArray(array));
        
    }
    
    // Returns the sum of row row in 2D array array
    public static int sumRow(int[][] array, int row)
    {
        int sum = 0;
        for (int num : array[row]) {
            sum += num;
        }
        return sum;
    }
    
    // Returns the sum of all elements in array
    public static int sumArray(int[][] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; ++i) {
            sum += sumRow(array, i);
        }
        return sum;
    }
}