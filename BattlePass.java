
import java.util.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
public class battlePass
{
  public static void main(String args[])throws UnsupportedAudioFileException, LineUnavailableException, IOException
  {
      int towerlvl = 0;
      boolean mulroy = false;
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
      if (towerlvl >= 3)
      {
          p("You beat tower level 3!");
          sleep(1500);
          p("You unlocked Yuengel's 2nd monitor!");
          ryLore1(); //ry talks about the monitor
          sleep(10000);
      }
      else
      {
          p("Level 3 Reward: Locked");
      }
      if (towerlvl >= 5)
      {
          p("You beat tower level 5!");
          sleep(1500);
          p("You unlocked a free level!");
          towerlvl += 1;
          p("You are now level 6!");
          ryLore2();
          sleep(10000);
      }
      else
      {
          p("Level 5 Reward: Locked");
      }
      if (towerlvl >= 8)
      {
          p("You beat tower level 8!");
          sleep(1500);
          p("You unlocked ");
          ryLore3();
          sleep(10000);
      }
      else
      {
          p("Level 8 Reward: Locked");
      }
      if (towerlvl >= 10)
      {
          p("You beat tower level 10!");
          sleep(1500);
          p("You unlocked a Secret  Fighter!");
          p("Mr. Mulroy is available in the character select screen!");
          mulroy = true;
          ryLore4();
          sleep(10000);
      }
      else
      {
          p("Level 10 Reward: Locked");
      }
      p("Press C to continue");
      String key3 = in.next();
      if (key3.equalsIgnoreCase("C"))
      {
        sleep(1000);
        p("The merchant wishes you well...");
        p("Press any key to continue");
        leaveSound();
      }
  }
  public static void ryLore1() throws UnsupportedAudioFileException, LineUnavailableException, IOException
  {
     File file = new File("vineboom.wav"); //temporary sound
     AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
     Clip clip = AudioSystem.getClip();
     clip.open(audioStream);
     
     clip.start();
  }
  public static void ryLore2() throws UnsupportedAudioFileException, LineUnavailableException, IOException
  {
     File file = new File("vineboom.wav"); //temporary sound
     AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
     Clip clip = AudioSystem.getClip();
     clip.open(audioStream);
     
     clip.start();
  }
  public static void ryLore3() throws UnsupportedAudioFileException, LineUnavailableException, IOException
  {
     File file = new File("vineboom.wav"); //temporary sound
     AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
     Clip clip = AudioSystem.getClip();
     clip.open(audioStream);
     
     clip.start();
  }
  public static void ryLore4() throws UnsupportedAudioFileException, LineUnavailableException, IOException
  {
     File file = new File("vineboom.wav"); //temporary sound
     AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
     Clip clip = AudioSystem.getClip();
     clip.open(audioStream);
     
     clip.start();
  }
  public static void shopTheme() throws UnsupportedAudioFileException, LineUnavailableException, IOException
  {
     File file = new File("kelpgtrim.wav");
     AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
     Clip clip = AudioSystem.getClip();
     clip.open(audioStream);
     
     clip.start();
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
     File file = new File("vineboom.wav"); //temporary sound
     AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
     Clip clip = AudioSystem.getClip();
     clip.open(audioStream);
     
     clip.start();
  }
}
