 public class battlePass
{
  public void main(String args[])
  {
      p("You enter the merchant's shop.");
      sleep(1000);
      p("The walls are lined with foreign items you do not recognize...");
      sleep(1000);
      p("The merchant greets you");
      sleep(2000);
      enterSound();
      items();
      
  }
  public void sleep(int ms)
  {
    try 
    {
        Thread.sleep(ms); //2 secs
    }
    catch (InterruptedException e) 
    {
        e.printStackTrace();
    }
  }
  public void items()
  {
      ArrayList <String> itemList = new ArrayList();
      //itemList.add
      //itemList.add       add items in battle pass here
      //itemList.add
      
      //checks players highest lvl in tower
      
      //adds abilities to Fighter ArrayList based on lvl
      
      leaveSound();
  }
  public void p(String x)
  {
      System.out.println(x);
  }
  public void enterSound
  {
     //ryan welcomes you to the battle pass
  }
  public void leaveSound
  {
    //ryan says goodbye 
  }
}
