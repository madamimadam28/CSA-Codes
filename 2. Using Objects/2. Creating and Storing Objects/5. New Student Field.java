/*This program starts with the Student class from earlier. Add a new instance variable (or field) that represents the number of clubs in which the student is a member.

Choose an appropriate datatype, and don’t forget to update the constructor! The toString method has already been updated for you.*/

public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    
    // Add an instance variable called numClubs here.
    private int numClubs;
    /**
     * This is a constructor.  A constructor is a method
     * that creates an object -- it creates an instance
     * of the class. What that means is it takes the input
     * parameters and sets the instance variables (or fields)
     * to the proper values.
     * 
     * Check out StudentTester.java for an example of how to use
     * this constructor and how to add numClubs to the constructor. 
     */
    public Student(String fName, String lName, int grade, int clubs)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        numClubs = clubs;
    }
    
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade " + gradeLevel + 
            " and is in " + numClubs + " club(s).";
    }
}

public class StudentTester
{
    public static void main(String[] args)
    {
        Student alan = new Student("Alan", "Turing", 9, 1);
        Student ada = new Student("Ada", "Lovelace", 11, 5);
        
        System.out.println(alan);
        System.out.println(ada);
    }
}