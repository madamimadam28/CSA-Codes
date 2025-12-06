/*For this exercise, you are going to implement the FormFill class. It has a few instance variables that store personal information that you often need to fill in various forms.

Read the method comments for more information.

As you implement these methods, notice that you have to store the result of concatenating multiple Strings or Strings and other primitive types. Concatenation produces a new String object and does not change any of the Strings being concatenated.

Pay close attention to where spaces should go in theString, too.


FormFillTester has already been filled out with some test code. Feel free to change the parameters to print your own made-up information. (Remember, we want to practice computer security safety. Posting your personal contact information is generally not advised, even if only the person sitting next to you can see it!)

When you run the program as written, it should output

Dog, Karel
5/2012
Dog
Email: coolDog@email.com */

public class FormFill
{
    private String fName;
    private String lName;
    private String email;
    private int birthMonth;
    private int birthYear;
    
    
    // Constructor that sets the first and last name
    // The other variables will initialize themselves
    public FormFill(String firstName, String lastName){
        fName = firstName;
        lName = lastName;
    }
    
    // Sets birthMonth and birthyear to the given
    // values
    public void setBirthday(int month, int year){
        birthMonth = month;
        birthYear = year;
    }
    
   
    // Sets the email address
    public void setEmailAddress(String emailAddress){
        email = emailAddress;
    }
    
    // Returns a string with the name formatted like
    // a doctor would write the name on a file
    // 
    // Return string should be formatted 
    // with the last name, then a comma and space, then the first name.
    // For example: LastName, FirstName
    public String fullName(){
        String name = lName + ", " + fName;
        return name;
    }
    
    // Returns basic contact information formatted 
    // like this example:
    // 
    // LastName
    // Email: smith@emailprovider.com
    //
    // Fill in the last name and email address
    // with the instance variables.
    //
    // You will need to use the escape character \n
    // To create a new line in the String
    public String contactInformation(){
        String contact = lName + "\nEmail: " + email;
        return contact;
    }
    
    // Returns a string with the birthday
    // formatted like this:
    // 
    // month/year
    public String birthday(){
        String bday = birthMonth + "/" + birthYear;
        return bday;
    }
    
}

public class FormFillTester
{
    public static void main(String[] args)
    {
        FormFill filler = new FormFill("Karel", "The Dog");
        filler.setBirthday(5, 2012);
        filler.setEmailAddress("coolDog@email.com");
        
        System.out.println(filler.fullName());
        System.out.println(filler.birthday());
        System.out.println(filler.contactInformation());
        
    }
}