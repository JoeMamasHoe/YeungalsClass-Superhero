import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class GameCode{
    public static void main(String[] args){
        GameCode game = new GameCode();
        game.playGame();
    }
    ArrayList<Fighters> players = new ArrayList();
    Scanner in = new Scanner(System.in);
    //Players decieds mode
    public void playGame() {
        System.out.println("Welcome to Yuengle Jungles Battle Ground! \nIf you Like to play multiplayer, input 1, for single player vs CPU input 2, input 3 to open the battle pass.");

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
            } else if (x == 3) {
                battlePass theBattlePass = new battlePass();
                try {
                    theBattlePass.start();
                } catch (Exception e) {
                    System.out.println("fail");
                    e.printStackTrace();
                }
                break;
            } else {
                System.out.println("not a valid imput please try again");
            }
        }
    }
    //runs cpu campaign
    public void cpu(){
        pickCharecter();
        System.out.println("You choose to play as " + players.get(0).getName() + " he is at " + players.get(0).getHealth());
        players.get(0).setHealth(players.get(0).getHealth()-attack(10, 0.2));
        System.out.println("You choose to play as " + players.get(0).getName() + " he is at " + players.get(0).getHealth());
        players.get(0).setHealth(players.get(0).getHealth()-attack(10, 0.2));
        System.out.println("You choose to play as " + players.get(0).getName() + " he is at " + players.get(0).getHealth());
        players.get(0).setHealth(players.get(0).getHealth()-attack(10, 0.2));
        System.out.println("You choose to play as " + players.get(0).getName() + " he is at " + players.get(0).getHealth());
        players.get(0).setHealth(players.get(0).getHealth()-attack(10, 0.2));
        System.out.println("You choose to play as " + players.get(0).getName() + " he is at " + players.get(0).getHealth());
        players.get(0).setHealth(players.get(0).getHealth()-attack(10, 0.2));
        System.out.println("You choose to play as " + players.get(0).getName() + " he is at " + players.get(0).getHealth());

    }

    //blue print for cpu fight basically, can be called and will run that battle, returns true if player wins
    public boolean cpuFight(Fighters op, Fighters player, Arena place){
        System.out.println("You are at " + players.get(0));
        return true;
    }

    //runs multiplayer game
    public void multiPlayer(){
        System.out.print("Player One choose first. ");
        pickCharecter();
        System.out.println("Player two choose next. ");
        pickCharecter();
        System.out.println("Player One: " + players.get(0).getName() + "\nPlayer Two: " + players.get(1).getName());
    }



    //method that picks charecter and adds to end of array of Fighters object called players to be accessed anywhere
    public void pickCharecter(){
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
        if(choice == 1){Yuengel player1 = new Yuengel();players.add(player1);}
        else if(choice == 2){DetectiveMatt player1 = new DetectiveMatt();players.add(player1);}
        else if(choice == 3){SpaceForce player1 = new SpaceForce();players.add(player1);}
        else if(choice == 4){MrRobot player1 = new MrRobot();players.add(player1);}
        else if(choice == 5){MidKnight player1 = new MidKnight();players.add(player1);}
        else if(choice == 6){GustavoFabiano player1 = new GustavoFabiano();players.add(player1);}
        else if(choice == 7){Astarc player1 = new Astarc();players.add(player1);}
        else if(choice == 8){ProjectX player1 = new ProjectX();players.add(player1);}
        else if(choice == 9){BlueJay player1 = new BlueJay();players.add(player1);}
        else if(choice == 10){Specter player1 = new Specter();players.add(player1);}
        else{Yuengel player1 = new Yuengel();players.add(player1);}
    }
    //calculates attack damage and returns int
    public int attack(double dam, double acc){
        double x = acc * (Math.random());
        if(x>0.05){
            return (int)dam;
        }
        else{
            return 1;
        }
    }
}
