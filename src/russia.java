import java.util.Random;
import java.util.Scanner;

public class russia {


    public static void initial(Scanner sysin) throws InterruptedException{

        System.out.println(colors.TEXT_RED + "Russian Roulette");
        System.out.println(colors.TEXT_BRIGHT_WHITE + "We will load the bullets in a random order. 5 are blanks. One is not");
        System.out.println(colors.TEXT_BRIGHT_WHITE + "Every time you pull the trigger, your bet is doubled,");
        System.out.println(colors.TEXT_BRIGHT_WHITE + "But if the round goes off, your lose 10x your bet");
        Thread.sleep(500);
        System.out.println("Would you like to continue");



        String Choice1 = sysin.nextLine();
        if (Choice1.contains("y")){

            Misc.getBet(sysin, Main.GetBalance() / 10);
        } else Main.gamemode(sysin);
    }
}
