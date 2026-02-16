/* In this exercise you will compare binary search and linear (or sequential) search.

We have included the algorithms for you, however right now the method returns the index value where the number is found.

What you need to do in this problem is modify each method to instead return the number of times each goes through the loop.

Then you can test out the results on lists of different sizes. We have provided a helper method to generate a list of a certain size.

Be sure to test at least 5 different size arrays! */

import java.util.*;

public class CompareSearch 
{
    public static void main(String[] args)
    {
        System.out.println("Table of comparison counts");
        System.out.println("Length\t\tBinary Search\tLinear Search");
        testArrayOfLength(10);
        testArrayOfLength(20);
        testArrayOfLength(30);
        testArrayOfLength(40);
        testArrayOfLength(50);
    }
    
    // This problem generates an array of length length. Then we select a random
    // index of that array and get the element. Then we print out the table row
    // entry for how many comparisons it takes on binary search and linear search.
    // You'll need to update those methods.
    public static void testArrayOfLength(int length)
    {
        int[] arr = generateArrayOfLength(length);
        //System.out.println(Arrays.toString(arr));
        int index = (int)(Math.random() * length);
        int elem = arr[index];
        System.out.println(length + "\t\t" + binarySearch(arr, elem) + "\t\t" + linearSearch(arr, elem));
    }
    
    public static int[] generateArrayOfLength(int length)
    {
        int[] arr = new int[length];
        for(int i = 0; i < length; i++)
        {
            arr[i] = (int)(Math.random() * 100);
        }
        
        Arrays.sort(arr);
        
        return arr;
    }
    
    // Do a binary search on array to find number. You'll need to modify this 
    // method to return the number of comparisons done.
    public static int binarySearch(int[] array, int number)
    {
        int low = 0;
        int high = array.length - 1;
        
        // Add a counter to count how many times the while loop is executed
        int cnt = 1;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (array[mid] == number)
            {
                return cnt;
            }
            else if(array[mid] < number)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
            cnt++;
        }
      
        return cnt;
    }
    
    // Do a linear search on array to find the index of number. You'll need to modify
    // this exercise to return the number of *comparisons* done.
    public static int linearSearch(int[] array, int number)
    {
        // Add a counter to count how many times the for loop is executed
        int cnt = 1;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == number)
            {
                
                return cnt; // the method returns as soon as the number is found
            }
            cnt++;
        }
        return cnt; // the code will get here if the number isn't found
    }
}