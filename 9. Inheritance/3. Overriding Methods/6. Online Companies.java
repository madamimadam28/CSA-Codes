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
        return super.getName() + "\n" + webAddress;
    }
}

public class CompanyTester
{
    public static void main(String[] args)
    {
        Company c1 = new Company("Widget", "123 Main St", "Springfield", "OH");
        System.out.println(c1);
        
        OnlineCompany c2 = new OnlineCompany("CodeHS", "www.codehs.com");
        System.out.println(c2);
    }
}