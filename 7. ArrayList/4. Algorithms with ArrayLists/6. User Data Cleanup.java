/* Your company is doing some data cleanup, and notices that the list of all users has been getting outdated.
For one, there are some users who have been added multiple times.

Your job is to create a series of methods that can purge some of the old data from the existing list.

Create static methods in the DataPurge class that can do the following:

removeDuplicates This method takes a list of people, and removes the duplicate names. It also prints to the console which duplicate names have been removed.
removeName This method takes a list of people and a name for which to search. It removes all names that contain the search string. 
It should print to the console any names that were removed.
correctlyFormatted This method returns true if all of the data in the list is formatted correctly. 
Correctly formatted names are made up of a first name and a last name, separated by a single space. Both the first and last names should start with an uppercase letter.
Test your methods out in the DataPurgeTester file. You don’t have to change anything there, but the methods should work accordingly!

Hint: There are many ways to solve these problems, especially correctlyFormatted. 
You may find indexOf or split or toUpperCase or contains or substring to be useful methods, depending on your algorithm.
One way to check if a letter is uppercase is to compare the letter to the uppercase version of itself. */

import java.util.ArrayList;

public class DataPurge
{
    static void removeDuplicates(ArrayList<String> members) {
        for (int i = 0; i < members.size(); ++i) {
            String curr = members.get(i);
            if (members.indexOf(curr) != members.lastIndexOf(curr)) {
                System.out.println(curr);
                while (members.lastIndexOf(curr) != i) {
                    members.remove(members.lastIndexOf(curr));
                }
                i--;
            }
        }
    }
    
    static void removeName(ArrayList<String> members, String name) {
        for (int i = 0; i < members.size(); ++i) {
            String curr = members.get(i);
            if (curr.contains(name)) {
                System.out.println(curr);
                members.remove(i);
                i--;
            }
        }
    }
    
    static boolean correctlyFormatted (ArrayList<String> members) {
        for (int i = 0; i < members.size(); ++i) {
            String curr = members.get(i);
            if (curr.indexOf(" ") == -1 || curr.indexOf(" ") != curr.lastIndexOf(" ") || Character.isLowerCase(curr.charAt(0)) || Character.isLowerCase(curr.charAt(curr.indexOf(" ") + 1))) {
                return false;
            }
        } 
        return true;
    }
}

import java.util.ArrayList;

public class DataPurgeTester
{
    public static void main(String[] args)
    {
        ArrayList<String> members = new ArrayList<String>();
        addMembers(members);
        System.out.println("All names formatted correctly? " + DataPurge.correctlyFormatted(members));
        DataPurge.removeName(members, "Araceli Castaneda");
        DataPurge.removeDuplicates(members);
        System.out.println(members);
    }
    
    
    
    public static void addMembers(ArrayList<String> emails)
    {
        emails.add("London Braun");
        emails.add("Jaslyn Chavez");
        emails.add("Daphne Kane");
        emails.add("Aden Brock");
        emails.add("Jaime Wolf");
        emails.add("finley Wood");
        emails.add("Trent maynard");
        emails.add("Jaiden Krause");
        emails.add("London Braun");
        emails.add("Jaiden Krause");
        emails.add("Davon Mccormick");
        emails.add("JosieFreeman");
        emails.add("Jaslyn Chavez");
        emails.add("Zaiden Harding");
        emails.add("Araceli Castaneda");
        emails.add("Jaime Wolf");
        emails.add("London Braun");
        
    }
}