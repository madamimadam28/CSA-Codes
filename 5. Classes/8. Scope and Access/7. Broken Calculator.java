/* For this exercise, we are going to take a look at an alternate Calculator class, but this one is broken. There are several scope issues in the calculator class that are preventing it from running.

Your task is to fix the Calculator class so that it runs and prints out the correct results. The CalculatorTester is completed and should function correctly once you fix the Calculator class. */

public class Calculator {

    private int total;
    public static int value; // Value is the number stored in memory

    public Calculator(int startingValue){
        total = startingValue;
        value = 0;
    }

    public int add(int x){
        total = total + x;
        return total;
    }

    /**
    * Adds the instance variable value to the total
    */
    public int add(){
        total += value;
        return total;
    }

    public int multiple(int x){
        total *= x;
        return total;
    }

    public void setValue(int x){
        value = x;
    }

    public int getValue(){
        return value;
    }

}

public class CalculatorTester
{
    public static void main(String[] args) {

        System.out.println("Starting at 5");
        Calculator myTi = new Calculator(5);

        System.out.println("Adding 10 ...");
        System.out.print("Should print 15: ");
        System.out.println(myTi.add(10));

        System.out.println("Multiplying by 2 ...");
        System.out.print("Should print 30: ");
        System.out.println(myTi.multiple(2));

        System.out.println("Changing value to 20 ...");
        myTi.setValue(20);
        System.out.print("Adding. Should print 50: ");
        System.out.println(myTi.add());

    }
}