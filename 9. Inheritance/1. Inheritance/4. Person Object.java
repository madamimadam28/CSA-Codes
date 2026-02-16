/* In this exercise, you are going to use the Person and Student classes to create two objects, then print out all of the available information from each object.

Your tasks
Create a Person object with the following information:
Name: Wolfgang Amadeus Mozart
Birthday: January 27, 1756
Create a Student object with the following infromation:
Name: Johann Nepomuk Hummel
Birthday: November 14, 1778
Grade: 10
GPA: 4.0
You do not need to modify the Person or Student class. */

public class Person {

    private String name;
    private String birthday;

    public Person (String name, String birthday)
    {
        this.name = name;
        this.birthday = birthday;
    }

    public String getBirthday(){ 
        return birthday;
    }

    public String getName(){
        return name;
    }


}

public class Student extends Person {

    private int grade;
    private double gpa;

    public Student(String name, String birthday, int grade, double gpa){
        super(name, birthday);
        this.grade = grade;
        this.gpa = gpa;
    }

    public int getGrade(){
        return grade;
    }

    public double getGpa(){
        return gpa;
    }
}

public class PersonRunner
{
    public static void main(String[] args)
    {
        // Start here!
        Person p = new Person("Wolfgang Amadeus Mozart", "January 27, 1756");
        System.out.println(p.getName());
        System.out.println(p.getBirthday());
        Student s = new Student("Johann Nepomuk Hummel", "November 14, 1778", 10, 4.0);
        System.out.println(s.getName());
        System.out.println(s.getBirthday());
        System.out.println(s.getGrade());
        System.out.println(s.getGpa());
    }
}