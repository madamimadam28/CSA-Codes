public class Person {
    
    private String name;
    
    public Person (String name)
    {
        this.name = name;
    }
    
     public String getName(){
        return name;
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
        System.out.println("Grade " + grade);
    }
}

public class Worker extends Person {
    
    private double salary;
    
    public Worker(String name, double salary)
    {
        super(name);
        this.salary = salary;
    }
    
    public void printSalary(){
        System.out.println("Salary: $" + salary);
    }
}

public class PersonRunner {
    
    public static void main(String[] args) 
    {
        Person jobs = new Person("Steve");
        Person lovelace = new Student("Ada", 12);
        Person turing = new Worker("Alan", 50000);

        greeting(jobs);
        greeting(lovelace);
        greeting(turing);
    }
    
    /**
     * In this example, we are using the generic
     * superclass as a formal parameter.
     * This allows us to pass any object 
     * declared as a Person into the method.
     */
    
    private static void greeting(Person person){
        System.out.println("Hello " + person.getName());
    }
}