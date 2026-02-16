/* In this lesson, we are going to create an Assignment superclass with a Test and Project subclass.

Assignment class
The Assignment class should have the following four instance variables:

String name
String dueDate
double availablePoints
double earnedPoints
The constructor heading should be:

public Assignment(String name, String dueDate, double availablePoints, double earnedPoints)
Test class
The Test class should have the following instance variable:

String testType
The constructor heading should be:

public Test(String name, String dueDate, double availablePoints, double earnedPoints, String testType)
Project class
The Project class should have the following instance variables:

boolean groups
boolean presentation
The constructor heading should be:

public Project(String name, String dueDate, double availablePoints, double earnedPoints, boolean hasGroups, boolean hasPresentation)
Getters for these boolean variables should be named as follows:

hasGroups
hasPresentation
The setters should be named as follows:

setGroups
setPresentation
Each class should have getters and setters for each of its instance variables.

AssignmentRunner class
The AssignmentRunner should loop and prompt users for an assignment name until they enter exit. 
After getting the name, it should prompt the user for each of the pieces of information needed to create either a test or a project.

Once the user has finished entering information, the program should call a static method to print out a summary of the grades. 
Print each assignment’s name and score as a percentage (pointsEarned / availablePoints * 100).

Note: Remember that the Scanner nextInt(), nextBoolean(), and nextDouble() lines only read part of the line. 
Don’t forget to use a nextLine() before reading a new string! Check out the slides for lesson 1.6 starting on slide 21 for more details.
Lesson 1.6 Slides

Sample Output
Enter the assignment's name (exit to quit): Unit 4 Test
Enter the due date: 5/1/2022
How many points is the assignment worth? 25
How many points were earned? 20
Is this a (T)est or a (P)roject? T
What type of test is it? multiple choice

Enter the assignment's name (exit to quit): Hello World
Enter the due date: 1/12/2022
How many points is the assignment worth? 5
How many points were earned? 5
Is this a (T)est or a (P)roject? P
Does this project require (true/false) ... 
Groups? false
A presentation? true

Enter the assignment's name (exit to quit): Final Exam
Enter the due date: 6/2/2022
How many points is the assignment worth? 100
How many points were earned? 87
Is this a (T)est or a (P)roject? T
What type of test is it? programming

Enter the assignment's name (exit to quit): exit
Unit 4 Test - 80.0
Hello World - 100.0
Final Exam - 87.0 */

public class Assignment
{
    private String name;
    private String dueDate;
    private double availablePoints;
    private double earnedPoints;
    
    public Assignment(String name, String dueDate, double availablePoints, double earnedPoints) {
        this.name = name;
        this.dueDate = dueDate;
        this.availablePoints = availablePoints;
        this.earnedPoints = earnedPoints;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDueDate() {
        return dueDate;
    }
    
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    
    public double getAvailablePoints() {
        return availablePoints;
    }
    
    public void setAvailablePoints(double availablePoints) {
        this.availablePoints = availablePoints;
    }
    
    public double getEarnedPoints() {
        return earnedPoints;
    }
    
    public void setEarnedPoints(double earnedPoints) {
        this.earnedPoints = earnedPoints;
    }
}

public class Project extends Assignment {
    
    private boolean groups;
    private boolean presentation;
    
    public Project(String name, String dueDate, double availablePoints, double earnedPoints, boolean hasGroups, boolean hasPresentation) {
        super(name, dueDate, availablePoints, earnedPoints);
        this.groups = hasGroups;
        this.presentation = hasPresentation;
    }
    
    public boolean hasGroups() {
        return groups;
    }
    
    public void setGroups(boolean groups) {
        this.groups = groups;
    }
    
    public boolean hasPresentation() {
        return presentation;
    }
    
    public void setPresentation(boolean presentation) {
        this.presentation = presentation;
    }
}

public class Test extends Assignment {
    
    private String testType;
    public Test(String name, String dueDate, double availablePoints, double earnedPoints, String testType) {
        super(name, dueDate, availablePoints, earnedPoints);
        this.testType = testType;
    }
    
    public String getTestType() {
        return testType;
    }
    
    public void setTestType(String testType) {
        this.testType = testType;
    }
}

import java.util.*;

public class AssignmentRunner {

    public static void main(String[] args) {

        // Start here
        Scanner input = new Scanner(System.in);
        ArrayList<Assignment> assignments = new ArrayList<Assignment>();
        System.out.print("Enter the assignment's name (exit to quit): ");
        String query = input.nextLine();
        
        while (!query.equals("exit")) {
            String name = query;
            System.out.print("Enter the due date: ");
            String dueDate = input.nextLine();
            System.out.print("How many points is the assignment worth? ");
            double availablePoints = input.nextDouble();
            System.out.print("How many points were earned? ");
            double earnedPoints = input.nextDouble();
            input.nextLine();
            
            System.out.print("Is this a (T)est or a (P)roject? ");
            String type = input.nextLine();
            
            if (type.charAt(0) == 'T') {
                
                System.out.println("What type of test is it? ");
                String testType = input.nextLine();
                assignments.add(new Test(name, dueDate, availablePoints , earnedPoints, testType));
            }
            if (type.charAt(0) == 'P') {
                
                System.out.println("Does this project require (true/false) ...");
                System.out.println("Groups? ");
                boolean groups = input.nextBoolean();
                System.out.println("A presentation? ");
                boolean presentation = input.nextBoolean();
                assignments.add(new Project(name, dueDate, availablePoints , earnedPoints, groups, presentation));
                input.nextLine();
            }
            
            System.out.print("Enter the assignment's name (exit to quit): ");
            query = input.nextLine();
        }
        printSummary(assignments);
    }

    // Print due date and score percentage on the assignment
    public static void printSummary(ArrayList<Assignment> assignments) {
        for (Assignment a : assignments) {
            double grade = a.getEarnedPoints() / a.getAvailablePoints() * 100;
            System.out.println(a.getName() + " - " + grade);
        }
    }
}