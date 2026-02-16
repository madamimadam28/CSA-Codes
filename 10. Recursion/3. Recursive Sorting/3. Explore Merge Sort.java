/* Mergesort is a complicated process, but what is it actually doing? We are going to take a closer look at the process in this exercise.

You are given the merge sort algorithm and you need to add some print statements so that you can see what actually is happening.

Add a print statement at each step, as well as print out the array each time. Your output needs to match the sample below. Here is a portion of a sort as an example:

Unsorted: 7 5 8 3 4 9 1 2 6 

Splitting ...
*** Left Half: 7 5 8 3 
*** Right Half: 4 9 1 2 6 

Splitting ...
*** Left Half: 7 5 
*** Right Half: 8 3 

Splitting ...
*** Left Half: 7 
*** Right Half: 5 

Merging ... 
*** Sorted so Far: 5 7 


...



Merging ... 
*** Sorted so Far: 1 2 6 

Merging ... 
*** Sorted so Far: 1 2 4 6 9 

Merging ... 
*** Sorted so Far: 1 2 3 4 5 6 7 8 9 

Sorted: 1 2 3 4 5 6 7 8 9  */

public class MergeSortPrint {

    public static void main(String[] args) {
        int[] myArray = {20, 9, 13, 34, 11, 22, 13, 10};

        // Print unsorted array
        System.out.print("Unsorted: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        mergeSort(myArray, myArray.length);


        // Print Sorted Array
        System.out.print("Sorted: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
       
        System.out.println();
    }

    public static void mergeSort(int[] current, int length) {
        if (length < 2) {
            return;
        }
        
        System.out.println("Splitting ...");
        
        int mid = length / 2;
        int[] left = new int[mid];

        int[] right = new int[length - mid];
        
        
        System.out.print("*** Left Half: ");
        
        // Create and print left array
        for (int i = 0; i < mid; i++) {
            left[i] = current[i];
        }
        
        for (int num : left) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.print("*** Right Half: ");
        
        // Create and print right array
        for (int i = mid; i < length; i++) {
            right[i - mid] = current[i];
        }
        
        for (int num : right) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        System.out.println();
        
        mergeSort(left, mid);
        mergeSort(right, length - mid);

        merge(current, left, right);
        
        System.out.print("*** Sorted so Far: ");
        
        // Print current array
        for (int num : current) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void merge(int[] current, int[] left, int[] right)
    {
        System.out.println("Merging ... ");
        int leftSize = left.length;
        int rightSize = right.length;

        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                current[k] = left[i];
                k++;
                i++;
            }
            else {
                current[k] = right[j];
                k++;
                j++;
            }
        }
        while (i < leftSize) {
            current[k] = left[i];
                k++;
                i++;
        }
        while (j < rightSize) {
            current[k] = right[j];
                k++;
                j++;
        }
    }
}