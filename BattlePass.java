import java.util.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
public class BattlePass
{
  public static void main(String args[])throws UnsupportedAudioFileException, LineUnavailableException, IOException
  {
      Scanner in = new Scanner (System.in);
      p("You enter the merchant's shop.");
      sleep(1000);
      shopTheme();
      sleep(2000);
      p("The walls are lined with foreign items you do not recognize...");
      sleep(2000);
      p("The merchant greets you");
      enterSound();
      sleep(2500);
      p("Press C to continue");
      String key3 = in.next();
      if (key3.equalsIgnoreCase("C"))
      {
        items();
      }
  }
  public static void shopTheme() throws UnsupportedAudioFileException, LineUnavailableException, IOException
  {
     //ryan says hello
     //Scanner in = new Scanner (System.in);
     File file = new File("kelpgtrim.wav"); //temporary sound
     AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
     Clip clip = AudioSystem.getClip();
     clip.open(audioStream);
     
     clip.start();
     
     //String response = in.next();
  }
  public static void enterSound() throws UnsupportedAudioFileException, LineUnavailableException, IOException
  {
     //ryan says hello
     //Scanner in = new Scanner (System.in);
     File file = new File("vineboom.wav"); //temporary sound
     AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
     Clip clip = AudioSystem.getClip();
     clip.open(audioStream);
     
     clip.start();
     
     //String response = in.next();
  }
  public static void sleep(int ms)
  {
     try 
     {
         Thread.sleep(ms);
     }
         catch (InterruptedException e) 
     {
         e.printStackTrace();
     }
  }
  public static void items() throws UnsupportedAudioFileException, LineUnavailableException, IOException
  {
      Scanner in = new Scanner (System.in);
      p("items");
      ArrayList <String> itemList = new ArrayList();
      //itemList.add
      //itemList.add       add items in battle pass here
      //itemList.add
      
      //checks players highest lvl in tower
      
      //adds abilities to Fighter ArrayList based on lvl
      sleep(1000);
      p("The merchant wishes you well...");
      p("Press any key to continue");
      leaveSound();
      String key4 = in.next();
  }
  public static void p(String x)
  {
      System.out.println(x);
  }
  public static void leaveSound() throws UnsupportedAudioFileException, LineUnavailableException, IOException
  {
     //ryan says goodbye 
     //Scanner in = new Scanner (System.in);
     File file = new File("vineboom.wav"); //temporary sound
     AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
     Clip clip = AudioSystem.getClip();
     clip.open(audioStream);
     
     clip.start();
     
     //String response = in.next();
  }
}
