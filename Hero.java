public class Hero extends Fighters{

    private double health;
    private int damage;
    private double arenaDamageMultiplier;
    private String name;

    public Hero(String name, double arenaDamageMultiplier){
        super(true,false);
    }

    public void punch(){
        System.out.println("The hero throws a fierce punch!");
    }

    public void kick(){
        System.out.println("The hero kicks with a mighty force!");
    }

    public void special(){
        System.out.println("The hero uses their special move!");
    }
  
}
