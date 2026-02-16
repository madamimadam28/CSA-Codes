/* In this exercise, you will code a modified version of the linear search from the previous example.

Here you should implement a method to do a linear search on an ArrayList of doubles and return the index of the search double, or -1 if it isn’t found using a while loop. */

import java.util.ArrayList;

public class ArrayListSearch
{
    public static void main(String[] args) {
        ArrayList<Double> array = new ArrayList<Double>();
        array.add(4.5);
        array.add(6.7);
        array.add(5.0);
        array.add(2.9);
        array.add(7.0);
        System.out.println(search(array, 5.0));
    }

    public static int search(ArrayList<Double> array, double key)
    {
        int idx = 0;
        while (idx < array.size()) {
            if (array.get(idx) == key) {
                return idx;
            }
            idx++;
        }
        return -1;
    }
}