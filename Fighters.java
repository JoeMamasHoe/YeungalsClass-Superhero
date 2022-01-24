import java.util.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
public class Fighters 
{
  private double health;
  private String name;
  private boolean isHero;
  private boolean isVillain;
  private double punchDamage;
  private double kickDamage;
  private double specialDamage;
  private double accuracy;
  private double specialAccuracy;

  public Fighters(boolean isHero, boolean isVillain, String name){
    health = 100.0;
    this.name = name;
    punchDamage = 15.0;
    kickDamage = 20.0;
    specialDamage = 40.0;
    accuracy = 0.2;
    specialAccuracy = 0.5;
    this.isHero = isHero;
    this.isVillain = isVillain;
  }
  
  public void baseHit() throws UnsupportedAudioFileException, LineUnavailableException, IOException
  {
     File file = new File("baseHit.wav");
     AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
     Clip clip = AudioSystem.getClip();
     clip.open(audioStream);
       
     clip.start();
  }
  
  public Fighters() throws UnsupportedAudioFileException, LineUnavailableException, IOException
  {
    health = 100.0;
    name = "Default";
    punchDamage = 15.0;
    kickDamage = 20.0;
    specialDamage = 40.0;
    accuracy = 0.2; 
    specialAccuracy = 0.5; 
    isHero = true;
    isVillain = true;
  }

  public double getAccuracy(){return accuracy;}
  public String getName(){
    return name;
  }
  public double getHealth(){
    return health;
  }
  public double setHealth(double x){
    health = x;
    return x;
  } 
  public double getPunchDam(){
    return punchDamage;
  }
  public double getKickDam(){
    return kickDamage;
  }
  public double getSpecialDam(){
    return specialDamage;
  }
  public void punch() throws UnsupportedAudioFileException, LineUnavailableException, IOException
  {
    System.out.println("The fighter throws a fierce punch!");
    baseHit();
  }

  public void kick() throws UnsupportedAudioFileException, LineUnavailableException, IOException
  {
    System.out.println("The fighter kicks with a mighty force!");
    baseHit();
  }

  public void special() throws UnsupportedAudioFileException, LineUnavailableException, IOException
  {
    System.out.println("The fighter uses their special move!");
  }
}
