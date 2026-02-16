/* In this problem, you are going to create an Employee superclass and an HourlyEmployee subclass.

The Employee class will hold the employee’s name and annual salary. You should have getters for both instance variables, but only a setter for the salary.

In the HourlyEmployee class, you will add an hours instance variable as well as a method to set and get the hourly salary. You are not storing the hourly salary, 
but rather converting it to an annual salary.

To convert an hourly salary to an annual salary, multiply the hourly rate by the number of hours per week and then by 52. 
You will need to do the reverse to get the hourly salary.

Both classes should have a toString and examples are in the starter code.

Be sure to test your classes in the EmployeeTester class! */

public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double annualSalary){
        this.name = name;
        this.salary = annualSalary;
    }

    public String getName(){
        return name;
    }

    public double getAnnualSalary(){
        return salary;
    }

    public void setAnnualSalary(double annualSalary){
        salary = annualSalary;
    }

    /**
     * Example output:
     * Mr. Karel makes $75000.0 per year
     */
     
    public String toString(){
        return name + " makes $" + salary + " per year";
    }
}

public class HourlyEmployee extends Employee {

    private double hoursPerWeek;

    // Call the Employee constructor and pass it a calculated annual salary
    
    public HourlyEmployee(String name, double hourlySalary, double hoursPerWeek){
        super(name, hourlySalary * hoursPerWeek * 52);
        this.hoursPerWeek = hoursPerWeek;
    }
    
    // Get the annual salary from the superclass and convert it back
    // to hourly.
    public double getHourlySalary(){
        return super.getAnnualSalary() / 52;
    }

    // Use the hourly salary input and convert it
    // to the annual salary and update in the superclass
    
    public void setHourlySalary(double hourlySalary){
        super.setAnnualSalary(hourlySalary * 52);
    }

    /**
     * Example output:
     * Mike makes $18.0 per hour
     */
     
    public String toString(){
        return super.getName() + " makes $" + getHourlySalary() + " per hour";
    }
}

public class EmployeeTester
{
    public static void main(String[] args)
    {
        // Start here!
        Employee e1 = new Employee("Allah", 500);
        HourlyEmployee e2 = new HourlyEmployee("Jeff", 500, 10);
        
        System.out.println(e1);
        System.out.println(e2);
    }
}