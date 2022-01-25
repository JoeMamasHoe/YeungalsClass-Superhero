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
    
    public void special(){
        System.out.println("Detective Matt takes out a gun");
    }
}
