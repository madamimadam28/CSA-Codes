/* With objects such as Strings, we need to use the equals method to determine if they are the same. The same is true when looking at ArrayLists since they are also objects.

Let’s write an equals method for the ArrayList class that returns true if two ArrayLists are the same, and false if the ArrayLists are not identical. 
An ArrayList is identical if all of the values at each index are the same. */

import java.util.ArrayList;
public class isEqual
{
    public static void main(String[] args)
    {
        //This code is just to test your equals method
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
        list1.add(9);
        list1.add(5);
        list1.add(2);
        list1.add(9);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(9);
        list2.add(5);
        list2.add(2);
        list2.add(9);
        boolean isEqual = equals(list1, list2);
        System.out.println("List 1 is equal to List 2: "+isEqual);
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(1);
        list3.add(9);
        list3.add(5);
        list3.add(2);
        list3.add(9);
        boolean isEqual2 = equals(list2, list3);
        System.out.println("List 2 is equal to List 3: "+isEqual2);
        
    }
    
    //Write your method here!
    public static boolean equals(ArrayList<Integer> array1, ArrayList<Integer> array2)
    {
        boolean equals = true;
        if (array1.size() != array2.size()) {
            equals = false;
        }
        for (int i = 0; i < array1.size(); ++i) {
            if (array1.get(i) != array2.get(i)) {
                equals = false;
            }
        }
        return equals;
    }
}