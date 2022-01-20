public class BlueJay extends Villain {
    private double punchDamage;
    private double kickDamage;
    private double specialDamage;

    public BlueJay(){
        super("BlueJay");
        punchDamage = 20.0;
        specialDamage = 40.0;
        kickDamage = 15.0;
    }
  
  public void special(){
        System.out.println("Blue Jay screams");
    }
}
