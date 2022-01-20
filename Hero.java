public class Hero extends Fighters{

    public Hero(String name){

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
