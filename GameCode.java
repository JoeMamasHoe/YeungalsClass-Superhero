import java.util.*;
public class GameCode{
    public static void main(String[] args){
        GameCode game = new GameCode();
        game.playGame();
    }
    ArrayList<Fighters> players = new ArrayList();
    Scanner in = new Scanner(System.in);
    battlePass theBattlePass = new battlePass();
    //Players decieds mode
    public void playGame() {
        System.out.println("Welcome to Yuengle Jungles Battle Ground! Please input a number to deiced what to do.\n1) multiplayer\n2) single player vs CPU");

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
                System.out.println("Turn back while you can.\n1) Try again\n2) Return to menu\n3) Open the battle pass");
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
                System.out.println("1) continue\n2) Return to menu\n3) Open the battle pass");
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
            System.out.println("Something went wrong. I don't want to point fingers, but it was definitely because you didn't follow directions. Lets try that again. Input a integer from 1-3");
            choices(winOrNot);
        }
    }
    static int towerLvl = 0;
    public void towerPassed(){towerLvl++;}
    boolean goOn = true;
    public void cpu() {
        pickCharecter();
        System.out.println("You choose to play as " + players.get(0).getName() + ". Time to see what you got.");
        GustavoFabiano player1 = new GustavoFabiano();
        players.add(player1);
        while (goOn) {
            cpuFight(players.get(0), players.get(1), 1, "You won! You defeated the evil mafia boss Gustavo Fabiano! "
                    + "You show promise but still must prove your self as a true fighter.");
        }
        goOn = true;
        Astarc player2 = new Astarc();
        players.add(player2);
        players.get(0).setHealth(100.0);
        while (goOn) {
            System.out.println("It's time to prove your self... Astrac is a alien known for his spit atack, stay away from his deadly acid and you will be fine. ");
            cpuFight(players.get(0), players.get(2), 2, "You won! You defeated the Astrac! You might be an alright fighter, but lets see how you compare to ProjectX first.");
        }
        goOn = true;
        ProjectX player3 = new ProjectX();
        players.add(player3);
        players.get(0).setHealth(100.0);
        while (goOn) {
            System.out.println("ProjectX is a mutant creature who exscaped from a lab. His special is lazer beams.");
            cpuFight(players.get(0), players.get(3), 3, "You won! You defeated ProjectX, you are now closer to being able to take on the Blue Jay.");
        }
        goOn = true;
        Specter player4 = new Specter();
        players.add(player4);
        players.get(0).setHealth(100.0);
        while (goOn) {
            System.out.println("Time to fight the fastest Ninja you've ever seen. Beware, Specter has some sharp shurikens.");
            cpuFight(players.get(0), players.get(3), 3, "You won! You defeated Specter, time to move on to the next part of your training to prepare you for the Blue Jay." +
                    " You have proven you are worth Yuengels time, and he has agreed to train you."+
                    " You will be pinned against his students to practice.");
        }
        goOn = true;
        DetectiveMatt player5 = new DetectiveMatt();
        players.add(player5);
        players.get(0).setHealth(100.0);
        while (goOn) {
            System.out.println("First up is Detective Matt.");
            cpuFight(players.get(0), players.get(3), 3, "You won! You beat Detective Matt.");
        }
        goOn = true;

    }

    //blue print for cpu fight basically, can be called and will run that battle, returns true if player wins
    public void cpuFight(Fighters player, Fighters cpu, int x, String str){
        if(player.getHealth() > 0 && cpu.getHealth() > 0){System.out.println(cpu.getName() + " has appeared.");}
        player.setHealth(100);cpu.setHealth(100);
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
        if(player.getHealth() > 0){
            System.out.println(str);
            towerPassed();
            choices(true);
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
