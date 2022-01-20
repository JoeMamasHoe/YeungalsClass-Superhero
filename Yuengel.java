public class Yuengel extends Hero{

    private double punchDamage;
    private double kickDamage;
    private double specialDamage;

    public Yuengel(){
        super("Yuengel");
        punchDamage = 25.0;
        specialDamage = 40.0;
        kickDamage = 20.0;
    }

    public void punch(){
        System.out.println("Yuengel throws a fierce punch!");
    }

    public void kick(){
        System.out.println("Yuengel kicks with a mighty force!");
    }

    public void special(){
        System.out.println("GLITCHES");
    }
    
}
