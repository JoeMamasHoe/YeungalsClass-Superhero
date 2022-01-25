import java.util.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
public class Astarc extends Villain{
    public Astarc(){
        super("Astarc", 20, 15, 40);
    }
    public void special() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        System.out.println("Acid spit");
        astarcSound();
    }
    public void baseHit() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       File file = new File("baseHit.wav");
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
       
       clip.start();
    }
    public void astarcSound() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       File file = new File("astarc.wav");
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
       
       clip.start();
    }
}
