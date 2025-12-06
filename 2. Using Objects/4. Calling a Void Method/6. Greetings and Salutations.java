/* Write a class called Salutations that prints various greetings and salutations.

The class should have one instance variable, a String called name to represent the person to whom the salutations are directed.

The class should have the following methods

A constructor that takes a String to initialize name with
public void addressLetter()
public void signLetter()
public void addressMemo()
public void signMemo()


addressLetter should print “Dear name“, where name is replaced by the value of the instance variable name
signLetter() should print
”Sincerely,
name”
where name is replaced by the value of the instance variable name
addressMemo should print “To whom it may concern”
signMemo should print
”Best,
name
where name is replaced by the value of the instance variable name */

public class Salutations
{
    // Put your code here
    private String name;
    
    public Salutations(String userName) {
        name = userName;
    }
    
    public void addressLetter() {
        System.out.println("Dear " + name);
    }
    
    public void signLetter() {
        System.out.println("Sincerely, \n" + name);
    }
    
    public void addressMemo() {
        System.out.println("To whom it may concern ");
    }
    
    public void signMemo() {
        System.out.println("Best, \n" + name);
    }
}