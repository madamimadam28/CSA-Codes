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

     
    // Similar Student class to the previous examples.
    public Student (String name, String birthday, int grade, double gpa) 
    {
    	super(name, birthday);
    	this.grade = grade;
    	this.gpa = gpa; 
    }

    public int getGrade()
    {
    	return grade;
    }
    
    public double getGpa()
    {
        return gpa;
    }
    
    /** We will override the toString in the student class
     * to display name and grade
     */
     
    public String toString()
    {
        return "Name: " + super.getName() + "\nGrade: " + grade;
    }
}

public class StudentTester {

    public static void main(String[] args) {
        
        Person ryan = new Person("Ryan", "2/2/1990");
        Student emma = new Student("Emma", "7/18/2004", 11, 3.9);
         
        /**
         * Ryan is a Person object, so it will print from the
         * Person toString.
         */
        System.out.println(ryan);
        
        /**
         * Emma is a Student object, so it will print from the
         * Student toString.
         */
        System.out.println(emma);
        
    }
}