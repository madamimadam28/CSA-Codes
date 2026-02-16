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

