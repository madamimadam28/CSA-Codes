/* Write a method that prints the contents of an array. Each element should be printed on its own line along with its index. Test this method out on the two arrays created for you in the main method.

For example,

0. First element
1. Second element
2. Third element */

public class PrintArray
{
    public static void main(String[] args)
    {
        String[] arr1 = new String[]{"w", "x", "y", "z"};
        printArr(arr1);
        
        String[] arr2 = new String[]{"a", "b", "c"};
        printArr(arr2);
    }
    
    public static void printArr(String[] arr)
    {
        // Print everything in the array on its own line
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(i + ". " + arr[i]);
        }
    }
}