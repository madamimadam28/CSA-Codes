/* For this exercise, we are going to do a variation on our Student class by looking at a StudentTest class. 
The StudentTest class stores math and ELA test scores for a student.

We will then extend this class in the HSStudent class, which will check the math and ELA scores to determine if the student has passed. 
Combined with service hours, the HSStudent class will also check to see if the student has qualified for graduation.

Details for each class are outlined in the starter code for each class.

In the StudentTester class, you will prompt the user for test scores and service hours, then use these to create a HSStudent object. 
After creating the object, print out the results.

Sample Output
Please enter the student name: 
Ryan
Please enter the Math Score:
500
Please enter the ELA Score: 
600
Please enter the Service Hours: 
100
Pass Math? false
Pass ELA? true
Completed Service Hours? true
Ryan has not yet qualified for graduation. */

public class StudentTest {

    private int mathScore;
    private int elaScore;
    private String name;

    public StudentTest(String name, int mathScore, int elaScore){
       this.name = name;
       this.mathScore = mathScore;
       this.elaScore = elaScore;
    }

	public int getMathScore() {
	    return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getElaScore() {
	    return elaScore;
	}

	public void setElaScore(int elaScore) {
		this.elaScore = elaScore;
	}

	public String getName() {
		return name;
	}

}

public class HSStudent extends StudentTest {

    private int serviceHours;

    public HSStudent(String name, int mathScore, int elaScore, int serviceHours){
        super(name, mathScore, elaScore);
        this.serviceHours = serviceHours;
    }

    public int getServiceHours(){
        return serviceHours;
    }

    public void setServiceHours(int serviceHours){
        this.serviceHours = serviceHours;
    }

    // If math score is at least 525, return true
    public boolean passMath(){
        return super.getMathScore() >= 525;
    }

    // If ela score is at least 560, return true
    public boolean passEla(){
        return super.getElaScore() >= 560;
    }

    // If service hours are at least 75, return true
    public boolean completeService(){
        return serviceHours >= 75;
    }

    // If the student has passed math, passed ela, and completed
    // service hours, return true.
    public boolean gradQualify(){
        return passMath() && passEla() && completeService();
    }

    // If the student has qualified for graduation, print:
    // (name) has qualified for graduation.
    // Otherwise print:
    // (name) has not yet qualified for graduation.
    // Where (name) is the student's name.
    public String toString(){
        if (gradQualify()){
            return super.getName() + " has qualified for graduation.";
        }

        return super.getName() + " has not yet qualified for graduation.";
    }
}

import java.util.Scanner;

public class StudentTester
{
    public static void main(String[] args)
    {
        // Prompt the user for name, test scores, and service hours
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int mathScore = input.nextInt();
        int elaScore = input.nextInt();
        int serviceHours = input.nextInt();
        
        // Create a HSStudent object
        HSStudent student = new HSStudent(name, mathScore, elaScore, serviceHours);
        
        // Print the results
        System.out.println("Pass Math? " + student.passMath());
        System.out.println("Pass ELA? " + student.passEla());
        System.out.println("Completed Service Hours? " + student.completeService());
        System.out.println(student);
    }
}