/*Write a program with a method called passwordCheck to return if the string is a valid password. The method should have the signature shown in the starter code.

The password must be at least 8 characters long and may only consist of letters and digits. It is ok to have only letters or only digits, but it can’t have anything but letters and digits.

In your main method, prompt the user for a password and then report back as to whether the password is valid. To pass the autograder, you will need to print the boolean return value from the passwordCheck method.

Hint: Consider creating a String that contains all the letters in the alphabet and a String that contains all digits. If the password has a character that isn’t in one of those Strings, then it’s an illegitimate password! */

import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        // Prompt the user to enter their password and pass their string
        // to the passwordCheck method to determine if it is valid.
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        System.out.println(passwordCheck(password));
    }
    
    public static boolean passwordCheck(String password)
    {
        // Create this method so that it checks to see that the password
        // is at least 8 characters long and only contains letters 
        // and numbers.
        if (password.length() < 8) {
            return false;
        }
        for (int i = 0; i < password.length(); ++i) {
            char c = password.charAt(i);
            if (!(Character.isDigit(c) || Character.isLetter(c))) {
                return false;
            }
        }
        return true;
    }
}