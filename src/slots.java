import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class slots {
    public static int bet1 = 0;

    public static void initial(Scanner sysin) throws InterruptedException {


        System.out.println(colors.TEXT_BRIGHT_WHITE + "You have picked Slots, are you sure?");

        String Choice2 = sysin.nextLine();
        if (Choice2.equals("y")) {
            slots(sysin, Misc.getBet(sysin));
        } else Main.gamemode(sysin);
    }

    public static void slots(Scanner sysin, int bet) {
           Misc.execBet(bet);
           System.out.println();
           System.out.println(colors.TEXT_BRIGHT_WHITE + "Current bet : " + colors.TEXT_BRIGHT_GREEN + bet + colors.TEXT_BRIGHT_WHITE + " Chips");

           Random random = new Random();
           int[] roll = new int[2];
           for (int i = 0; i <= 3; i++) {
               roll[i] = random.nextInt(0, 3 + 1);
           }




           System.out.println("[][][]");


    }

}
