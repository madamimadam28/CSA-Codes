/* You are now going to complete your Choose Your Own Adventure vacation planner that you outlined in the previous exercise.

You should start by copying over your code from the previous exercise and then start filling in the details. You will be using nested if statements to help choose the path to one of your activities.

Hint:
It can be hard to predict what the user will enter, so you may want to cast the user input to uppercase and then just look at the first letter to help analyze their input. For example:

System.out.print("Do you want to travel to [P]oland or [J]apan? ");
String firstChoice = input.nextLine();
if (firstChoice.toUpperCase().substring(0,1).equals("P"))
... */

import java.util.Scanner;

public class CYOA
{
    public static void main(String[] args)
    {
        // Start by importing your code from the previous exercise
        Scanner input = new Scanner(System.in);
        
        // France or Korea
        System.out.print("Do you want to travel to [F]rance or [K]orea? ");
        String firstChoice = input.nextLine();
        
        // Choose France
        if (firstChoice.toUpperCase().substring(0,1).equals("F")) {
            
            // Visit the Louvre or eat a croissant
            System.out.print("Do you want to [V]isit the Louvre or [E]at a croissant? ");
            String secondChoice = input.nextLine();
            
            // Eat a croissant
            if (secondChoice.toUpperCase().substring(0,1).equals("E")) {
            
                // You ate a yummy croissant
                System.out.print("You ate a yummy croissant");
            }
                
            // Visit the Louvre
            else if (secondChoice.toUpperCase().substring(0,1).equals("V")) {
            
                // You visited the large art exhibit and had a lot of fun
                System.out.print("You visited the large art exhibit and had a lot of fun");
            }
        }
                    
        // Choose Korea
        else if (firstChoice.toUpperCase().substring(0,1).equals("K")) {
        
            // Go to a K-Pop concert or eat spicy stuff
            System.out.print("Do you want to [K]-Pop or [E]at spice? ");
            String secondChoice = input.nextLine();
            
            // Go to K-pop concert
            if (secondChoice.toUpperCase().substring(0,1).equals("K")) {
            
                // You had fun being a K-Pop Stan
                System.out.print("You had fun being a K-Pop stan");
            }
            
            // Eat spicy stuff
            if (secondChoice.toUpperCase().substring(0,1).equals("E")) {
            
                // You burned your mouth enjoying Korean food
                System.out.print("You burned your mouth enjoying Korean food");
            }
        }
    }
}