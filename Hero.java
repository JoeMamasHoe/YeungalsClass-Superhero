public class Hero extends Fighters{

    public Hero(String name, double arenaDamageMultiplier){
        
        super(true,false,name);
    }


    
    public String getName(){
        return name;
    }
    public double getHealth(){
        return health;
    }
    public double setHealth(double x){
        health = x;
        return x;
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
