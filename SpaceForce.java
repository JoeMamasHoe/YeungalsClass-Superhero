public class SpaceForce extends Hero{

    private double punchDamage;
    private double kickDamage;
    private double specialDamage;

    public SpaceForce(){
        super("SpaceForce");
        punchDamage = 15.0;
        specialDamage = 40.0;
        kickDamage = 20.0;
    }


    public void punch(){
        System.out.println("SpaceForce throws a crazy punch!");
    }

    public void kick(){
        System.out.println("SpaceForce kicks with a slow force!");
    }
    
    public void special() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        System.out.println("SpaceForce throws Rocket Barrage");
        marineSpecialSound();
    }
    
    //YOU NEED TO DOWNLOAD THE .WAV FILES FROM THE SOUND FOLDER, INSTRUCTIONS ARE IN THAT FOLDER'S README
  public void marineSpecialSound() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
       File file = new File("marineSpecial.wav");
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
       clip.open(audioStream);
       
       clip.start();
    }
    
}
