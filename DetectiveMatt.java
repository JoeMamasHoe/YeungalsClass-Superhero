import java.util.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
public class DetectiveMatt extends Hero{

    private double punchDamage;
    private double kickDamage;
    private double specialDamage;

  public DetectiveMatt(){
        super("DetectiveMatt", 15, 15, 40);
    }


    public void punch(){
        System.out.println("Detective Matt throws a weak punch!");
    }

    public void kick(){
        System.out.println("Detective Matt kicks with an insane force!");
    }
    
    public void special() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        System.out.println("Detective Matt takes out a gun");
        mattSound();
    }
    public void baseHit() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       File file = new File("baseHit.wav");
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
       
       clip.start();
    }
    public void mattSound() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       File file = new File("matt.wav");
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
       
       clip.start();
    }
}
