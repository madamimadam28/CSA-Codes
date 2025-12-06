/* In this exercise, you are going to make a sample bot conversation. At this point, we don't have too much that we can do, but you are going to ask the user for their name and then use that in the constructor for the bot.



After that, you are going to simulate a conversation. You will print questions to the console and answer them by calling methods from the Bot class. (You don't actually prompt the user for any information other then their name).  Look through the Bot class to see which methods you will need, but don't modify the Bot class!



When you are finished, your output should match the output below (with the exception of your name).  Remember to print a blank line, you can use

System.out.println();


Sample Output:



Hello! What is your name? 

Alice

Hello Alice! My name is UNIVAC!

Are you having fun programming today?

You can ask me about the first computer bug, or

which countries use the imperial measurement system.

I can even convert miles to kilometers!



Tell me Bot, which countries use the imperial system?

There are 3 countries that use the imperial measurement system.

They are the United States of America, Liberia, and Myanmar



Tell me Bot, what was the first computer bug?

It's said that the first computer bug was found 

on September 9, 1945 by Harvard technicians who 

found a moth in their computer!



It's always nice to chat!

Have a great day! */

public class Bot {

    private String name;

    // Constructor
    public Bot (String yourName){
        name = yourName;
    }

    // Prints a greeting
    public void greeting(){
        System.out.print("Hello ");
        System.out.print(name);
        System.out.println("! My name is UNIVAC!");
        System.out.println("Are you having fun programming today?");
    }

    // Prints the help menu
    public void help(){
        System.out.println("You can ask me about the first computer bug, or");
        System.out.println("which countries use the imperial measurement system.");
        System.out.println("I can even convert miles to kilometers!");
    }

    // Prints the origin of the first computer bug
    public void firstBug(){
        System.out.println("It's said that the first computer bug was found ");
        System.out.println("on September 9, 1945 by Harvard technicians who ");
        System.out.println("found a moth in their computer!");
    }

    // Prints a list of countries that use the imperial system
    public void imperialCountries() {
        System.out.print("There are 3 countries that use the imperial ");
        System.out.println("measurement system.");
        System.out.print("They are the United States of America, ");
        System.out.println("Liberia, and Myanmar");
    }

    // Prints a good-bye message
    public void goodbye(){
        System.out.println("It's always nice to chat!");
        System.out.println("Have a great day!");
    }

    // Prints my favorite number and how close my number is to yours
    public void favoriteNumber(int yourNumber){
        System.out.println("My favorite number is 3.");
        System.out.print("That is ");
        System.out.print(yourNumber - 3);
        System.out.println(" away from your number");
    }

    // Converts miles to kilometers
    public double milesToKilometers(double miles){
        double kilometers = miles / 0.6214;
        return kilometers;
    }

}

import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {

        //Put your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name = input.nextLine();
        
        Bot bot = new Bot(name);
        bot.greeting();
        bot.help();
        System.out.println();

        System.out.println("Tell me Bot, which countries use the imperial system?");
        bot.imperialCountries();
        System.out.println();

        System.out.println("Tell me Bot, what was the first computer bug?");
        bot.firstBug();

        bot.goodbye();
    }
}