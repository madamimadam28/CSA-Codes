public class Person {
    
	private String name;
	private String birthday;

    public Person (String name, String birthday)
    {
    	this.name = name;
    	this.birthday = birthday;
    }
    
     /**
     * When there is no call to the superclass, the no-argument
     * constructor is executed.
     */
     
    public Person(){
    	name = "Not set";
    	birthday = "Not set";
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
     public String getBirthday()
    {
        return name;
    }
    
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
}

public class Student extends Person {

	private int grade;
	private double gpa;

    // Notice no call to the Superclass constructor!
    public Student () {
    	this.grade = 9;
    	this.gpa = 4.0;
    }

    public int getGrade()
    {
        return grade;
    }
    
    public void setGrade(int grade)
    {
        this.grade = grade;
    }
    
    public double getGpa()
    {
        return gpa;
    }
    
    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }
}

public class StudentRunner
{
    public static void main(String[] args)
    {
        Student myStudent = new Student();
        
        // Initially we should print out the default values
        System.out.println("Initial Name: " + myStudent.getName());
        System.out.println("Initial Grade: " + myStudent.getGrade());
        
        myStudent.setName("Talisha");
        myStudent.setGrade(10);
        
        System.out.println("Updated Name: " + myStudent.getName());
        System.out.println("Updated Grade: " + myStudent.getGrade());

    }
}