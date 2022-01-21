import java.util.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
public class BlueJay extends Villain {
    private double punchDamage;
    private double kickDamage;
    private double specialDamage;

    public BlueJay(){
        super("BlueJay");
        punchDamage = 20.0;
        specialDamage = 40.0;
        kickDamage = 15.0;
    }
  
  public void special() throws UnsupportedAudioFileException, LineUnavailableException, IOException
  {
        System.out.println("Blue Jay screams");
      kaKaw();
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
