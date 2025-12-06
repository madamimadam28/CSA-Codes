public class Executable
{
    // Instance variables
    private String name;
    private int numLines;
    
    // Constructor
    public Executable(String programName)
    {
        System.out.println("Creating a program!");
        name = programName;
    }
    
    // Instance Method
    // Increases numLines everytime a statement is executed
    public void executeStatement()
    {
        System.out.print(name);
        System.out.println(" is executing a statement!");
        
        numLines++;
    }
    
    // Print the number of lines executed
    public void printProgress()
    {
        System.out.print(name);
        System.out.print(" has successfully executed " );
        System.out.print(numLines);
        System.out.println(" lines of code!");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        // This program shows exactly how the statements in a
        // program are executed
        // Run this program 
        // Then carefully examine the output to see what lines
        // were printed and where they came from!
        
        System.out.println("Beginning main method");
        
        Executable prog = new Executable("tracer");
        
        System.out.println("Back in main after creating an object");
        
        prog.executeStatement();
        System.out.println("Back in main");
        prog.executeStatement();
        System.out.println("And back in main yet again");
        
        prog.printProgress();
        
        System.out.println("Ending main method");
        
    }
}