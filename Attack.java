import java.util.*;
public class Attack2
{
    // Each attack will have several factor that effect the amount of damage they do
    // Accuracy, Base Damage, Arena Based, place holders, speed
    Random rand = new Random();
    double dmg;
    public int attack(double accu, int baseDmgAtt, int baseDmg, int arenaDmg, int speed)
    {
        int random1 = rand.nextInt(10);
        if (random1 <= speed)
        {
            int random2 = rand.nextInt(30);
            if (random2 <= speed)
            {
                //attack twice
                int random3 = rand.nextInt(10);
                if (random3 <= accu)
                {
                    dmg = baseDmg * arenaDmg * baseDmgAtt * 2;
                }
                else
                {
                    dmg = 0;
                }
            }
            else
            {
                int random3 = rand.nextInt(10);
                if (random3 <= accu)
                {
                    dmg = baseDmg * arenaDmg * baseDmgAtt;
                }
                else
                {
                    dmg = 0;
                }
            }
        }
        else
        {
            dmg = 0;
        }
        return (int) dmg;
    }
    public static void p(String x)
    //use "p("")" format to print
    {
        System.out.println(x);
    }
}

