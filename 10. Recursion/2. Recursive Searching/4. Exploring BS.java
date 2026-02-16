/* The Binary Search algorithm works by testing a mid-point, then eliminating half of the list.

In this exercise, you are going to take our binary search algorithm and add print statements so that you can track how the search executes.

Inside of the recursive binary search function, add print statements to print out the starting, ending, and midpoint values each time.

Then as you test a value, print out the results, either too high, too low, or a match.

Sample Output
Value at start index: 3
Value at mid index: 24
Value at end index: 100
Target is greater than mid!

Value at start index: 34
Value at mid index: 64
Value at end index: 100
Target is greater than mid!

Value at start index: 87
Value at mid index: 87
Value at end index: 100
Target equals mid! */

public class BinaryExplorer {

    public static void main(String[] args) {
        int[] testArray = {3, 6, 12, 18, 24, 34, 54, 64, 87, 100};

        binaryRec(testArray, 87, 0, testArray.length - 1);

    }

    /**
     * Add Print statements to the binaryRec method:
     * 
     * Print Starting, ending, and midpoint values.
     * 
     * Print when you find a match
     * 
     * Print if you are too high or too low.
     * 
     **/
    public static int binaryRec(int[] array, int target, int begin, int end) {
        if (begin <= end)
        {
            
            int mid = (begin + end) / 2;
        
            System.out.println("Value at start index: " + array[begin]);
            System.out.println("Value at mid index: " + array[mid]);
            System.out.println("Value at end index: " + array[end]);
            
            // Base Case
            if (target == array[mid]) {
                System.out.println("Target equals mid!");
                return mid;
            }
    
            if (target < array[mid]) {
                System.out.println("Target is less than mid!");
                return binaryRec(array, target, begin, mid - 1);
            }
    
            if (target > array[mid]) {
                System.out.println("Target is greater than mid!");
                return binaryRec(array, target, mid + 1, end);
            }
        }
        return -1; //Alternate Base Case - not found
    }
}