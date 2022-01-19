import java.util.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
public class battlePass
{
    public static void main(String args[])throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
      Scanner in = new Scanner (System.in);
      int towerlvl = 0;
      boolean mulroy = false;
      p("You enter the merchant's shop.");
      sleep(1000);
      boolean song = true;
      //while (song)
      //{
      //    shopTheme();
      //}
      sleep(3000);
      p("The walls are lined with foreign items you do not recognize...");
      sleep(3000);
      p("The merchant greets you");
      enterSound();
      sleep(4000);
      while (true)
      {
        p("There are 4 items on the shelf. Press 1-4 to view an item.");
        p("Press 0 to leave the shop");
        int choice = in.nextInt();
        if (choice==1)
        {
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
                sleep(3000);
                p("Level 3 Reward: Locked");
                lockedTxt();
                locked();
                sleep(2000);
            }
        }
        else if(choice==2)
        {
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
                 sleep(3000);
                 p("Level 5 Reward: Locked");
                 lockedTxt();
                 locked();
                 sleep(2000);
            }
        }
        else if(choice==3)
        {
              if (towerlvl >= 8)
              {
                  p("You beat tower level 8!");
                  sleep(1500);
                  p("You unlocked Navy Rum!");
                  ryRum();
                  sleep(10000);
              }
              else
              {
                  sleep(3000);
                  p("Level 8 Reward: Locked");
                  lockedTxt();
                  locked();
                  sleep(2000);
              }
        }
        else if(choice==4)
        {
              if (towerlvl >= 10)
              {
                  p("You beat tower level 10!");
                  sleep(1500);
                  p("You unlocked a Secret  Fighter!");
                  p("Mr. Mulroy is available in the character select screen!");
                  mulroy = true;
                  ryLore4();
                  sleep(7000);
              }
              else
              {
                  sleep(3000);
                  p("Level 10 Reward: Locked");
                  lockedTxt();
                  locked();
                  sleep(2000);
              }
        }
        else if (choice==0)
        {
              sleep(1000);
              p("The merchant wishes you well on your journey...");
              sleep(500);
              song = false;
              leaveSound();
              break;
        }
      }
    }
    public static void lockedTxt()
    {
        p("Progress in the tower to unlock this item");
    }
    public static void ryLore1() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       File file = new File("2ndmonitor.wav"); //temporary sound
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
       
       clip.start();
    }
    public static void ryLore2() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       File file = new File("thanks.wav"); //temporary sound
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
       
       clip.start();
    }
    public static void ryRum() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       File file = new File("rynavyrum.wav"); //temporary sound
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
        
       clip.start();
    }
    public static void ryLore4() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       File file = new File("secretFighter.wav"); //temporary sound
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
        int ran = (int)(Math.random()*3 + 1);
        if(ran==1)
        {
            enter1();
        }
        else if(ran==2)
        {
            enter2();
        }
        else if(ran==3)
        {
            ringding();
        }
    }
    public static void craftNew() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       //ryan says hello
       //Scanner in = new Scanner (System.in);
       File file = new File("craftNew.wav"); //temporary sound
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
       
       clip.start();
       
       //String response = in.next();
       p(" 'I've crafted your new item, shut up.' ");
    }
    public static void ringding() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       //ryan says hello
       //Scanner in = new Scanner (System.in);
       File file = new File("ringding.wav"); //temporary sound
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
       
       clip.start();
        
       //String response = in.next();
       p("The merchant speaks in a tongue you are not familiar with.");
    }
    public static void enter1() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       //ryan says hello
       //Scanner in = new Scanner (System.in);
       File file = new File("enter1.wav"); //temporary sound
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
       
       clip.start();
       
       //String response = in.next();
       p(" 'Welcome to my shop. You can puruse the items, or you can get back to work.' ");
    }
    public static void enter2() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       //ryan says hello
       //Scanner in = new Scanner (System.in);
       File file = new File("enter2.wav"); //temporary sound
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
       
       clip.start();
       
       //String response = in.next();
       p(" 'Hello and welcome to my store, feel free to puruse...the ware..and get back to me... I gotta go work...Iĺl get back to you.' ");
    }
    public static void enter3() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       //ryan says hello
       //Scanner in = new Scanner (System.in);
       File file = new File("ringding.wav"); //temporary sound
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
        
       clip.start();
         
       //String response = in.next();
       p("The merchant speaks in a tongue you are not familiar with.");
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
        int ran = (int)(Math.random()*3 + 1);
        if(ran==1)
        {
            leave2();
        }
        else if(ran==2)
        {
            leave3();
        }
        else if(ran==3)
        {
            backOff();
        }
    }
    public static void locked() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       //ryan says goodbye
       File file = new File("leave1.wav"); //temporary sound
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
       
       clip.start();
       p(" 'That's locked. Get back to work.' ");
    }
    public static void leave2() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       //ryan says goodbye
       File file = new File("leave2.wav"); //temporary sound
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
       
       clip.start();
       p(" 'Please, go annoy someone else.' ");
    }
    public static void leave3() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       //ryan says goodbye
       File file = new File("leave3.wav"); //temporary sound
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
         
       clip.start();
       p(" 'Yes, Goodbye...okay that's enough. That's enough!' ");
    }
    public static void backOff() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       //ryan says goodbye
       File file = new File("backoff.wav"); //temporary sound
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
         
       clip.start();
       p(" 'Just BACK OFF, will ya?!?!' ");
    }
}
