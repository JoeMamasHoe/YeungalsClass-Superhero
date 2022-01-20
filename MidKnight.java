public class MidKnight extends Hero{

    private double punchDamage;
    private double kickDamage;
    private double specialDamage;

    public MidKnight(){
        super("MidKnight");
        punchDamage = 10.0;
        specialDamage = 40.0;
        kickDamage = 20.0;
    }


    public void special() {
        System.out.println("Midknight does big sword slash");
    }

}
