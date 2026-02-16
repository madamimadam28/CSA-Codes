/* Now that the classList Array has been implemented, we need to create methods to access the list items.

Create the following static methods for the Roster class:

getLastStudent() - returns the name of the last student in the classList array.
getClassSize() - returns the size of the classList
addStudent(int index, String name, int grade) - adds a new student to the classList at index index.
getStudent(int index) - returns the name of a student at the index specified. */

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

public class Roster
{
    // Implement the student ArrayList 
    // or copy from previous exercise
    private static ArrayList<Student> classList = new ArrayList<Student>();
    
    public static void addStudent(String name, int grade)
    {
        // Create Student
        Student student = new Student(name, grade);
        
        // Add to classList
        classList.add(student);
    }
    
    
    //Add the static methods here:
    public static String getLastStudent() {
        Student student = classList.get(classList.size() - 1);
        return student.getName();
    }
    
    public static int getClassSize() {
        return classList.size();
    }
    
    public static void addStudent(int index, String name, int grade) {
        Student student = new Student(name, grade);
        classList.add(index, student);
    }
    
    public static String getStudent(int index) {
        return classList.get(index).getName();
    }


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
        //You don't need to change anything here, but feel free to add more Students!
        Roster.addStudent("Alan", 11);
        Roster.addStudent("Alex", 10);
        Roster.addStudent("Anita", 12);
        System.out.println(Roster.printClassList());
        
        System.out.println("Last Student: " + Roster.getLastStudent());
        System.out.println("First Student: " + Roster.getStudent(0));
    
        System.out.println();
        Roster.addStudent(2, "Trevor", 12);
        System.out.println(Roster.printClassList());
        System.out.println("Class Size: " + Roster.getClassSize());
    }
}