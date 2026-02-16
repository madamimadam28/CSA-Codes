/* A teacher wants to create a list of students in her class.

To accomplish this, you are going to use the Roster class to hold a list of students. 
Create a static ArrayList called classList that holds a Student object. 
Inside the addStudent method, you will create a new Student using the Student class, then add them to the classList ArrayList. */

public class Student
{
    /*
     * This class is complete. You do not need
     * to add anything.
     */
    private String name;
    private int grade;
    
    public Student(String name, int grade)
    {
        this.name = name;
        this.grade = grade;
    }
    
    public String getName()
    {
        return this.name;
    }
}

import java.util.ArrayList;

public class Roster {
    
    // Implement the student ArrayList
    private static ArrayList<Student> classList = new ArrayList<Student>();
    
    public static void addStudent(String name, int grade)
    {
        // Create Student
        Student student = new Student(name, grade);
        
        // Add to classList
        classList.add(student);
    }
    
    /*Don't change the code in this method!
    This method will print out all the Student names in the classList Array
    */
    public static String printClassList()
    {
        String names = "";
        for(Student name: classList)
        {
            names+= name.getName() + "\n";
        }
        return "Student Class List:\n" + names;
    }
    
}

public class ClassListTester
{
    public static void main(String[] args)
    {
        //You don't need to change anything here
        Roster.addStudent("Alan", 11);
        Roster.addStudent("Alex", 10);
        Roster.addStudent("Anita", 12);
        System.out.println(Roster.printClassList());

    }
}