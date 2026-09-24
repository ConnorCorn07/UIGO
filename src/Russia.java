import java.util.Random;
import java.util.Scanner;

public class Russia {


    public static void initial(Scanner sysin) throws InterruptedException{

        System.out.println(Colors.TEXT_RED + "Russian Roulette");
        System.out.println(Colors.TEXT_BRIGHT_WHITE + "We will load the bullets in a random order. 5 are blanks. One is not");
        System.out.println(Colors.TEXT_BRIGHT_WHITE + "Every time you pull the trigger, your bet is doubled,");
        System.out.println(Colors.TEXT_BRIGHT_WHITE + "But if the round goes off, your lose 10x your bet");
        Thread.sleep(500);
        System.out.println("Would you like to continue");



        String Choice1 = sysin.nextLine();
        if (Choice1.contains("y")){
            int max = Math.max(1, Main.GetBalance() / 10);
            Misc.getBet(sysin, max);
        } else Main.gamemode(sysin);
    }
}
