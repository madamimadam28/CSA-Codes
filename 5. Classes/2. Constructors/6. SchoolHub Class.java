/* We are going to use the Student class that we completed in the last exercise and add a new SchoolClub class. Start by copying over your Student class from the last exercise.

After that, add the constructor for the SchoolClub class. For this class, your constructor should take a Student object for the leader and a String club name (in that order). You should also initialize the number of members at zero in the constructor.

Test your code with the StudentTester class. This is the same as the last exercise, so you will need to add a statement to create a club and then print it out. */

public class SchoolClub
{

    private Student leader;
    private String name;
    private int numMembers;

    /* Add your constructor here
     * Constructor should take a leader and club name, then set
     * numMembers to 0.
     */
    public SchoolClub(Student stu, String club) {
        leader = stu;
        name = club;
        numMembers = 0;
    }

    public void addMember() {
        numMembers++;
    }

    public String toString(){
        return leader.getFirstName() + " is the leader of the " + name + " club.";
    }
}

public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String school;

    /**
     * Constructors go here.
     * Copy over your constructors from the previous exercise. 
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
        
        SchoolClub club = new SchoolClub(alan, "Math Club");
        System.out.println(club);
    }
}