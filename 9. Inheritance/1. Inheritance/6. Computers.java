/* For this exercise, you are going to design 3 classes:

Computer - Superclass
Laptop - Subclass
Desktop - Subclass
You will design these classes to optimize the superclass/subclass relationship by creating instance variables and getter/setter methods.

Include the following instance variables:

int screenSize - Inches of monitor space
int memory - GB of ram
double batteryLife - Hours of battery life
boolean monitor - Whether or not a monitor is included
Each class should have at least one variable in it.

Once completed, the Tester class should execute without error. */

public class Computer
{

    private int screenSize;
    private int memory;
    
    public int getScreenSize() {
        return screenSize;
    }
    
    public void setScreenSize(int x) {
        screenSize = x;
    }
    
    public int getMemory() {
        return memory;
    }
    
    public void setMemory(int x) {
        memory = x;
    }
}

public class Desktop extends Computer
{
    
    private boolean monitor;
    
    public boolean getMonitor() {
        return monitor;
    }
    
    public void setMonitor(boolean x) {
        monitor = x;
    }
}

public class Laptop extends Computer
{
   
    private double batteryLife;
    
    public double getBatteryLife() {
        return batteryLife;
    }
    
    public void setBatteryLife(double x) {
        batteryLife = x;
    }
}

public class ComputerTester
{
    public static void main(String[] args)
    {
        Laptop macBook = new Laptop();
        macBook.setBatteryLife(8.5);
        macBook.setMemory(4);
        
        Desktop dell = new Desktop();
        dell.setScreenSize(18);
        
        Computer surface = new Computer();
        surface.setScreenSize(11);
        surface.setMemory(8);
        
        System.out.println(macBook.getBatteryLife());
        System.out.println(macBook.getMemory());
        System.out.println(dell.getScreenSize());
        System.out.println(surface.getScreenSize());
        System.out.println(surface.getMemory());
    }
}