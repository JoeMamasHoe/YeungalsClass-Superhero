import java.util.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
public class Villain extends Fighters 
{

   public Villain(String name, double punchDam, double kickDam, double spDam){
        super(true,false, name, punchDam, kickDam, spDam);
    }
   
   public void baseHit() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       File file = new File("baseHit.wav");
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
       
       clip.start();
    }
   
   public void punch() throws UnsupportedAudioFileException, LineUnavailableException, IOException
   {
       System.out.println("The villain throws a fierce punch!");
       baseHit();
   }

   public void kick() throws UnsupportedAudioFileException, LineUnavailableException, IOException
   {
       System.out.println("The villain kicks with a mighty force!");
       baseHit();
   }

   public void special() throws UnsupportedAudioFileException, LineUnavailableException, IOException
   {
       System.out.println("The villain uses their special move!");
   }
}
