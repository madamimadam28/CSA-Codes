/* We learned in this lesson that Merge Sorts are recursive. One of College Board’s favorite things to ask is how many times a recursive method is called. 
With that in mind, let’s figure out how many times our recursive method is called for a given merge sort.

For this exercise, you are given the mergeSort and the makeRandomArray helper methods. 
Using the static numCalls variable, add an incrementer in the mergeSort method to count how many times it is called.

Then, in the main method, create a random array of sizes 100, 1000, 10k, and 100k. 
Run the array through the sort and print out the results of the counter. Don’t forget to reset the counter between runs!

You should pay attention to the pattern that you see. Does this pattern surprise you?

Sample Output
Number of recursive calls with 100 elements: ** Results Hidden **
Number of recursive calls with 1000 elements: ** Results Hidden **
Number of recursive calls with 10000 elements: ** Results Hidden **
Number of recursive calls with 100000 elements: ** Results Hidden **
Challenge: See if you can write this with a loop! */

import java.util.ArrayList;

public class MergeSortCounter {

    private static int numCalls;

    public static void main(String[] args) {
        for (int i = 100; i <= 100000; i *= 10) {
            int[] array = makeRandomArray(i);
            mergeSort(array, i);
            System.out.println("Number of recursive calls with " + i + " elements: " + numCalls);
            numCalls = 0;
        }
    }

    public static void mergeSort(int[] current, int length) {
        numCalls++;
        
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        int[] left = new int[mid];

        int[] right = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = current[i];
        }

        for (int i = mid; i < length; i++) {
            right[i - mid] = current[i];
        }

        mergeSort(left, mid);
        mergeSort(right, length - mid);

        merge(current, left, right);

    }

    public static void merge(int[] current, int[] left, int[] right)
    {
        int leftSize = left.length;
        int rightSize = right.length;

        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                current[k++] = left[i++];
            }
            else {
                current[k++] = right[j++];
            }
        }
        while (i < leftSize) {
            current[k++] = left[i++];
        }
        while (j < rightSize) {
            current[k++] = right[j++];
        }
    }

    public static int[] makeRandomArray(int number){
        int[] array = new int[number];
        ArrayList<Integer> sorted = new ArrayList<Integer>(number);
        // Create the sorted list
        for (int i = 0; i < number; i++){
            sorted.add(i);
        }

        // Now shuffle it.
        int index = 0;
        while (sorted.size() > 0){
            int randomIndex = (int)(Math.random()*sorted.size());
            array[index] = sorted.remove(randomIndex);
            index ++;
        }

        return array;
    }
}