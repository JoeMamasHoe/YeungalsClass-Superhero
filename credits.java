public class Credits
{
    public void main(String args[])
    {
        playCredits();
    }
    public void p(String x)
    {
        System.out.println(x);
    }
    public void sleep(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    public void pn(String x)
    {
        System.out.print(x);
    }
    public void space()
    {
        sleep(150);
        p("");
        sleep(150);
        p("");
        sleep(150);
        p("");
        sleep(150);
    }
    public void bigSpace()
    {
        for (int i = 0; i <= 40; i++)
        {
            p("");
        }
    }
    public void slowBigSpace()
    {
        for (int i = 0; i <= 42; i++)
        {
            p("");
            sleep(100);
        }
    }
    public void playCredits()
    {
        p("credits");
        bigSpace();
        space();
        marco();
        space();
        david();
        space();
        matt();
        space();
        kyle();
        
        slowBigSpace();
        p("                                                                                          Thanks for Playing!");                   
        slowBigSpace();
    }
    public void marco()
    {
        p("Senior Programmer + Voice of Gustavo Fabiano:");
        sleep(150);
        p("");
        sleep(150);
        p("$$\\      $$\\                                               $$$$$$\\                     $$\\                 $$\\ $$\\           ");
        sleep(150);
        p("$$$\\    $$$ |                                              \\_$$  _|                    $$ |                $$ |$$ |          ");
        sleep(150);
        p("$$$$\\  $$$$ | $$$$$$\\   $$$$$$\\   $$$$$$$\\  $$$$$$\\          $$ |   $$$$$$$\\  $$$$$$\\  $$$$$$$\\   $$$$$$\\  $$ |$$ | $$$$$$\\  ");
        sleep(150);
        p("$$\\$$\\$$ $$ | \\____$$\\ $$  __$$\\ $$  _____|$$  __$$\\         $$ |  $$  _____| \\____$$\\ $$  __$$\\ $$  __$$\\ $$ |$$ | \\____$$\\ ");
        sleep(150);
        p("$$ \\$$$  $$ | $$$$$$$ |$$ |  \\__|$$ /      $$ //  $$ |        $$ |  \\$$$$$$\\   $$$$$$$ |$$ |  $$ |$$$$$$$$ |$$ |$$ | $$$$$$$ |");
        sleep(150);
        p("$$ |\\$  //$$ |$$  __$$ |$$ |      $$ |      $$ |  $$ |        $$ |   \\____$$\\ $$  __$$ |$$ |  $$ |$$   ____|$$ |$$ |$$  __$$ |");
        sleep(150);
        p("$$ | \\_// $$ |\\$$$$$$$ |$$ |      \\$$$$$$$\\ \\$$$$$$  |      $$$$$$\\ $$$$$$$  |\\$$$$$$$ |$$$$$$$  |\\$$$$$$$\\ $$ |$$ |\\$$$$$$$ |");
        sleep(150);
        p("\\__|     \\__| \\_______|\\__|       \\_______| \\______//       \\______|\\_______//  \\_______|\\_______//  \\_______|\\__|\\__| \\_______|");
    }
    public void david()
    {
        p("Cyber Security Risk Division + Voice of Mr. Robot and Space Force:");
        sleep(150);
        p("");
        sleep(150);
        p("               ,---.           ,-.-. .=-.-.                          ___    _,.----.                 _,.---._    .-._          _,.---._                     _,---.  ,--.-,,-,--, ");
        sleep(150);
        p("  _,..---._  .--.'  \\   ,--.-./=/ ,//==/_ /_,..---._          .-._ .'=.'\\ .' .' -   \\  _,..---._   ,-.' , -  `. /==/ \\  .-._ ,-.' , -  `.  .--.-. .-.-. _.='.'-,  \\/==/  /|=|  | ");
        sleep(150);
        p("/==/,   -  \\ \\==\\-/\\ \\ /==/, ||=| -|==|, /==/,   -  \\        /==/ \\|==|  /==/  ,  ,-'/==/,   -  \\ /==/_,  ,  - \\|==|, \\/ /, /==/_,  ,  - \\/==/ -|/=/  |/==.'-     /|==|_ ||=|, | ");
        sleep(150);
        p("|==|   _   _\\/==/-|_\\ |\\==\\,  \\ / ,|==|  |==|   _   _\\       |==|,|  / - |==|-   |  .|==|   _   _\\==|   .=.     |==|-  \\|  |==|   .=.     |==| ,||=| -/==/ -   .-' |==| ,|/=| _| ");
        sleep(150);
        p("|==|  .=.   |\\==\\,   - \\==\\ - ' - /==|- |==|  .=.   |       |==|  \\/  , |==|_   `-' \\==|  .=.   |==|_ : ;=:  - |==| ,  | -|==|_ : ;=:  - |==|- | =/  |==|_   /_,-.|==|- `-' _ | ");
        sleep(150);
        p("|==|,|   | -|/==/ -   ,| \\==\\ ,   ||==| ,|==|,|   | -|       |==|- ,   _ |==|   _  , |==|,|   | -|==| , '='     |==| -   _ |==| , '='     |==|,  \\/ - |==|  , \\_.' )==|  _     | ");
        sleep(150);
        p("|==|  '='   /==/-  /\\ - \\|==| -  ,/|==|- |==|  '='   /       |==| _ /\\   \\==\\.       /==|  '='   /\\==\\ -    ,_ /|==|  /\\ , |\\==\\ -    ,_ /|==|-   ,   |==\\-  ,    (|==|   .-. ,\\ ");
        sleep(150);
        p("|==|-,   _`/\\==\\ _.\\=\\.-'\\==\\  _ / /==/. /==|-,   _`/        /==/  / / , /`-.`.___.-'|==|-,   _`/  '.='. -   .' /==/, | |- | '.='. -   .' /==/ , _  .' /==/ _  ,  //==/, //=/  | ");
        sleep(150);
        p("`-.`.____.'  `--`         `--`--'  `--`-``-.`.____.'         `--`./  `--`            `-.`.____.'     `--`--''   `--`./  `--`   `--`--''   `--`..---'   `--`------' `--`-' `-`--` ");
    }
    public void matt()
    {
        p("Software Architect + Voice of Detective Matt:");
        sleep(150);
        p("");
        sleep(150);
        p("  __  __       _   _   _                     ____             _   _      ");
        sleep(150);
        p(" |  \\/  |     | | | | | |                   |  _ \\           | | (_)     ");
        sleep(150);
        p(" | \\  / | __ _| |_| |_| |__   _____      __ | |_) | __ _ _ __| |_ _  ___ ");
        sleep(150);
        p(" | |\\/| |/ _` | __| __| '_ \\ / _ \\ \\ /\\ / / |  _ < / _` | '__| __| |/ _ \\");
        sleep(150);
        p(" | |  | | (_| | |_| |_| | | |  __/\\ V  V /  | |_) | (_| | |  | |_| |  __/");
        sleep(150);
        p(" |_|  |_|\\__,_|\\__|\\__|_| |_|\\___| \\_/\\_/   |____/ \\__,_|_|   \\__|_|\\___|");
        sleep(150);
        p("                                                                         ");
        sleep(150);
        p("                                                                         ");
    }
    public void kyle()
    {
        p("Executive Project Manager + Voice of Blue Jay:");
        sleep(150);
        p("");
        sleep(150);
        p(" _  _  _  _  __    ____        _   _  ____  _  _  ____  _  _ ");
        sleep(150);
        p("( )/ )( \\/ )(  )  ( ___)      ( )_( )( ___)( \\( )(  _ \\( \\/ )");
        sleep(150);
        p(" )  (  \\  /  )(__  )__)        ) _ (  )__)  )  (  )   / \\  / ");
        sleep(150);
        p("(_)\\_) (__) (____)(____)      (_) (_)(____)(_)\\_)(_)\\_) (__) ");
    }
    public void nathanK()
    {
        p("Project Designer:");
        sleep(150);
        p("");
        sleep(150);
        p("");
    }
    public void nateL()
    {
        p("Project Designer:");
        sleep(150);
        p("");
        sleep(150);
        p("");
    }
    public void nath()
    {
        p("Software Engineer + Voice of MidKnight:");
        sleep(150);
        p("");
        sleep(150);
        p("");
    }
    public void Orion()
    {
        p("Project Manager:");
        sleep(150);
        p("");
        sleep(150);
        p("");
    }
    public void Adam()
    {
        p("Unpaid Intern + Voice of Project X + General Nuisance:");
        sleep(150);
        p("");
        sleep(150);
        p("");
    }
    public void Rayna()
    {
        p("Programmer:");
        sleep(150);
        p("");
        sleep(150);
        p("");
    }
    public void Jay()
    {
        p("Project Manager:");
        sleep(150);
        p("");
        sleep(150);
        p("");
    }
    public void Sean()
    {
        p("Programmer:");
        sleep(150);
        p("");
        sleep(150);
        p("");
    }
    public void yuengel()
    {
        p("Juice Box Provider:");
        sleep(150);
        p("");
        sleep(150);
        p("");
    }
    public void ryan()
    {
        p("Voice of The Merchant + General Inspiration to all:");
        sleep(150);
        p("");
        sleep(150);
        p("");
    }
}
