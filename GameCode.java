import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class GameCode{
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        GameCode game = new GameCode();
        game.playGame();
    }
    ArrayList<Fighters> players = new ArrayList();
    Scanner in = new Scanner(System.in);
    battlePass theBattlePass = new battlePass();
    //Players decieds mode
    public void playGame() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        System.out.println("Welcome to Yuengel's Juengel: Death Fight 2! Please input a number to decide what to do.\n1) Quit\n2) single player vs CPU");

        players.clear();
        while(true) {
            Scanner in = new Scanner(System.in);
            int x;
            try{x = in.nextInt();}catch(Exception e){x = 3;}
            if (x == 1) {
                System.exit(01);
                break;
            } else if (x == 2) {
                cpu();
                break;
            } else if (x == 3) {

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
        System.out.println("done");
    }
    //runs cpu campaign
    public void choices(boolean winOrNot) {
        try {
            if (!winOrNot) {
                System.out.println("Turn back while you can.\n1) Try again\n2) Return to menu\n3) Go to Ry's Battle Pass");
                int num = in.nextInt();
                if (num == 1) {
                    goOn = true;
                } else if (num == 2) {
                    playGame();
                } else if (num == 3) {
                    try {
                        theBattlePass.start();
                        choices(false);
                    } catch (Exception e) {
                        System.out.println("fail");
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Please pick a number between 1-3");
                }

            }
            else {
                System.out.println("1) Continue\n2) Return to menu\n3) Go to Ry's Battle Pass");
                int num = in.nextInt();
                if (num == 1) {
                    goOn = false;
                } else if (num == 2) {
                    playGame();
                } else if (num == 3) {
                    try {
                        theBattlePass.start();
                        choices(true);
                    } catch (Exception e) {
                        System.out.println("fail");
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Please pick a number between 1-3");
                }

            }
        }catch(Exception e){
            System.out.println("Something went wrong. I don't want to point fingers, but it was definitely because you didn't follow directions. Lets try that again. Input an integer from 1-3");
            choices(winOrNot);
        }
    }
    static int towerLvl = 0;
    public void towerPassed(){towerLvl++;}
    boolean goOn = true;
    public void cpu() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        pickCharecter();
        System.out.println("You choose to play as " + players.get(0).getName() + ". Time to see what you got.");
        GustavoFabiano player1 = new GustavoFabiano();
        players.add(player1);
        while (goOn) {
            cpuFight(players.get(0), players.get(1), 1, "You won! You defeated the evil Mafia Boss Gustavo Fabiano! "
                    + "You show promise but still must prove yourself as a true fighter.");
        }
        goOn = true;
        Astarc player2 = new Astarc();
        players.add(player2);
        players.get(0).setHealth(100.0);
        while (goOn) {
            System.out.println("It's time to prove your self... Astarc is an alien known for his spit atack, stay away from his deadly acid and you will be fine. ");
            cpuFight(players.get(0), players.get(2), 2, "You won! You defeated Astarc! You might be an alright fighter, but lets see how you compare to ProjectX first.");
        }
        goOn = true;
        ProjectX player3 = new ProjectX();
        players.add(player3);
        players.get(0).setHealth(100.0);
        while (goOn) {
            System.out.println("ProjectX is a mutant creature who exscaped from a lab. He is equipped with Lazers.");
            cpuFight(players.get(0), players.get(3), 3, "You won! You defeated ProjectX, you are now closer to being able to take on the Blue Jay.");
        }
        goOn = true;
        Specter player4 = new Specter();
        players.add(player4);
        players.get(0).setHealth(100.0);
        while (goOn) {
            System.out.println("Time to fight the fastest Ninja you've ever seen. Beware, Specter has some sharp shurikens.");
            cpuFight(players.get(0), players.get(4), 4, "You won! You defeated Specter, time to move on to the next part of your training to prepare you for the Blue Jay." +
                    " You have proven you are worth Yuengel's time, and he has agreed to train you."+
                    " You will be pinned against his students to practice.");
        }
        goOn = true;
        DetectiveMatt player5 = new DetectiveMatt();
        players.add(player5);
        players.get(0).setHealth(100.0);
        while (goOn) {
            System.out.println("First up is Detective Matt. Fun Fact: He can't spell to save his life.");
            cpuFight(players.get(0), players.get(5), 5, "You won! You beat Detective Matt.");
        }
        goOn = true;

        SpaceForce player6 = new SpaceForce();
        players.add(player6);
        players.get(0).setHealth(100.0);
        while (goOn) {
            System.out.println("Well done, time to fight the Space Marine - Space Force.");
            cpuFight(players.get(0), players.get(6), 6, "You won! You beat Space Force.");
        }
        goOn = true;
        MrRobot player7 = new MrRobot();
        players.add(player7);
        players.get(0).setHealth(100.0);
        while (goOn) {
            System.out.println("Next up Mr. Robot, beware, he can turn into a tank.");
            cpuFight(players.get(0), players.get(7), 7, "You won! You have defeated Mr. Robot.");
        }
        goOn = true;
        MidKnight player8 = new MidKnight();
        players.add(player8);
        players.get(0).setHealth(100.0);
        while (goOn) {
            System.out.println("Now time to fight Yuengel's strongest student, Mid Knight.");
            cpuFight(players.get(0), players.get(8), 8, "You won! You beat Mid Knight.");
        }
        goOn = true;
        Yuengel player9 = new Yuengel();
        players.add(player9);
        players.get(0).setHealth(100.0);
        while (goOn) {
            System.out.println("You are almost ready. You must fight Yuengel in order to prove you are ready.");
            cpuFight(players.get(0), players.get(9), 9, "You won. Yuengel says you are ready to take on the Blue Jay.");
        }
        goOn = true;
        BlueJay player10 = new BlueJay();
        players.add(player10);
        players.get(0).setHealth(100.0);
        while (goOn) {
            System.out.println("This is the most important fight yet, good luck.");
            cpuFight(players.get(0), players.get(10), 10, "You won! You defeated the Blue Jay and have proven your self to be a true fighter.");
        }
        goOn = true;
        System.out.println("Would you like to keep fighting or go back to menu?" +
                "\n1) Continue fighting" +
                "\n2) Return to menu");
        int choice = in.nextInt();
        if(choice == 1){
            while(true){
                goOn = true;
                int vs = (int) (Math.random() * 10);
                players.get(0).setHealth(100.0);
                while (goOn) {
                    System.out.println("Time to fight " + players.get(vs).getName() + ". Good luck.");
                    cpuFight(players.get(0), players.get(vs), vs, "You won! You defeated " + players.get(0) + "!");
                }
            }
        }
        else{
            playGame();
        }
    }

    //blue print for cpu fight basically, can be called and will run that battle, returns true if player wins
    public void cpuFight(Fighters player, Fighters cpu, int x, String str) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        if(player.getHealth() > 0 && cpu.getHealth() > 0){System.out.println(cpu.getName() + " has appeared.");}
        player.setHealth(100);cpu.setHealth(100);
        while(player.getHealth() > 0 && cpu.getHealth() > 0){
            System.out.println("It's your turn to attack!");
            chooseAttack(x);
            if(player.getHealth() > 0 && cpu.getHealth() > 0){
                System.out.println("It is " + cpu.getName() + "s turn to attack." );
                int choice = (int)(Math.random()*11 + 1);
                double healthB = player.getHealth();
                if (choice<5) {
                    System.out.println(cpu.getName() + " has chose to punch.");
                    double h;player.setHealth(player.getHealth()-attack(cpu.getPunchDam(), cpu.getAccuracy()));if(player.getHealth()>0){h = player.getHealth();}else{h= 0;}
                    if(player.getHealth() != healthB){System.out.println(cpu.getName() + " has hit you. You are now at " + h + " health.");}
                    else{System.out.println(cpu.getName() + " has missed you. You are still at " + player.getHealth() + " health.");}
                }
                else if(choice<11){
                    System.out.println(cpu.getName() + " has chose to kick.");
                    double h;player.setHealth(player.getHealth()-attack(cpu.getKickDam(), cpu.getAccuracy()));if(player.getHealth()>0){h = player.getHealth();}else{h= 0;}
                    if(player.getHealth() != healthB){System.out.println(cpu.getName() + " has hit you. You are now at " + h + " health.");}
                    else{System.out.println(cpu.getName() + " has missed you. You are still at " + player.getHealth() + " health.");}
                }
                else {
                    System.out.println(cpu.getName() + " has chose to use his special.");
                    cpu.special();
                    double h;player.setHealth(player.getHealth()-attack(cpu.getSpecialDam(), cpu.getAccuracy()));if(player.getHealth()>0){h = player.getHealth();}else{h= 0;}
                    if(player.getHealth() != healthB){System.out.println(cpu.getName() + " has hit you. You are now at " + h + " health.");}
                    else{System.out.println(cpu.getName() + " has missed you. You are still at " + player.getHealth() + " health.");}
                }
            }

        }
        if(player.getHealth() > 0){
            System.out.println(str);
            towerPassed();
            choices(true);
        }
        else if(cpu.getHealth() > 0){
            choices(false);

        }
    }

    int sCharge = 0;
    public void chooseAttack(int x){
        boolean done = false;
        while(!done) {
            System.out.print("You can choose:\n1) punch\n2) kick");
            if(sCharge>2){System.out.println("\n3) special");}else{System.out.println();}
            try {
                int choice = in.nextInt();
                double c = players.get(x).getHealth();
                if (choice == 1){
                    players.get(x).setHealth(players.get(x).getHealth()-attack(players.get(0).getPunchDam(), players.get(0).getAccuracy()));
                    done = true;
                    if(c == players.get(x).getHealth()){System.out.println("Your attack missed.");}else{sCharge++;baseHit();}
                }
                else if(choice == 2){
                    players.get(x).setHealth(players.get(x).getHealth()-attack(players.get(0).getKickDam(), players.get(0).getAccuracy()));
                    done = true;
                    if(c == players.get(x).getHealth()){System.out.println("Your attack missed.");}else{sCharge++;baseHit();}
                }
                else if(choice == 3 && sCharge>2){
                    players.get(0).special();
                    players.get(x).setHealth(players.get(x).getHealth()-attack(players.get(0).getSpecialDam(), players.get(0).getAccuracy()));
                    sCharge=0;
                    if(c == players.get(x).getHealth()){System.out.println("Your attack missed.");}else{baseHit();}
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


    public void baseHit() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        File file = new File("baseHit.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        clip.start();
    }

}
