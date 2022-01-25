import java.util.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
public class Specter extends Villain
{
  public Specter(){
      super("Specter", 20, 15, 40);
  }
  public void specSound() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       File file = new File("specter.wav");
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
       
       clip.start();
    }
  public void special() throws UnsupportedAudioFileException, LineUnavailableException, IOException
  {
        System.out.println("Specter makes a Shuriken");
        specSound();
    }
}
