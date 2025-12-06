/* The class RosterOrganizer helps organizes a class roster by determining if the instance variable student comes before, after, or is equal to another student’s name.

You should implement the three blank methods

placeBefore
placeAfter
isEqual
You should use the methods compareTo and equals to implement these methods. Remember a boolean is a true or false value. To create a boolean variable, you can use any relational operator.

For example, remember you can do things like

boolean isOlder = myAge > yourAge;
boolean likesIceCream = answer.equals("yes"); */

public class RosterOrganizer
{
    private String student;
    
    public RosterOrganizer(String studentName)
    {
        student = studentName;
    }
    
    // Returns the word
    public String getStudent()
    {
        return student;
    }
    
    // Returns true if student comes
    // before otherStudent.
    // Returns false otherwise.
    public boolean placeBefore(String otherStudent)
    {
        return student.compareTo(otherStudent) < 0;
    }
    
    
    // Returns true if student comes
    // after otherStudent.
    // Returns false otherwise.
    public boolean placeAfter(String otherStudent)
    {
        return student.compareTo(otherStudent) > 0;
    }
    
    
    // Returns true if student is equal to otherStudent.
    // Returns false otherwise.
    public boolean isEqual(String otherStudent)
    {
        return student.equals(otherStudent);
    }
    
    
}

import java.util.Scanner;

public class RosterTester
{
    public static void main(String[] args)
    {
        RosterOrganizer currentStudent = new RosterOrganizer("Jose");
        
        String name = "Silu";
        
        System.out.println(currentStudent.getStudent() + " place before " + name + "?");
        System.out.println(currentStudent.placeBefore(name));
        System.out.println(currentStudent.getStudent() + " place after " + name + "?");
        System.out.println(currentStudent.placeAfter(name));
        System.out.println(currentStudent.getStudent() + " is equal to  " + name + "?");
        System.out.println(currentStudent.isEqual(name));
        
        
        // Notice that the capitalization matters
        name = "adrian";
        System.out.println("\n\n");
        System.out.println(currentStudent.getStudent() + " place before " + name + "?");
        System.out.println(currentStudent.placeBefore(name));
        System.out.println(currentStudent.getStudent() + " place after " + name + "?");
        System.out.println(currentStudent.placeAfter(name));
        System.out.println(currentStudent.getStudent() + " is equal to  " + name + "?");
        System.out.println(currentStudent.isEqual(name));
        
        
        
        System.out.println("\n\n");
        System.out.print("Enter a name: ");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println(currentStudent.getStudent() + " place before " + name + "?");
        System.out.println(currentStudent.placeBefore(name));
        System.out.println(currentStudent.getStudent() + " place after " + name + "?");
        System.out.println(currentStudent.placeAfter(name));
        System.out.println(currentStudent.getStudent() + " is equal to  " + name + "?");
        System.out.println(currentStudent.isEqual(name));

    }
}