public class DetectiveMatt extends Hero{

    private double punchDamage;
    private double kickDamage;
    private double specialDamage;

    public DetectiveMatt(){
        super("DetectiveMatt");
        punchDamage = 10.0;
        specialDamage = 40.0;
        kickDamage = 15.0;
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
