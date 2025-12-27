/*To help verify the user’s identity, a program takes a password (set by the user) and a secret code (set by the company). You can see the variable storing the secret code in the program.

Write a program that asks the user for their password and the secret code.

Create a String that concatenates the user’s password with the secret code given in the variable companyCode.
Create another String that concatenates the user’s password with the secret code the user provided.

Then, print out whether the strings match.
If they do match, print “Access granted”
If they don’t match, print the result of concatenating the user’s input, then “is denied”.

Here are a few sample program runs:

Sample Program 1:

Enter your password: 
elm
Enter the company's secret code: 
1234
elm1234 is denied
Sample Program 2:

Enter your password: 
oaktree
Enter the company's secret code: 
1298
Access granted */

import java.util.Scanner;
public class ThreeStrings
{
    public static void main(String[] args)
    {
        // The company's secret code
        // DO NOT change this value
        String companyCode = "1298";
        
        
        // Use comments to organize your logic before you start coding
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password:");
        String pass = input.nextLine();
        System.out.println("Enter the company's secret code: ");
        String code = input.nextLine();
        
        if (code.equals(companyCode)) {
            System.out.println("Access granted");
        }
        else {
            System.out.println(pass + code + " is denied");
        }
    }
}