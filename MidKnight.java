import java.util.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
public class MidKnight extends Hero{
    public MidKnight(){
        super("MidKnight", 10, 20, 40);
    }
    public void special() throws UnsupportedAudioFileException, LineUnavailableException, IOException{
        System.out.println("Midknight does big sword slash");
        midSound();
    }
    public void baseHit() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       File file = new File("baseHit.wav");
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
       
       clip.start();
    }
    public void midSound() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       File file = new File("Mid.wav");
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
       
       clip.start();
    }
}
