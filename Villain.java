import java.util.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
public class Villain extends Fighters{

    public Villain(String name){
        super(false,true, name);
    }

    public void punch() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        System.out.println("The villain throws a fierce punch!");
    }

    public void kick(){
        System.out.println("The villain kicks with a mighty force!");
    }

    public void special() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        System.out.println("The villain uses their special move!");
    }
}
