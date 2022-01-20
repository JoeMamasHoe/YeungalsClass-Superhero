public class ProjectX extends Villain{
    private double punchDamage;
    private double kickDamage;
    private double specialDamage;

    public ProjectX(){
        super("ProjectX");
        punchDamage = 20.0;
        kickDamage = 15.0;
        specialDamage = 40.0;
    }
    
    public void special(){
        System.out.println("Laser beam");
    }
}
