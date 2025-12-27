/*Write a program called Teen that takes a sentence and returns a new sentence based on how a teenager might text the sentence. The method that creates the new string should be called teenTalk and should have the signature shown in the starter code.

The way to do that is to replace all the following punctuation symbols in the original sentence with “!!”. The symbols to replace are ‘.’ and ‘!’.

For example, teenTalk(“That is so funny.”) would return “That is so funny!!”

Sample output:

Sonequa Martin-Green is in grade 10 and wants to send this text:
Enter a text: 
Hello World. Wouldn't it be cool to visit outer space!?

The modified text would be: 
Hello World!! Wouldn't it be cool to visit outer space!!? */

public class Teen 
{
    private String firstName;
    private String lastName;
    private int grade;

    // Constructor to make a teen with a first and last name, grade in school 
    
    // This defines the state of the teen.
    public Teen(String theFirstName, String theLastName, int theGrade)
    {
        firstName = theFirstName;
        lastName = theLastName;
        grade = theGrade;
    }
    
    // toString method to print out the state of teen object
    public String toString()
    {
        return firstName + " " + lastName + " is in grade " + grade + " and wants to send this text:";
    }
    
    // Create this method so that it changes the text message 
    // by replacing '.' and '!' with "!!".
    public String teenTalk(String text)
    {
        String res = "";
        for(int i = 0; i < text.length(); i++)
        {
            if(text.substring(i, i+1).equals(".") || text.substring(i, i+1).equals("!"))
            {
                res += "!!";
            }
            else {
                res += text.substring(i, i+1);
            }
        }
        return res;
    }
    
}

import java.util.Scanner;

public class TeenTester
{
    public static void main(String[] args)
    {
        // Create a new Teen object and print it out; see the Teen class file
        // to see how the constructor and toString method work.
        Teen myFriend = new Teen("Sonequa", "Martin-Green", 10);
        System.out.println(myFriend.toString());
        
        // Ask the user to input a text message
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text = input.nextLine();
        
        // Call teenTalk method to translate the message to teen talk
        System.out.println("\nThe modified text would be: ");
        System.out.println(myFriend.teenTalk(text));
    }
}