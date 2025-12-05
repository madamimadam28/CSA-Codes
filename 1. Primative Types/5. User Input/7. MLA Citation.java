/*When you distribute information you found from another source, you must always cite your source.

The MLA format for a formal citation for a book is as follows:

Last name, First name of author. Title of the Book.
Publisher, Year of publication.

Write a citation generator. Your program should ask for

The author’s name in the form “Last Name, First Name”
The date the book was published
The title of the book
The publisher
Then print out the information in the format shown above. Pay attention to the periods and commas! */

import java.util.Scanner;

public class Citation
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the author's name as 'Last name, First name': ");
        String name = input.nextLine();

        System.out.println("Enter the year the book was published: ");
        String year = input.nextLine();

        System.out.println("Enter the title of the book: ");
        String title = input.nextLine();
        
        System.out.println("Enter the publisher of the book: ");
        String publisher = input.nextLine();

        System.out.println(name + ". " + title + ".\n" + publisher + ", " + year + ".");
    }
}