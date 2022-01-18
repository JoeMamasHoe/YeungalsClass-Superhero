public class Fighters
{
  private double health;
  private int damage;
  private double arenaDamageMultiplier;
  private String name;
  private boolean isHero;
  private boolean isVillain;
  private String preferredMap;
  private String type;

  public Fighters(boolean isHero, boolean isVillain){
    health = 100.0;
    name = "Default";
    damage = 10;
    arenaDamageMultiplier = 1.0;
    preferredMap = "City";
    type = "Human";
    this.isHero = isHero;
    this.isVillain = isVillain;
  }
  public Fighters(){
    health = 100.0;
    name = "Default";
    damage = 10;
    arenaDamageMultiplier = 1.0;
    preferredMap = "City";
    type = "Human";
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
