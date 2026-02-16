/* In this exercise, you will create a couple of helper methods for ArrayLists in a class called ArrayListMethods.

Create three static methods:

print- This method takes an ArrayList<Double> as a parameter, and simply prints each value of the ArrayList on a separate line in the console.
condense- This method takes an ArrayList<Double> as a parameter, and condenses the ArrayList into half the amount of values. 
While traversing, this method will take the existing value at the index and multiplies the element following to the existing value. 
For example, if we had an ArrayList that consisted of Doubles [1, 2.5, 2, 3.5], then ArrayListMethods.condense([1, 2.5, 2, 3.5]) would alter the ArrayList to be [2.5, 7].
duplicate- This method takes an ArrayList<Double> and duplicates all of the values by adding each value to the end of the ArrayList. 
For example, ArrayListMethods.duplicate([2.5, 7]) would be [2.5, 7, 2.5, 7].
If done correctly, the methods should work in the ArrayListMethodsTester file. */

import java.util.ArrayList;

public class ArrayListMethods
{
    public static void print(ArrayList<Double> arr) {
        for (int i = 0; i < arr.size(); ++i) {
            System.out.println(arr.get(i));
        }
    }
    public static void condense(ArrayList<Double> arr) {
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, arr.get(i) * arr.get(i + 1));
            arr.remove(i + 1);
        }
    }
    public static void duplicate(ArrayList<Double> arr) {
        int size = arr.size();
        for (int i = 0; i < size; i++) {
            arr.add(arr.get(i));
        }
    }
}

import java.util.ArrayList;

public class ArrayListMethodsTester
{
    public static void main(String[] args)
    {
        ArrayList<Double> prices = new ArrayList<Double>();
        
        prices.add(13.45);
        prices.add(8.99);
        prices.add(2.95);
        prices.add(7.88);
        prices.add(12.56);
        prices.add(1.23);
        
        
        ArrayListMethods.print(prices);
        System.out.println("\nArrayList is condensing:");
        ArrayListMethods.condense(prices);
        ArrayListMethods.print(prices);
        System.out.println("\nArrayList is duplicating:");
        ArrayListMethods.duplicate(prices);
        ArrayListMethods.print(prices);
        
    }
}