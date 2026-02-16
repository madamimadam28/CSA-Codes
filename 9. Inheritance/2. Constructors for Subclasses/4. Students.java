/* In this exercise, we are going to look at creating a Superclass / Subclass relationship for Students.

Our superclass will be the Student class and contain the following instance variables:

String name - Student’s first and last name
int id - Student’s ID number
double gpa - Student’s GPA
Our subclass will be StudentAthlete and contain the following instance variables:

String sport - Name of sport student plays
String level - The level at which the student plays (varsity, junior varsity, etc)
For this exercise, you will focus on the constructors for both classes. 
Remember that your subclass constructor needs to call the superclass constructor, so make sure you have the parameters to do that.

Note: For the autograder, your constructor needs to list the parameters in the order they are listed above.

The classes will have getters and a toString, but no setters. You can use these to test, but do not need to alter them.

Once completed, create two students as noted in the StudentTester class. */

public class Student
{
    private String name;
    private int id;
    private double gpa;
    
   // Constructor goes here
   public Student(String theName, int theId, double theGpa) {
       name = theName;
       id = theId;
       gpa = theGpa;
   }
   
    public String getName(){
       return name;
    }
   
    public int getID(){
       return id;
    }
    
    public double getGPA(){
        return gpa;
    }
   
    public String toString(){
        return name + " (" + id + ")";
    }
}

public class StudentAthlete extends Student
{
    private String sport;
    private String level;
    
   // Add the constructor here
   public StudentAthlete(String name, int id, double gpa, String theSport, String theLevel){
       super(name, id, gpa);
       sport = theSport;
       level = theLevel;
   }
   
   public String getSport(){
       return sport;
   }
   
   public String getLevel(){
       return level;
   }
   
   
    @Override
    public String toString(){
        return super.toString() + " plays " + sport;
    }
}

public class StudentTester
{
    public static void main(String[] args)
    {
        
        /**
         * Create a student with id # 123987, GPA: 2.56
         */
         Student student = new Student("Jeff", 123987, 2.56);
         
         /**
         * Create a student athlete with id # 987456, GPA: 3.47,
         * who plays lacrosse for the varsity team 
         */
         StudentAthlete athlete = new StudentAthlete("Jamal", 987456, 3.47, "lacrosse", "varsity");
         
         // Print out both objects
         System.out.println(student);
         System.out.println(athlete);
    }
}