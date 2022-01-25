import java.util.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
public class GustavoFabiano extends Villain{
    public GustavoFabiano(){
        super("GustavoFabiano", 20, 15, 40);
    }
    public void special() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        System.out.println("Pulls out tommy gun");
        gusSound();
    }
    public void baseHit() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       File file = new File("baseHit.wav");
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
       
       clip.start();
    }
    public void gusSound() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       File file = new File("gusSpecial.wav");
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
       
       clip.start();
    }
}
