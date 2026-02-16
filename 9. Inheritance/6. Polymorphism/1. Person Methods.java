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

    @Override
    public void printName(){
        System.out.print("Student ");
        super.printName();
    }

}

public class PersonTester {

    public static void main(String[] args) {
        
    Person jobs = new Person("Steve");
    Person lovelace = new Student("Ada", 12);
    
    // Since both of these are declared as Person types,
    // Java checks to see if a printName method exists.
    jobs.printName();
    lovelace.printName();

    }
}