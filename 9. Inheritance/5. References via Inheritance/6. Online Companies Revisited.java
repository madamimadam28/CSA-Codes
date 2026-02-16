/* For this problem, we are going to revisit the Online Company exercise from lesson 3. 
In lesson 3, we created 3 classes, a superclass Company, a subclass OnlineCompany and a runner class CompanyTester. 
You can take your solutions from lesson 3 for the Company and OnlineCompany, but we are going to redesign the CompanyTester in this exercise.

Your task is to create a loop that will allow users to enter companies that will then get stored in an ArrayList. 
You should first prompt users for the company name. If the user enters exit, then the program should exit and print the object using the toString.

After prompting for the name, you prompt the user if it is an online company. 
If so, ask for a website address, otherwise ask for the street address, city, and state. 
You will then create the Company or OnlineCompany object and insert it into the ArrayList.

Note: To pass the autograder, make sure your first prompts end with a quit:.

Sample output:
Please enter a company name, enter 'exit' to quit: CodeHS
Is this an online company, 'yes' or 'no': yes
Please enter the website address: www.codehs.com
Please enter a company name, enter 'exit' to quit: Uber
Is this an online company, 'yes' or 'no': no
Please enter the street address: 555 Market Street
Please enter the city: San Fransisco
Please enter the state: CA
Please enter a company name, enter 'exit' to quit: exit

CodeHS
Website: www.codehs.com

Uber
555 Market Street
San Fransisco, CA */

public class Company {
    
    private String name;
    private String streetAddress;
    private String city;
    private String state;

    // Set missing values to null
    public Company(String name){
        this.name = name;
        this.streetAddress = null;
        this.city = null;
        this.state = null;
    }
    

    public Company(String name, String streetAddress, String city, String state){
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
    }

    public String getName(){
        return name;
    }

    /**
    * Example output:
    * 123 Main St
    * Springfield, OH
    */
    public String address(){
        return streetAddress + "\n" + city + ", " + state;
    }

    /**
    * Example output:
    * Widget Company
    * 123 Main St
    * Springfield, OH
    */
    public String toString(){
        return name + "\n" + address();
    }
}

public class OnlineCompany extends Company{

    private String webAddress;

    public OnlineCompany(String name, String webAddress){
        super(name);
        this.webAddress = webAddress;
    }

    //Return the website address

    public String address(){
        return webAddress;
    }

    /**
    * Remember To get name from superclass, use super.getName()
    * 
    * Example Output:
    * CodeHS
    * www.codehs.com
    */
    
    public String toString(){
        return super.getName() + "\n Website:" + webAddress;
    }
}

import java.util.*;

public class CompanyTester
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        ArrayList<Company> companies = new ArrayList<Company>();
        
        System.out.print("Please enter a company name, enter 'exit' to quit: ");
        String query = input.nextLine();
        
        while (!query.equals("exit")) {
            String name = query;
            
            System.out.print("Is this an online company, 'yes' or 'no': ");
            String isOnline = input.nextLine();
            
            if (isOnline.equals("yes")) {
                
                System.out.println("Please enter the website address: ");
                String webAddress = input.nextLine();
                companies.add(new OnlineCompany(name, webAddress));
            }
            if (isOnline.equals("no")) {
                
                System.out.println("Please enter the street address: ");
                String streetAddress = input.nextLine();
                System.out.println("Please enter the city: ");
                String city = input.nextLine();
                System.out.println("Please enter the state: ");
                String state = input.nextLine();
                companies.add(new Company(name, streetAddress, city, state));
            }
            
            System.out.print("Please enter a company name, enter 'exit' to quit: ");
            query = input.nextLine();
        }
        
        for (Company company : companies) {
            System.out.println(company);
        }
    }
}