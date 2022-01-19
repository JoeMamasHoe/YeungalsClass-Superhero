public class Fighters
{
  private double health;
  private String name;
  private boolean isHero;
  private boolean isVillain;
  private double punchDamage;
  private double kickDamage;
  private double specialDamage;
  private double accuracy;
  private double specialAccuracy;

  public Fighters(boolean isHero, boolean isVillain){
    health = 100.0;
    name = "Default";
    punchDamage = 15.0;
    kickDamage = 20.0;
    specialDamage = 40.0;
    accuracy = 0.2;
    specialAccuracy = 0.5;
    this.isHero = isHero;
    this.isVillain = isVillain;
  }
  public Fighters(){
    health = 100.0;
    name = "Default";
    punchDamage = 15.0;
    kickDamage = 20.0;
    specialDamage = 40.0;
    accuracy = 0.2; 
    specialAccuracy = 0.5; 
    isHero = true;
    isVillain = true;
  }

  public void punch(){
    System.out.println("The fighter throws a fierce punch!");
  }

  public void kick(){
    System.out.println("The fighter kicks with a mighty force!");
  }

  public void special(){
    System.out.println("The fighter uses their special move!");
  }
}
