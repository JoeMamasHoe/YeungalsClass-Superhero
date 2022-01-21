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
        System.out.println("You choose to play as " + players.get(0).getName() + ".");
        GustavoFabiano player1 = new GustavoFabiano();players.add(player1);
        while (true){
            if(cpuFight(players.get(0), players.get(1), 1))
            {
                System.out.println("You won! You defeated the evil mafia boss Gustavo Fabiano! You show promise but still must prove your self as a true fighter.");
                break;
            }
            else{
                System.out.println("you suck, that was level 1... you lost the easy battle. you stand no chance." +
                        "turn back while you can.\n1) turn back (choose this becuase you suck)\n2) try again");
                int x = in.nextInt();
                if(x==1){
                    playGame();
                }
            }
        }
        Astarc player2 = new Astarc();players.add(player2);
        players.get(0).setHealth(100.0);
        while (true){
            System.out.println("time to prove your self blah blah blah.. somthing written here ");
            if(cpuFight(players.get(0), players.get(2), 2))
            {
                System.out.println("You won! You defeated the defult text! blah blah still in wrok .");
                break;
            }
            else{
                System.out.println("you suck proably idk" +
                        "turn back while you can.\n1) quit \n2) try again");
                int x = in.nextInt();
                if(x==1){
                    playGame();
                }
            }
        }


    }

    //blue print for cpu fight basically, can be called and will run that battle, returns true if player wins
    public boolean cpuFight(Fighters player, Fighters cpu, int x){
        System.out.println(cpu.getName() + " has appeared.");
        while(player.getHealth() > 0 && cpu.getHealth() > 0){
            System.out.println("It's your turn to attack!");
            chooseAttack(x);
            if(player.getHealth() > 0 && cpu.getHealth() > 0){
                System.out.println("It is " + cpu.getName() + "s turn to attack." );
                int choice = (int)(Math.random()*3 + 1);
                double healthB = player.getHealth();
                if (choice == 1) {
                    System.out.println(cpu.getName() + " has chose to punch.");
                    double h;player.setHealth(player.getHealth()-attack(cpu.getPunchDam(), cpu.getAccuracy()));if(player.getHealth()>0){h = player.getHealth();}else{h= 0;}
                    if(player.getHealth() != healthB){System.out.println(cpu.getName() + " has hit you. You are now at " + h + " health.");}
                    else{System.out.println(cpu.getName() + " has missed you. You are still at " + player.getHealth() + " health.");}
                }
                else if(choice == 2){
                    System.out.println(cpu.getName() + " has chose to kick.");
                    player.setHealth(player.getHealth()-attack(cpu.getKickDam(), cpu.getAccuracy()));
                    double h;player.setHealth(player.getHealth()-attack(cpu.getPunchDam(), cpu.getAccuracy()));if(player.getHealth()>0){h = player.getHealth();}else{h= 0;}
                    if(player.getHealth() != healthB){System.out.println(cpu.getName() + " has hit you. You are now at " + h + " health.");}
                    else{System.out.println(cpu.getName() + " has missed you. You are still at " + player.getHealth() + " health.");}
                }
                else if(choice == 3){
                    System.out.println(cpu.getName() + " has chose to use his special.");
                    cpu.special();
                    player.setHealth(player.getHealth()-attack(cpu.getSpecialDam(), cpu.getAccuracy()));
                    double h;player.setHealth(player.getHealth()-attack(cpu.getPunchDam(), cpu.getAccuracy()));if(player.getHealth()>0){h = player.getHealth();}else{h= 0;}
                    if(player.getHealth() != healthB){System.out.println(cpu.getName() + " has hit you. You are now at " + h + " health.");}
                    else{System.out.println(cpu.getName() + " has missed you. You are still at " + player.getHealth() + " health.");}
                }
            }

        }
        if(cpu.getHealth() > 0){
            return false;
        }
        else{
            return true;
        }
    }

    public void chooseAttack(int x){
        boolean done = false;
        while(!done) {
            System.out.println("You can choose:\n1) punch\n2) kick\n3) special");
            try {
                int choice = in.nextInt();
                if (choice == 1) {
                    players.get(x).setHealth(players.get(x).getHealth()-attack(players.get(0).getPunchDam(), players.get(0).getAccuracy()));
                    done = true;
                }
                else if(choice == 2){
                    players.get(x).setHealth(players.get(x).getHealth()-attack(players.get(0).getKickDam(), players.get(0).getAccuracy()));
                    done = true;
                }
                else if(choice == 3){
                    players.get(0).special();
                    players.get(x).setHealth(players.get(x).getHealth()-attack(players.get(0).getSpecialDam(), players.get(0).getAccuracy()));
                    done = true;
                }
                else{
                    System.out.println("Thats not a valid choice.");
                }
                if(players.get(x).getHealth() > 0){
                    System.out.println(players.get(x).getName() + " is at " + players.get(x).getHealth() + " health.");
                }
                else{
                    System.out.println(players.get(x).getName() + " was knocked out.");
                }
            }catch (Exception e){
                System.out.println("Thats not a valid option.");
            }

        }
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
            return 0;
        }
    }
}

