/* For this exercise, we are going to revisit the Pie superclass that we saw as an example in the last lesson. We have added the PecanPie class, 
which takes the number of slices and a String to indicate the type of syrup used to sweeten the pie (honey, molasses, etc). We also added a getType() method in the Pie class.

For this exercise, you need to create either an Array or an ArrayList and add 3 pies to that list, an ApplePie, a PecanPie, and a third type using the Pie class.

After adding these to your list, loop through and print out the basic information about pies using the getSlices() and getType() method in the pie class.

Sample Output
8 slice Pecan pie
6 slice Apple pie
12 slice Rubarb pie */

public class Pie {

    private String type;
    private int slices;
    
    public Pie (String type, int slices) {
        this.type = type;
        this.slices = slices;
    }
    
    public int getSlices (){
        return slices;
    }
    
    public void eatSlice(){
        slices --;
    }
    
    public String getType(){
        return type;
    }
}

public class ApplePie extends Pie {

    public ApplePie (int slices) 
    {
        super("Apple", slices);
    }
    
    public boolean hasSlice()
    {
        return super.getSlices() > 0;
    }
    
    @Override
    public void eatSlice()
    {
        if (this.hasSlice())
        {
        	super.eatSlice();
        }
    }
}

public class PecanPie extends Pie {
    
    private String syrupType;

    public PecanPie (int slices, String syrupType) 
    {
        super("Pecan", slices);
        this.syrupType = syrupType;
    }
    
    public String getSyrupType()
    {
        return syrupType;
    }
    
}

public class Pie {

    private String type;
    private int slices;
    
    public Pie (String type, int slices) {
        this.type = type;
        this.slices = slices;
    }
    
    public int getSlices (){
        return slices;
    }
    
    public void eatSlice(){
        slices --;
    }
    
    public String getType(){
        return type;
    }
}

import java.util.ArrayList;

public class PieTester
{
    public static void main(String[] args)
    {
        // Start here!
        ArrayList<Pie> pies = new ArrayList<Pie>();
        pies.add(new ApplePie(8));
        pies.add(new PecanPie(6, "Maple"));
        pies.add(new Pie("Pumpkin", 12));
        
        for (Pie pie : pies) {
            System.out.println(pie.getSlices() + " slice " + pie.getType() + " pie");
        }
    }
}