/* For this exercise, you will be completing the Account class, which simulates a regular bank account. 
Then you will use overrides and calls to the superclass to create a StudentAccount.

Student accounts differ from regular accounts in that they get a 10% bonus for every deposit, but a $1.50 fee for every withdrawal. 
For instance, if you deposit $1.00 into a student account, your balance actually grows by $1.10 ($0.10 is 10% of $1.00). 
Likewise, if you withdraw $1.00, your balance actually shrinks by $2.50.

You will override the methods in the StudentAccount by calling the superclass methods with the additonal amount or fee incorporated since 
the balance is not directly stored in the StudentAccount object.

You will also update the toString, as outlined in the comments.

When completed, create one student account and one regular account for testing. Deposit and withdraw money and print the results. */

public class Account
{
    private int accountNumber;
    private double balance;
    
    // Initialize values in constructor
    public Account(int accountNumber, double openingBal){
        this.accountNumber = accountNumber;
        this.balance = openingBal;
    }
    
    // Complete the accessor method
    public double getBalance(){
        return balance;
        
    }
    
    // Add amount to balance
    public void deposit(double amount){
        balance += amount;
        
    }
    
    // Subtract amount from balance
    public void withdraw(double amount){
        balance -= amount;
        
    }
    
    // Should read: Regular account current balance $__.__
    public String toString(){
        return "Regular account current balance $" + balance;
       
    }
}

public class StudentAccount extends Account
{
    // Complete this class with Override methods.   
    
    public StudentAccount(int accountNumber, double openingBal){
        super(accountNumber, openingBal);
    }
    
    // Students get a 10% bonus on depositing
    public void deposit(double amount){
        super.deposit(amount * 1.10);
        
    }
    
    // Students pay a $1.50 fee for withdrawing
    public void withdraw(double amount){
        super.withdraw(amount + 1.50);
        
    }
    
    // toString() Should read: Student account current balance $__.__
    public String toString(){
        return "Student account current balance $" + super.getBalance();
       
    }
}

public class BankTester
{
    public static void main(String[] args)
    {
        // Test both of your classes
        // Make sure you call every method you wrote!
        Account a1 = new Account(123456, 10);
        StudentAccount a2 = new StudentAccount(12345678, 20);
        
        System.out.println(a1);
        System.out.println(a2);
    }
}