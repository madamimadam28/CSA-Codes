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
}

public class HighSchoolStudent extends Student
{
    private int serviceHours;
  
    public HighSchoolStudent(String name, String birthday, int grade, 
            double gpa, int serviceHours)
    {
        super(name, birthday, grade, gpa);
        this.serviceHours = serviceHours;
    }
    
    public int getServiceHours()
    {
        return serviceHours;
    }
}

public class PersonTester {

    public static void main(String[] args) {
        
        Person myPerson = new Person("Tyler", "11/12/1999");
        HighSchoolStudent myStudent = new HighSchoolStudent("Emma", "7/18/2004", 11, 3.9, 65);
        
        //From Person class 
        System.out.println("Student Name: " + myStudent.getName());
        
        //From Student class
        System.out.println("Grade: " + myStudent.getGrade());
        
        //From HighSchoolStudent class
        System.out.println("Serveice Hours Completed: " 
            + myStudent.getServiceHours());
        
        
        /**
         * With the person, we only have access to methods from 
         * the Person class.
         */
         
        System.out.println("Person Name: " + myPerson.getName());
    }
}