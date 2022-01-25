import java.util.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
public class ProjectX extends Villain{
    public ProjectX()
    {
        super("ProjectX", 20, 15, 40);
    }
    public void baseHit() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       File file = new File("baseHit.wav");
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
       
       clip.start();
    }
    public void projSound() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       File file = new File("ProjectX.wav");
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
       
       clip.start();
    }
    public void special() throws UnsupportedAudioFileException, LineUnavailableException, IOException{
        System.out.println("Laser beam");
        projSound();
    }
}
