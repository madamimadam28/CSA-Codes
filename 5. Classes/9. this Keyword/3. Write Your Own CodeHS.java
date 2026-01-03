/* We have constructed an Exercise Class for you.

There is an issue with the code’s constructor function! The issue has to do with the usage of the Java keyword this.

Your job is to fix the problem.

Hint: Remember shadowing? */

public class Exercise
{
    public String name;
    public String programmingLanguage;
    public int points;
    public int difficulty; // scale of 1 - 5
    
    // Default constructor.
    public Exercise() 
    {
        name = "Hello World";
        programmingLanguage = "Java";
        points = 10;
        difficulty = 3;
    }
    
    // Edit code in this constructor.
    public Exercise(String name, String programmingLanguage, int points, int difficulty) 
    {
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.points =  points;
        this.difficulty = difficulty;
    }
    
    public String getName() {
        return name;
    }
}

public class ExerciseTester
{
    public static void main(String[] args)
    {
        Exercise exercise1 = new Exercise();
        Exercise exercise2 = new Exercise("Iteration Iteration Iteration", "Java", 45, 5);
        
        System.out.println(exercise1.getName());
        System.out.println(exercise2.getName());
    }
}