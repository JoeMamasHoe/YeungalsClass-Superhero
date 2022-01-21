import java.util.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
public class Hero extends Fighters
{
    public Hero(String name)
    {
        super(true,false, name);
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
       System.out.println("The hero throws a fierce punch!");
       baseHit();
    }

    public void kick() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        System.out.println("The hero kicks with a mighty force!");
        baseHit();
    }

    public void special() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        System.out.println("The hero uses their special move!");
    }
}
