/**
 * The Student class holds data about a student.
 * The fields are firstName, lastName, and gradeLevel.
 */
public class Student
{
    // Attributes
    private String firstName;
    private String lastName;
    private int gradeLevel;
    
    // Constructor
    // Even though Strings are objects, 
    // they are still passed by value
    // The values of fName, lName, and grade will be copied to
    // firstName, lastName, and gradeLevel
    public Student(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
    }
    
    // Allows the object to be printed
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}

public class StudentTester
{
    public static void main(String[] args)
    {
        Student alan = new Student("Alan", "Turing", 11);
        Student ada = new Student("Ada", "Lovelace", 12);
        
        System.out.println(alan);
        System.out.println(ada);
    }
}