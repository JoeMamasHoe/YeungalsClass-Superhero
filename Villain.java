public class Villain extends Fighters{
    private double health;
    private int damage;
    private double arenaDamageMultiplier;
    private String name;

    public Villain(String name, double arenaDamageMultiplier){
        super(false,true);
    }

    public void punch(){
        System.out.println("The villain throws a fierce punch!");
    }

    public void kick(){
        System.out.println("The villain kicks with a mighty force!");
    }

    public void special(){
        System.out.println("The villain uses their special move!");
    }
}
