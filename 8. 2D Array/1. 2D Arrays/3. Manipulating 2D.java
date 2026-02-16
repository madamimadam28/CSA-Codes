/* The last element in each array in a 2D array is incorrect. It’s your job to fix each array so that the value 0 is changed to the correct value.

In the first array, the final value should be the length of the 2D array.

In the second array, the final value should be the sum of lengths of the rows (this is also the total number of elements in array!).

In the third array, the final value should be the sum of the first and last values in the 2D array.

Create a method called updateValue(int[][] array, int row, int col, int value) that sets the [row][column] to the correct value. 
Then, call the updateValue method three times - once for each value change that you are supposed to make.

When inputting values to updateValue, you will have to hard code the row value, 
but the column value and the new value should be set so that it will work even if the rows in array are modified.

For example, if we wanted to set the value of the second to last index in the first array to the first element in the 2D array, we would write:

updateValue(array, 0, array[0].length - 2, array[0][0]) */

public class ArrayPractice
{
    public static void main(String[] args)
    {
        int[][] array = {{3, 5, 7, 8, 0}, {500, 250, 125, 784, 267, 674, 0}, {9, 8, 0}};
        
        // Call the updateValue method three times on this array:
        updateValue(array, 0, array[0].length - 1, array.length);
        int sum = 0;
        for (int[] row : array) {
            sum += row.length;
        }
        updateValue(array, 1, array[1].length - 1, sum);
        updateValue(array, 2, array[2].length - 1, array[0][0] + array[2][array.length - 1]);
        
        
        print(array);
    }
    
    //Create a method to add the correct value to the array at the correct col, row
    public static void updateValue(int[][] arr, int row, int col, int value)
    {
        arr[row][col] = value;
    }
    
    
    
    //Do not make alterations to this method!
    public static void print(int[][] array)
    {
        for(int[] row: array)
        {
            for(int num: row)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}