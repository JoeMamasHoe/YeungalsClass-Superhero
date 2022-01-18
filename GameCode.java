import java.util.Scanner;
public class GameCode {
    public static void main(String[] args){
        playGame();
    }
    Scanner in = new Scanner(System.in);
    public static void playGame() {
        System.out.println("Welcome to Yuengel's Juengel: BattleGround! \nIf you Like to play multiplayer, input 1, for single player vs CPU input 2.");

        while(true) {
            Scanner in = new Scanner(System.in);
            int x;
            try{x = in.nextInt();}catch(Exception e){x = 3;}
            if (x == 1) {
                multiPlayer();
                break;
            } else if (x == 2) {
                cpu();
                break;
            } else {
                System.out.println("not a valid imput please try again");
            }
        }
    }

    public static void cpu(){
        pickCharecter();
        System.out.println("Name is " + Yuengel.getName() );
        

    }

    public static void multiPlayer(){

    }

    public static void pickCharecter(){
        System.out.println("Your choices of charecters are: \n" +
                "1) Mr. Yuengel - Jungle\n" +
                "2) Detective Matt - City\n" +
                "3) Space Force - Moon\n" +
                "4) Mr. Robot - City\n" +
                "5) MidKnight - Independent\n" +

                "6) Gustavo Fabiano - City\n" +
                "7) Astarc - Moon\n" +
                "8) Project X - Independent\n"+
                "9) BlueJay - Jungle\n" +
                "10) Specter - independent\n");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        if(choice == 1){Yuengel player1 = new Yuengel();}
        if(choice == 2){DetectiveMatt player1 = new DetectiveMatt();}
        if(choice == 3){SpaceForce player1 = new SpaceForce();}
        if(choice == 4){MrRobot player1 = new MrRobot();}
        if(choice == 5){MidKnight player1 = new MidKnight();}
        if(choice == 6){GustavoFabiano player1 = new GustavoFabiano();}
        if(choice == 7){Astarc player1 = new Astarc();}
        if(choice == 8){ProjectX player1 = new ProjectX();}
        if(choice == 9){BlueJay player1 = new BlueJay();}
        if(choice == 10){Specter player1 = new Specter();}
    }
}
