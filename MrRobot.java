public class MrRobot extends Hero{

    private double punchDamage;
    private double kickDamage;
    private double specialDamage;

    public MrRobot(){
        super("MrRobot");
        punchDamage = 25.0;
        specialDamage = 40.0;
        kickDamage = 5.0;
    }
    public void punch(){
        System.out.println("MrRobot throws a little punch!");
    }

    public void kick(){
        System.out.println("MrRobot kicks with a fierce force!");
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
