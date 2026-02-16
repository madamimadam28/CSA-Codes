public class Person {
    
	private String name;

    public Person (String name){
        this.name = name;
    }

  	public void printName(){
        System.out.println("Name: " + name);
    }

}

public class Student extends Person {
    
    private int grade;

    public Student(String name, int grade)
    {
        super(name);
        this.grade = grade;
    }

    public void printGrade(){
        System.out.print("Grade: " + grade);
    }

}

public class PersonTester {

    public static void main(String[] args) {
        
    Person jobs = new Person("Steve");
    Student lovelace = new Student("Ada", 12);
    
    /**
     * When we run this code as is, we get an error.
     * Since lovelace is a declared as a Person type
     * and printGrade only exists in the Student class
     * the program doesn't compile.
     * 
     * To correct this, we can change line 6 to make
     * lovelace a Student reference type.
     */
     
    jobs.printName();
    lovelace.printGrade();

    }
}