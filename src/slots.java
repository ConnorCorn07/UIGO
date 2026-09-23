import java.util.Random;
import java.util.Scanner;

public class slots {

    public static void initial(Scanner sysin) throws InterruptedException {


        System.out.println(colors.TEXT_BRIGHT_WHITE + "You have picked Slots, are you sure?");

        String Choice2 = sysin.nextLine();
        if (Choice2.equals("y")) {
            int bet = Misc.getBet(sysin);
            while (true) {
                if (!slotsGame(sysin, bet)) {
                    break;
                }
            }
        }
        Main.gamemode(sysin);
    }

    public static boolean slotsGame(Scanner sysin, int bet) {
        Misc.execBet(bet);
        System.out.println();
        System.out.println(colors.TEXT_BRIGHT_WHITE + "Balance : " + colors.TEXT_BRIGHT_GREEN + Main.GetBalance() + colors.TEXT_BRIGHT_WHITE + " Chips");
        System.out.println(colors.TEXT_BRIGHT_WHITE + "Current bet : " + colors.TEXT_BRIGHT_GREEN + bet + colors.TEXT_BRIGHT_WHITE + " Chips");

        Random random = new Random();
        int[] roll = new int[3];
        for (int i = 0; i < 3; i++) {
           roll[i] = random.nextInt(0, 3);

        }

        for (int i = 0; i < 3; i++) {
           switch (roll[i]) {
               case 0:
                   System.out.print(colors.TEXT_BRIGHT_RED + "[]");
                   break;
               case 1:
                   System.out.print(colors.TEXT_BRIGHT_GREEN + "[]");
                   break;
               case 2:
                   System.out.print(colors.TEXT_BRIGHT_CYAN + "[]");
                   break;
           }
        }
        System.out.println(colors.TEXT_BRIGHT_WHITE);
        if (roll[0] == roll[1] && roll[1] == roll[2]) {
           System.out.println();
           System.out.println(colors.TEXT_BRIGHT_GREEN + "+" + bet*9 + colors.TEXT_BRIGHT_WHITE + " Chips" );
           Main.AddBalance(bet*9);
           System.out.println("New Balance : " + colors.TEXT_BRIGHT_GREEN + Main.GetBalance() + colors.TEXT_BRIGHT_WHITE + " Chips");
        }

        System.out.println("Press Enter to spin again");
        return sysin.nextLine().isEmpty();

    }

}
