import java.util.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
public class MrRobot extends Hero{

    public MrRobot(){
        super("MrRobot", 20, 15, 40);
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
        System.out.println("MrRobot throws a little punch!");
        baseHit();
    }

    public void kick() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        System.out.println("MrRobot kicks with a fierce force!");
        baseHit();
    }
    
    public void special() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        System.out.println("Mr. Robot transforms into a tank");
        robotSpecialSound();
    }
    public static void robotSpecialSound() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       File file = new File("robotSpecial.wav"); 
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
       
       clip.start();
    }
}
