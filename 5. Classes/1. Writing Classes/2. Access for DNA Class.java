/* For this exercise, you are going to create 2 instance variables and the structure of the constructor for the DNA class.
DNA objects contain two strings, a rsid and a genotype. Create the instance variables with the appropriate privacy settings. Then create the structure of the constructor to take two parameters to match the instance variables. Make sure you set the privacy settings on the constructor correctly. (You do not need to complete the constructor). */

public class DNA
{
    private String rsid;
    private String genotype;
    
    public DNA(String id, String g) {
        rsid = id;
        genotype = g;
    }
}