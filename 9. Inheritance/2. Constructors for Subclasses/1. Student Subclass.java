public class Person {
    
	private String name;
	private String birthday;

    public Person (String name, String birthday)
    {
    	this.name = name;
    	this.birthday = birthday;
    }

    public String getName()
    {
    	return name;
    }
    
    public String getBirthday()
    {
        return birthday;
    }
    
    public String toString()
    {
        return "Name: " + name + "\nBirthday: " + birthday;
    }
}

public class Student extends Person {
    
	private int grade;
	private double gpa;

    /**
     * The Student object only stores grade and gpa. Notice
     * how the contructor takes all 4 variables and passes
     * two of them up to the Person superclass
     */
     
    public Student (String name, String birthday, int grade, double gpa) 
    {
    	super(name, birthday); //Passes to Superclass
    	this.grade = grade; //Stored in Student object
    	this.gpa = gpa; //Stored in Student object
    }

    public int getGrade()
    {
    	return grade;
    }
    
    public double getGpa()
    {
        return gpa;
    }
}

public class PersonTester {

    public static void main(String[] args) {
        
        /**
         * The Student subclass constructor takes all the information
         * for both the Student object and the Person object
         */
         
        Student jackson = new Student("Jackson", "11/21/2003", 12, 3.6);
        Student emma = new Student("Emma", "7/18/2004", 11, 3.9);
         
        System.out.println("Student Name: " + jackson.getName());
        System.out.println("Grade: " + jackson.getGrade());
        
        System.out.println("Student Name: " + emma.getName());
        System.out.println("Grade: " + emma.getGrade());
        
    }
}