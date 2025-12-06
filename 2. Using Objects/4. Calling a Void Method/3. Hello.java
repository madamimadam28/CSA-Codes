/*As a twist on the Hello World exercise, you are going to be the end user of the Hello class. This class is designed to greet the user in a variety of world languages.

For this task, complete the following

Use the Scanner class to ask the user for their name
Create a Hello object by passing the name to the constructor
Call at least 3 methods from the Hello class to print the greeting in 3 different languages.
Remember to write your code in the HelloTester class, but make sure you take a look at the Hello class so that you know the names of the methods you need to use. */


public class Hello {

    private String name;

    public Hello (String yourName){
        name = yourName;
    }

    public void english(){
        System.out.print("Hello ");
        System.out.print(name);
        System.out.println("!");
    }

    public void spanish(){
        System.out.print("Hola ");
        System.out.print(name);
        System.out.println("!");
    }

    public void french(){
        System.out.print("Bonjour ");
        System.out.print(name);
        System.out.println("!");
    }

    public void german(){
        System.out.print("Hallo ");
        System.out.print(name);
        System.out.println("!");
    }

    public void russian(){
        System.out.print("Privet ");
        System.out.print(name);
        System.out.println("!");
    }

    public void chinese(){
        System.out.print("Ni hao ");
        System.out.print(name);
        System.out.println("!");
    }
}

import java.util.Scanner;

public class HelloTester
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Whant is your name? ");
        String name = input.nextLine();
        Hello hi = new Hello(name);
        hi.english();
        hi.spanish();
        hi.chinese();
    }
}