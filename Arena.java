public class Arena
{
    private int temp;
    private String type;
    private boolean hasGravity;
    private boolean hasTrees;
    private boolean hasCars;

    public Arena()
    {
    }
    
    public Arena(int temp, String type, boolean hasGravity, boolean hasTrees, boolean hasCars)
    {
        
    }
    
    public void distraction()
    {
        System.out.println("Fighter gets hit");
    }
    
    public int getTemp()
    {
        return temp;
    }
    
    public void setTemp(int x)
    {
        temp = x;
    }
    
    public String getType()
    {
        return type;
    }
    
    public void setType(String y)
    {
        type = y;
    }
    public String getGravity()
    {
        return hasGravity;
    }
    
    public void setGravity(boolean y)
    {
        hasGravity = y;
    }
    
    public String getTrees()
    {
        return hasTrees;
    }
    
    public void setTrees(boolean y)
    {
        hasTrees = y;
    }
    
    public String getCars()
    {
        return hasCars;
    }
    
    public void setCars(boolean y)
    {
        hasCars = y;
    }
    

}
