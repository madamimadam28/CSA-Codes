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
     
    @Override
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
    
    /**
     * To Override, we need to have the same method signature. Since we
     * are Overriding the object class, we need to use an Object
     * as the formal parameter. Then we need to cast that object to
     * a Student to have access to the methods we need.
     */ 
    @Override
    public boolean equals(Object other) 
    {
        Student otherStudent = (Student) other;
        return super.getName().equals(otherStudent.getName()) 
            && super.getBirthday().equals(otherStudent.getBirthday())
            && this.grade == otherStudent.getGrade();
    }
}

public class StudentTester
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Isabella", "4/15/2005", 8, 4.0);
        Student student2 = new Student("Destiny", "7/7/2005", 8, 3.9);
        Student student3 = new Student("Isabella", "4/15/2005", 8, 4.0);
        
        System.out.println("Student 1 = Student 2? " + student1.equals(student2));
        System.out.println("Student 1 = Student 3? " + student1.equals(student3));
    }
}