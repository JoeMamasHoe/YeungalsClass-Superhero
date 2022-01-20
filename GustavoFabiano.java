public class GustavoFabiano extends Villain{

    private double punchDamage;
    private double kickDamage;
    private double specialDamage;

    public GustavoFabiano(){
        super("GustavoFabiano");
        punchDamage = 15.0;
        specialDamage = 40.0;
        kickDamage = 20.0;
    }
    
    public void special(){
        System.out.println("Pulls out tommy gun");
    }
    
}
