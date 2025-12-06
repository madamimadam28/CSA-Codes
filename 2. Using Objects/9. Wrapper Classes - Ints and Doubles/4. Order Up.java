/* This program is the beginning of an automated order machine. You are programming the piece that gets the number of the order from the label sent to you by the ordering machine.

The ordering machine is simulated with user input. It sends a full label, such as “3. Veggie Burger”.



Fill in the missing code
Your task is to get the number out of the string. To do this, you need to isolate the number by using substring. Then use Integer.valueOf, a static method of Integer that takes a String and returns the integer value contained in the String.

The final program should look something like this

1. Hamburger
2. Cheeseburger
3. Veggie Burger
4. Nachos
5. Hot Dog

Enter label: 
5. Hot Dog
Customer ordered number 5 */

import java.util.Scanner;

public class PickupWindow
{
    public static void main(String[] args)
    {
        // Create scanner object
        Scanner input = new Scanner(System.in);
        
        // Display menu
        String menu = "1. Hamburger\n2. Cheeseburger\n3. Veggie Burger\n4. Nachos\n5. Hot Dog\n";
        
        System.out.println(menu);
        
        // Get customer order
        System.out.println("Enter label: ");
        String customerOrder = input.nextLine();
        
        // Use substring to get the first character (the number)
        String combo = customerOrder.substring(0, 1);
        
        // Create an Integer object by using the static
        // method Integer.valueOf(someString)
        // to turn the string into an Integer
        
        Integer comboNumber = Integer.valueOf(combo);
        
        // Print out what the customer ordered
        System.out.println("Customer ordered number " + comboNumber);
        
        
    }
}