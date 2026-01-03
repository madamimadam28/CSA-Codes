/* In this exercise, complete the method getMostImprovedStudent in the Classroom class, as well as the method getExamImprovement in the Student class.

To find the most improved student:

1. Find the difference between successive exams
2. Sum the differences
For example, if the exam scores were 90, 75, and 84, you would compute the improvement by calculating

1. 75 - 90 = -15
2. 84 - 75 = 9
3. -15 + 9 = -6
The negative result indicates that this student did not improve as the term went on.

You’ll want to keep a running total of the differences rather than sum them at the end. Think carefully about what the bounds of your loop should be to prevent your loop from running off the end of your exams array.

The toString method in the Student class will print the student names with their respective grade levels. Then print who the most improved student was after this.

Sample output:

Ada Lovelace is in grade: 12
Alan Turing is in grade: 11
The most improved student is Ada Lovelace*/

public class Student
{
    private static final int NUM_EXAMS = 4;
    
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;
    
    private int[] exams;
    private int numExamsTaken;

    // Constructor
    public Student(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        exams = new int[NUM_EXAMS];
        numExamsTaken = 0;
    }
    
    // Implement this method!
    // Returns the sum of the differences between exams
    // Example: Assume exams = {54, 67, 89, 95}
    //          Improvement = (67 - 54) + (89 - 67) + (95 - 89) = 41
    public int getExamImprovement()
    {
    // your code goes here! 
        int sum = 0;
        for (int i = 0; i < numExamsTaken - 1; ++i) {
            sum += exams[i + 1] - exams[i];
        }
        return sum;
    }
    
    public String getName()
    {
        return firstName + " " + lastName;
    }
    
    public void addExamScore(int score)
    {
        exams[numExamsTaken] = score;
        numExamsTaken++;
    }
    
    // This is a setter method to set the GPA for the Student.
    public void setGPA(double theGPA)
    {
        gpa = theGPA;
    }
    
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}

public class Classroom
{
    Student[] students;
    int numStudentsAdded;
    
    public Classroom(int numStudents)
    {
        students = new Student[numStudents];
        numStudentsAdded = 0;
    }
    
    // Implement this method!
    // Returns the Student with the highest examImprovement score
    public Student getMostImprovedStudent()
    {
    // your code goes here! 
        int maxi = -1000;
        Student mostImproved = null;
        for (int i = 0; i < numStudentsAdded; ++i) {
            Student s = students[i];
            int imp = s.getExamImprovement();
            
            if (imp > maxi) {
                maxi = imp;
                mostImproved = s;
            }
        }
        return mostImproved;
    }
    
    public void addStudent(Student s)
    {
        students[numStudentsAdded] = s;
        numStudentsAdded++;
    }
    
    public void printStudents()
    {
        for(int i = 0; i < numStudentsAdded; i++)
        {
            System.out.println(students[i]);
        }
    }
}

public class ClassroomTester 
{
    public static void main (String[] args)
    {
        Classroom c = new Classroom(2);
        
        Student ada = new Student("Ada", "Lovelace", 12);
        ada.addExamScore(44);
        ada.addExamScore(65);
        ada.addExamScore(77);

        Student alan = new Student("Alan", "Turing", 11);
        alan.addExamScore(38);
        alan.addExamScore(24);
        alan.addExamScore(31);

        // add students to classroom
        c.addStudent(ada);
        c.addStudent(alan);
        c.printStudents();
        
        System.out.println(ada.getExamImprovement());
        System.out.println(alan.getExamImprovement());
        
        Student mostImproved = c.getMostImprovedStudent();
        System.out.println("The most improved student is " + mostImproved.getName());
    }
}