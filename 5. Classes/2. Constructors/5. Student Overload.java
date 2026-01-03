public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String school;

    /**
     * Constructors go here.
     * Check out StudentTester.java for an example of how to use
     * this constructor. Make sure your code matches the call in the
     * tester.
     */
     public Student (String fName, String lName, int grade, String attend) {
         firstName = fName;
         lastName = lName;
         gradeLevel = grade;
         school = attend;
     }
     
     public Student (String fName, String lName, int grade) {
         firstName = fName;
         lastName = lName;
         gradeLevel = grade;
         
         if (grade >= 9 && grade <= 12) {
             school = "high school";
         }
         else if (grade >= 6 && grade <= 8) {
             school = "middle school";
         }
         else {
             school = "elementary school";
         }
     }
   
   
    
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     * 
     * Modify the to string to add 'and goes to _____' at the end
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade " + gradeLevel + " and goes to " + school;
    }
    
    public String getFirstName(){
        return firstName;
    }
}
public class StudentTester
{
    public static void main(String[] args)
    {
        Student alan = new Student("Alan", "Turing", 11, "Liberty High School");
        Student ada = new Student("Ada", "Lovelace", 5);
        
        System.out.println(alan);
        System.out.println(ada);
        
    }
}
