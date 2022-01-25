import java.util.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
public class BlueJay extends Villain {
    public BlueJay(){
        super("BlueJay", 25, 25, 40);
    }
  public void special() throws UnsupportedAudioFileException, LineUnavailableException, IOException
  {
        System.out.println("Blue Jay screams");
      kaKaw();
    }
  public void p(String x)
    {
        System.out.println(x);
    }
   //YOU NEED TO DOWNLOAD THE .WAV FILES FROM THE SOUND FOLDER, INSTRUCTIONS ARE IN THAT FOLDER'S README
  public void kaKaw() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       File file = new File("blueJSpecial.wav");
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
       
       clip.start();
       p("Blue Jay's cry fills the air");
    }
}
